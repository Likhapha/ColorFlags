package com.example.colorflags;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.scene.layout.VBox;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.temporal.Temporal;


public class HelloController {



    @FXML

    private Button Belgium;

    @FXML
    private Button France;

    @FXML
    private Button Germany;

    @FXML
    private Button Italy;

    @FXML
    private Button china;

    @FXML
    private BorderPane lane;

    @FXML
    private Button spain;
    @FXML
    private Button label;


    @FXML
    void ActionOnBelgium(ActionEvent event) throws IOException {
        AnchorPane view = FXMLLoader.load(getClass().getResource("Belgiumiam.fxml"));
        lane.setCenter(view);
        Text text = new Text(50, 27, "Belgium Flag");
        lane.setRight(text);
    }

    @FXML
    void ActionOnChina(ActionEvent event) throws IOException {
        AnchorPane view = FXMLLoader.load(getClass().getResource("China.fxml"));

        lane.setCenter(view);
        Text text = new Text(50, 27, "China Flag");
        lane.setRight(text);
        lane.paddingProperty().get().getRight();
    }
    @FXML
    void ActionOnFrance(ActionEvent event) throws IOException {
        AnchorPane view = FXMLLoader.load(getClass().getResource("Francian.fxml"));
        lane.setCenter(view);
        Text text = new Text(50, 27, "France Flag");
        lane.setRight(text);

        }
    @FXML
    void ActionOnGermany(ActionEvent event) throws IOException {
        AnchorPane view = FXMLLoader.load(getClass().getResource("Germany.fxml"));
        lane.setCenter(view);
        Text text = new Text(50, 27, "Germany Flag");
        lane.setRight(text);
    }

    @FXML
    void ActionOnSpain(ActionEvent event) throws IOException {
        AnchorPane view = FXMLLoader.load(getClass().getResource("Spain.fxml"));
        lane.setCenter(view);
        Text text = new Text(50, 27, "Spain Flag");
        lane.setRight(text);

    }

    @FXML
    void ActionOnItaly(ActionEvent event) throws IOException {

        AnchorPane view = FXMLLoader.load(getClass().getResource("Italy.fxml"));

        lane.setCenter(view);
        Text text = new Text(50, 27, "Italy Flag");
        lane.setRight(text);

    }
    @FXML
    void ActionlOnClear(ActionEvent event) {

        lane.setCenter(null);
        lane.setRight(null);
    }

    public void HandleQuit(ActionEvent event){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Quit");
        alert.setHeaderText("Do you want to quit?");

        if (alert.showAndWait().get()== ButtonType.OK){
            Stage stage = (Stage) lane.getScene().getWindow();
            System.out.println("You are successfully quit");
            stage.close();
        }
    }
}
