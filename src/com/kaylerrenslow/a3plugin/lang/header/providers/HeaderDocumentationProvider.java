package com.kaylerrenslow.a3plugin.lang.header.providers;

import com.intellij.lang.documentation.DocumentationProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiManager;
import com.intellij.psi.xml.XmlTag;
import com.kaylerrenslow.a3plugin.lang.shared.stringtable.StringTable;
import com.kaylerrenslow.a3plugin.lang.shared.stringtable.StringTableLookupElementDataObject;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * @author Kayler
 * @since 04/09/2016
 */
public class HeaderDocumentationProvider implements DocumentationProvider {
	@Nullable
	@Override
	public String getQuickNavigateInfo(PsiElement element, PsiElement originalElement) {
		return generateDoc(element, originalElement);
	}

	@Nullable
	@Override
	public List<String> getUrlFor(PsiElement element, PsiElement originalElement) {
		return null;
	}

	@Nullable
	@Override
	public String generateDoc(PsiElement element, @Nullable PsiElement originalElement) {
		if (element instanceof XmlTag) {
			return StringTable.getKeyDoc((XmlTag) element);
		}
		return null;
	}

	@Nullable
	@Override
	public PsiElement getDocumentationElementForLookupItem(PsiManager psiManager, Object object, PsiElement element) {
		if (object instanceof StringTableLookupElementDataObject) {
			return ((StringTableLookupElementDataObject) object).getTargetTag();
		}
		return null;
	}

	@Nullable
	@Override
	public PsiElement getDocumentationElementForLink(PsiManager psiManager, String link, PsiElement context) {
		return null;
	}
}
