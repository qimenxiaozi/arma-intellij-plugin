package com.kaylerrenslow.a3plugin.dialog;

import javafx.scene.Scene;

/**
 * This is simply a JavaFX Scene with the ColorPicker panel placed inside
 *
 * @author Kayler
 * @author 03/29/2016
 */
public class ColorPickerScene extends Scene {

	private static final int HEIGHT = 600;
	private static final int WIDTH = 950;

	public ColorPickerScene() {
		super(new ColorPickerPanel(), WIDTH, HEIGHT);
	}
}
