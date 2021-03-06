package com.kaylerrenslow.a3plugin.lang.sqf.psi.wrapper;

import com.intellij.psi.PsiElement;
import com.kaylerrenslow.a3plugin.lang.sqf.SQFVariableName;
import com.kaylerrenslow.a3plugin.lang.sqf.psi.*;
import com.kaylerrenslow.a3plugin.lang.sqf.psi.privatization.SQFPrivatizer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

/**
 * Wrapper class that stores a command expression that represents a params expression (e.g. params["_var"] or params[["var", 1]]). The params expression makes variables private.
 *
 * @author Kayler
 * @since 06/04/2016
 */
public class SQFParamsStatement implements SQFPrivatizer {
	private final SQFCommandExpression paramsCommandExpression;
	private final SQFArrayVal paramsArray;
	private final List<SQFPrivateDeclVar> privateDeclVars = new ArrayList<>();
	private final List<SQFVariableName> varsDefined = new ArrayList<>();

	private SQFParamsStatement(SQFCommandExpression paramsCommandExpression, SQFArrayVal paramsArray) {
		this.paramsCommandExpression = paramsCommandExpression;
		this.paramsArray = paramsArray;
	}

	@Override
	public PsiElement getPrivatizerElement() {
		return paramsCommandExpression;
	}

	/**
	 * Get the array for the params statement
	 */
	public SQFArrayVal getParamsArray() {
		return paramsArray;
	}

	/**
	 * Get a list of all private vars
	 */
	@NotNull
	@Override
	public List<SQFPrivateDeclVar> getPrivateVars() {
		return privateDeclVars;
	}

	/**
	 * Get all variables that are defined inside the params statement (may not contain all private decl vars)
	 */
	@NotNull
	public List<SQFVariableName> getVarsDefined() {
		return varsDefined;
	}

	/**
	 * Return true if the variable is defined, false otherwise. (effectively the same thing as getVarsDefined().contains(varName))
	 */
	public boolean varIsDefined(@NotNull SQFVariableName varName) {
		return varsDefined.contains(varName);
	}

	/**
	 * Get a params statement instance from the given command expression. Will return null if the expression wasn't a valid params statement
	 */
	@Nullable
	public static SQFParamsStatement parse(SQFCommandExpression expression) {
		PsiElement postfix = expression.getPostfixArgument();
		PsiElement prefix = expression.getPrefixArgument();
		String commandName = expression.getCommandName();

		SQFParamsStatement paramsStatement = null;

		if (commandName.equals("params")) { //is params statement
			if (postfix instanceof SQFLiteralExpression) {
				SQFLiteralExpression literal = (SQFLiteralExpression) postfix;
				if (literal.getArrayVal() == null) {
					return null;
				}
				SQFArrayVal array = literal.getArrayVal();
				List<SQFLiteralExpression> arrayLiterals = SQFPsiUtil.getExpressionsOfType(array, SQFLiteralExpression.class);
				paramsStatement = new SQFParamsStatement(expression, array);

				for (SQFLiteralExpression literalExpression : arrayLiterals) { //e.g. iterate over each entry in params ["_var1",[]]
					if (literalExpression.getString() != null) {
						paramsStatement.privateDeclVars.add(new SQFPrivateDeclVar(literalExpression.getString(), paramsStatement));
					} else if (literalExpression.getArrayVal() != null) { //params[["_var1", _defaultValue], "_var2"]
						SQFArrayVal innerArray = literalExpression.getArrayVal();
						List<SQFArrayEntry> innerArrayEntries = innerArray.getArrayEntryList();
						if (innerArrayEntries.size() >= 1) { //has at least params[["_var"]]
							SQFExpression firstExpression = innerArrayEntries.get(0).getExpression();
							if (firstExpression instanceof SQFLiteralExpression) {
								SQFLiteralExpression possibleString = (SQFLiteralExpression) firstExpression;
								if (possibleString.getString() != null) {
									paramsStatement.privateDeclVars.add(new SQFPrivateDeclVar(possibleString.getString(), paramsStatement));
									if (innerArrayEntries.size() > 1 || prefix != null) {
										if (innerArrayEntries.get(1).getText().equals("nil") && prefix == null) { //params [["_var", nil]]; //nil is lack of a value
											continue;
										}
										paramsStatement.varsDefined.add(new SQFVariableName(possibleString.getString().getNonQuoteText()));
									}
								}
							}
						}
					}
				}

			}
		}
		return paramsStatement;
	}
}
