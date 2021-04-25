package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import org.example.Sensors.HRSensor;
import org.example.Sensors.SpO2sensor;
import org.example.Sensors.TemperatureSensor;

import java.io.IOException;


public class NyMålingController {


    TemperatureSensor ts = new TemperatureSensor();
    SpO2sensor spO2sensor = new SpO2sensor();
    HRSensor hrSensor = new HRSensor();


    @FXML
    Label dataTemp;
    @FXML
    Label dataHR;
    @FXML
    Label dataSpO2;




    @FXML
    private synchronized void startSensors() throws InterruptedException {



            dataSpO2.setText("" + spO2sensor.getValue());
            dataHR.setText("" + hrSensor.getValue());
            dataTemp.setText("" + ts.getValue());





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
