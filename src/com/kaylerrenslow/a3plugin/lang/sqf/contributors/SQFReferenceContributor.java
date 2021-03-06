package com.kaylerrenslow.a3plugin.lang.sqf.contributors;

import com.intellij.openapi.module.Module;
import com.intellij.openapi.util.TextRange;
import com.intellij.patterns.ElementPattern;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.psi.*;
import com.intellij.util.ProcessingContext;
import com.kaylerrenslow.a3plugin.lang.shared.PsiUtil;
import com.kaylerrenslow.a3plugin.lang.shared.stringtable.StringTable;
import com.kaylerrenslow.a3plugin.lang.shared.stringtable.StringtableKey;
import com.kaylerrenslow.a3plugin.lang.sqf.psi.*;
import com.kaylerrenslow.a3plugin.lang.sqf.psi.references.SQFFormatStringArgReference;
import com.kaylerrenslow.a3plugin.lang.sqf.psi.references.SQFStringTableKeyReference;
import com.kaylerrenslow.a3plugin.lang.sqf.psi.references.SQFVariableReference;
import com.kaylerrenslow.a3plugin.project.ArmaProjectDataManager;
import com.kaylerrenslow.a3plugin.util.PluginUtil;
import org.jetbrains.annotations.NotNull;

import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Registers to Intellij which references provider implementations are for SQF language
 *
 * @author Kayler
 * @since 03/20/2016
 */
public class SQFReferenceContributor extends PsiReferenceContributor {
	@Override
	public void registerReferenceProviders(@NotNull PsiReferenceRegistrar registrar) {
		registrar.registerReferenceProvider(PlatformPatterns.psiElement(SQFVariable.class), new SQFVariableReferenceProvider());
		registrar.registerReferenceProvider(PlatformPatterns.psiElement(SQFString.class), new SQFStringtableStringReferenceProvider());

		//@formatter:off
		//look for format["%1"]
		ElementPattern<SQFString> formatStringPattern = PlatformPatterns.psiElement(SQFString.class)
				.withAncestor(3, PlatformPatterns.psiElement(SQFArrayVal.class)
						.withAncestor(2, PlatformPatterns.psiElement(SQFCommandExpression.class)
								.withFirstChild(PlatformPatterns.psiElement(SQFCommand.class).withText("format")))
				);

		//@formatter:on
		registrar.registerReferenceProvider(formatStringPattern, new FormatStringPsiReferenceProvider());
	}

	private static class FormatStringPsiReferenceProvider extends PsiReferenceProvider {
		private static final Pattern pattern = Pattern.compile("[%]{0}(%[0-9]+)|[%]{2}(%[0-9]+)"); //don't match %%1 because percent is cancelled, but you can match %%%1 or %1

		@NotNull
		@Override
		public PsiReference[] getReferencesByElement(@NotNull PsiElement element, @NotNull ProcessingContext context) {
			SQFString formatString = (SQFString) element;
			SQFArrayVal arrayVal = PsiUtil.getFirstAncestorOfType(element, SQFArrayVal.class, null);
			if (arrayVal == null) {
				throw new IllegalStateException("arrayVal shouldn't be null for this reference provider");
			}
			if (!formatString.getText().contains("%")) {
				return PsiReference.EMPTY_ARRAY;
			}
			Matcher matcher = pattern.matcher(formatString.getText());
			LinkedList<PsiReference> references = new LinkedList<>();
			int argNum; //argument number in format string (e.g. 1 from '%1' or 20 from '%20')
			int start; //start text range in format string for the argument number
			int end; //end text range in format string for the argument number
			int groupNum; //matched group
			while (matcher.find()) {
				if (matcher.group(1) == null) {
					groupNum = 2;
				} else {
					groupNum = 1;
				}
				argNum = Integer.parseInt(matcher.group(groupNum).substring(1));
				start = matcher.start(groupNum);
				end = matcher.end(groupNum);
				if (argNum >= arrayVal.getArrayEntryList().size()) {
					continue;
				}
				references.add(new SQFFormatStringArgReference(formatString, TextRange.create(start, end), arrayVal.getArrayEntryList().get(argNum)));
			}
			return references.toArray(new PsiReference[references.size()]);
		}
	}

	private static class SQFStringtableStringReferenceProvider extends PsiReferenceProvider {
		@NotNull
		@Override
		public PsiReference[] getReferencesByElement(@NotNull PsiElement element, @NotNull ProcessingContext context) {
			SQFString string = (SQFString) element;
			Module m = PluginUtil.getModuleForPsiFile(element.getContainingFile());
			if (m == null) {
				return PsiReference.EMPTY_ARRAY;
			}
			StringTable stringtable;
			try {
				stringtable = ArmaProjectDataManager.getInstance().getDataForModule(m).getStringtable();
			} catch (FileNotFoundException e) {
				return PsiReference.EMPTY_ARRAY;
			}
			String nonquote = string.getNonQuoteText();
			StringtableKey[] keysValues = stringtable.getAllKeysValues();
			for (StringtableKey key : keysValues) {
				if (key.getKeyName().equals(nonquote)) {
					return new PsiReference[]{new SQFStringTableKeyReference(string, key.getKeyXmlValue())};
				}
			}
			return PsiReference.EMPTY_ARRAY;
		}
	}

	/**
	 * @author Kayler
	 *         PsiReferenceProvider extension point for SQF language. This provides PSIReferences for given PsiElements, if applicable to them
	 *         Created on 03/23/2016.
	 */
	private static class SQFVariableReferenceProvider extends PsiReferenceProvider {

		@NotNull
		@Override
		public PsiReference[] getReferencesByElement(@NotNull PsiElement element, @NotNull ProcessingContext context) {
			if (!(element instanceof SQFVariable)) {
				return PsiReference.EMPTY_ARRAY; //can't be referenced
			}
			SQFVariable var = (SQFVariable) element;

			if (var.isGlobalVariable()) {
				List<SQFVariable> vars = SQFPsiUtil.findGlobalVariables(element.getProject(), var);
				return new PsiReference[]{new SQFVariableReference(var, vars)};
			}
			return PsiReference.EMPTY_ARRAY;
		}

	}

}
