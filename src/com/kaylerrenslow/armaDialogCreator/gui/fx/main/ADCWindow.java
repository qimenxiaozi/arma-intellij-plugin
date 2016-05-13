package com.kaylerrenslow.armaDialogCreator.gui.fx.main;

import com.kaylerrenslow.armaDialogCreator.gui.canvas.api.action.ActionEvent;
import com.kaylerrenslow.armaDialogCreator.gui.canvas.api.action.ActionListener;
import com.kaylerrenslow.armaDialogCreator.gui.canvas.api.ui.Component;
import com.kaylerrenslow.armaDialogCreator.gui.fx.control.contextMenu.CanvasContextMenu;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * Created by Kayler on 05/11/2016.
 */
public class ADCWindow {
	private final Stage primaryStage;
	private final VBox rootElement = new VBox();
	private UICanvas canvas = new UICanvas(500, 500);

	public ADCWindow(Stage primaryStage) {
		this.primaryStage = primaryStage;
		Scene scene = new Scene(rootElement);
		this.primaryStage.setScene(scene);

		initialize();
		show();
	}

	private void initialize() {
		this.rootElement.getChildren().add(canvas);
		Color[] colors = {Color.RED, Color.BLACK, Color.ORANGE};
		int w = 60;
		int x = w + 30;
		for (Color c : colors) {
			Component component = new Component(x, 50, w, w);
			component.setPaint(c);
//			component.setOnRightClick(new ActionListener() {
//				@Override
//				public void actionPerformed(ActionEvent e) {
//					if(e.getSource() instanceof Component){
//						Component c = (Component)e.getSource();
//						System.out.println(c + "c");
//						canvas.setContextMenu(new CanvasContextMenu(c.getText()));
//					}
//				}
//			});
			component.setText(c.toString());
			if(c == colors[0]){
				component.setCanMove(false);
			}
			canvas.addComponent(component);
			x += w + 5;
		}
	}

	private void show() {
		this.primaryStage.show();
	}

}