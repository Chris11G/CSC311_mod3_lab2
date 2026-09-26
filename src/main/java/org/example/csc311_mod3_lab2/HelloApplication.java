package org.example.csc311_mod3_lab2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader =
                new FXMLLoader(HelloApplication.class.getResource("splash-view.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 600, 400);

        scene.getStylesheets().add(
                HelloApplication.class.getResource("styles.css").toExternalForm()
        );

        stage.setTitle("CSC311 Module 2 Lab 2");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}