package com.example.hmjava3.client;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.net.URL;

public class ChatApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        URL url = new File("src/main/resources/chat.fxml").toURI().toURL();
        Parent parent = FXMLLoader.load(url);
        primaryStage.setScene(new Scene(parent));
        primaryStage.show();
    }
}
