package org.example;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class ResultsController {

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
}