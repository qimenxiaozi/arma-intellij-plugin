package com.kaylerrenslow.armaplugin.lang.sqf.psi;

import com.kaylerrenslow.armaplugin.lang.sqf.SQFVariableName;
import org.jetbrains.annotations.NotNull;

/**
 * @author Kayler
 * @since 05/23/2017
 */
public class SQFVariable {
	@NotNull
	public SQFVariableName getVarName() {
		return null;
	}

	public boolean isLocal() {
		//todo
		throw new UnsupportedOperationException();
	}

	public boolean isMagicVar() {
		//todo
		throw new UnsupportedOperationException();
	}
}
