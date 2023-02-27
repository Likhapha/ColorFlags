package com.example.colorflags;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("FMXLDocument.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 420);
        stage.setTitle("World Flags");
        stage.setScene(scene);

        stage.show();
        stage.setOnCloseRequest(windowEvent -> {
            windowEvent.consume();
            HandleQuit(stage);
        });
    }

        public void HandleQuit(Stage stage){
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Quit");
            alert.setHeaderText("Do you want to quit?");

            if (alert.showAndWait().get()== ButtonType.OK){
                System.out.println("You are successfully quit");
                stage.close();
            }
        }

    public static void main(String[] args) {
        launch();
    }
}