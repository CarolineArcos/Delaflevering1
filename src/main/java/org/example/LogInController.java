package org.example;

import javafx.fxml.FXML;

import java.io.IOException;

public class LogInController {
    @FXML
    private void switchToHome() throws IOException {
        App.setRoot("home");
    }
}
