package com.kaylerrenslow.armaDialogCreator.gui.fx.main;

import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 Created by Kayler on 05/11/2016.
 */
public class ADCWindow {
	private final Stage primaryStage;
	private final VBox rootElement = new VBox();
	private final ADCMenuBar mainMenuBar = new ADCMenuBar();
	private final CanvasView canvasView = new CanvasView(700, 700);

	public ADCWindow(Stage primaryStage) {
		this.primaryStage = primaryStage;

		Scene scene = new Scene(rootElement);
		this.primaryStage.setScene(scene);
		initialize(scene);
		show();

	}

	private void initialize(Scene scene) {
		rootElement.getChildren().addAll(mainMenuBar, canvasView);
		primaryStage.setWidth(1000);
		primaryStage.setHeight(700);
		EventHandler<KeyEvent> keyEvent = new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent event) {
				canvasView.keyEvent(event.getText(), event.getEventType() == KeyEvent.KEY_PRESSED, event.isShiftDown(), event.isControlDown(), event.isAltDown());
			}
		};
		scene.setOnKeyPressed(keyEvent);
		scene.setOnKeyReleased(keyEvent);
		scene.getMnemonics().clear();

	}

	private void show() {
		this.primaryStage.show();
	}

}
