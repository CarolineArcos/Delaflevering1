package org.example;

import java.io.IOException;
import java.util.concurrent.ScheduledExecutorService;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class ResultsController {
    public TextField CPR;
    ScheduledExecutorService event;

    @FXML
    private void visData() throws InterruptedException {
        int CPRtal = Integer.parseInt(CPR.getText());





    }

    @FXML
    private void switchToNyMåling() throws IOException {
        App.setRoot("nyMåling");
    }
    @FXML
    private void switchToResults() throws IOException {
        App.setRoot("results");
    }
    @FXML
    private void switchToHome() throws IOException {
        App.setRoot("home");
    }
    @FXML
    private void switchToLogIn() throws IOException {
        App.setRoot("logIn");
    }



}