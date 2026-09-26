package org.example.csc311_mod3_lab2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class RegisterController {

    @FXML
    private void handleBackToLogin(ActionEvent event) {

        try {
            // Load the login screen.
            FXMLLoader loader =
                    new FXMLLoader(
                            getClass().getResource("login-view.fxml")
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

            // Change back to the login screen.
            stage.setScene(scene);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}