package org.example;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.example.Sensors.HRSensor;
import org.example.Sensors.SpO2sensor;
import org.example.Sensors.TemperatureSensor;
import org.example.database.ConnectionMeasurement;
import org.example.database.ConnectionSingleton;
import org.example.database.ConnectionUser;

import java.io.IOException;
import java.sql.Connection;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


public class NyMålingController {


    public TextField CPR;
    ScheduledExecutorService event;
    boolean control = true;
    TemperatureSensor ts = new TemperatureSensor();
    SpO2sensor spO2sensor = new SpO2sensor();
    HRSensor hrSensor = new HRSensor();

    ConnectionSingleton singleton = new ConnectionSingleton();
    Connection conn = singleton.connectToSQLite("identifier.sqlite");
    ConnectionMeasurement cm = new ConnectionMeasurement(conn);


    @FXML
    Label dataTemp;
    @FXML
    Label dataHR;
    @FXML
    Label dataSpO2;


    @FXML
    private synchronized void startSensors() throws InterruptedException {
        event = Executors.newSingleThreadScheduledExecutor();
        if (control) {
            control = false;
            event.scheduleAtFixedRate(() ->
                    Platform.runLater(() -> {
                                double spo2 = spO2sensor.getValue();
                                double hr = hrSensor.getValue();
                                double temp = ts.getValue();

                                dataSpO2.setText("" + spo2);
                                dataHR.setText("" + hr);
                                dataTemp.setText("" + temp);
                                int cprTal = Integer.parseInt(CPR.getText());
                                cm.InsertInMeasurements(cprTal, temp, spo2, hr);
                            }
                    ), 0, 3, TimeUnit.SECONDS);
        }
    }

    @FXML
    private void switchToNyMåling() throws IOException {
        if (control == false) {
            event.shutdown();
            control = true;
        }
        App.setRoot("nyMåling");
    }

    @FXML
    private void switchToResults() throws IOException {
        if (control == false) {
            event.shutdown();
            control = true;
        }
        App.setRoot("results");
    }

    @FXML
    private void switchToHome() throws IOException {
        if (control == false) {
            event.shutdown();
            control = true;
        }
        App.setRoot("home");
    }

    @FXML
    private void switchToLogIn() throws IOException {
        if (control == false) {
            event.shutdown();
            control = true;
        }
        App.setRoot("logIn");
    }

    public void stop(ActionEvent actionEvent) {
        event.shutdown();
        control = true;
    }
}
