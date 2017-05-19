package com.lt.ui.main;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Launcher extends Application{

	public static void main(String[] args){
		 launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setWidth(1024);
        primaryStage.setHeight(768);
        primaryStage.setMinWidth(800);
        primaryStage.setMinHeight(600);
        primaryStage.setTitle("MessageManager.windowTitle");
        primaryStage.setScene(new Scene((Parent) loadFxml("/com/lt/ui/window/window.fxml"), 1024, 968));
        primaryStage.show();
	}
	
	static public Node loadFxml(String fxml) {
        FXMLLoader loader = new FXMLLoader();
        try {
            loader.setLocation(Launcher.class.getResource(fxml));
            Node root = (Node) loader.load(Launcher.class.getResource(fxml).openStream());
            return root;
        } catch (IOException e) {
            throw new IllegalStateException("cannot load FXML screen", e);
        }
    }
	
}
