package com.kaylerrenslow.a3plugin.dialog.util;

/**
 * This interface is used for simple UI control activating. E is the type of data to be passed from the action
 * @author Kayler
 * @since 04/05/2016
 */
public interface SimpleGuiAction<E> {
	/**
	 * An action was performed and has result data
	 */
	void actionPerformed(E actionData);
}
