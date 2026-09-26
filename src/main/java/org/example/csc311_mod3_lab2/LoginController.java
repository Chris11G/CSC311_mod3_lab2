package org.example.csc311_mod3_lab2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    @FXML
    private void handleLogin(ActionEvent event) {
        try {

            // Load the landing screen.
            FXMLLoader loader =
                    new FXMLLoader(
                            getClass().getResource("landing-view.fxml")
                    );

            Scene scene = new Scene(loader.load(), 600, 400);

            // Apply our CSS styling.
            scene.getStylesheets().add(
                    getClass()
                            .getResource("styles.css")
                            .toExternalForm()
            );

            // Get the current window.
            Stage stage =
                    (Stage) ((Node) event.getSource())
                            .getScene()
                            .getWindow();

            // Change the screen to the landing screen.
            stage.setScene(scene);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleRegister(ActionEvent event) {

        try {
            // Load the registration screen.
            FXMLLoader loader =
                    new FXMLLoader(
                            getClass().getResource("register-view.fxml")
                    );

            Scene scene = new Scene(loader.load(), 800, 500);

            // Apply CSS styling.
            scene.getStylesheets().add(
                    getClass()
                            .getResource("styles.css")
                            .toExternalForm()
            );

            // Get the current window.
            Stage stage =
                    (Stage) ((Node) event.getSource())
                            .getScene()
                            .getWindow();

            // Change to the registration screen.
            stage.setScene(scene);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}