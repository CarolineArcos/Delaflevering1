package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class HomeController {
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
