package org.example.csc311_mod3_lab2;

import javafx.animation.PauseTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

public class SplashController {

    @FXML
    private VBox splashRoot;

    @FXML
    public void initialize() {

        // Wait for 2 seconds before moving to the login screen.
        PauseTransition pause =
                new PauseTransition(Duration.seconds(2));

        pause.setOnFinished(event -> {
            try {

                FXMLLoader loader =
                        new FXMLLoader(
                                getClass().getResource("login-view.fxml")
                        );

                Scene scene =
                        new Scene(loader.load(), 800, 500);
                scene.getStylesheets().add(
                        getClass()
                                .getResource("styles.css")
                                .toExternalForm()
                );

                Stage stage =
                        (Stage) splashRoot.getScene().getWindow();

                stage.setScene(scene);

            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        pause.play();
    }
}