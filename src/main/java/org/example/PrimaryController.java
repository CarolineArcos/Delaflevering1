package org.example;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import org.example.Sensors.HRSensor;
import org.example.Sensors.SpO2sensor;
import org.example.Sensors.TemperatureSensor;


public class PrimaryController {


    TemperatureSensor ts = new TemperatureSensor();
    SpO2sensor spO2sensor = new SpO2sensor();
    HRSensor hrSensor = new HRSensor();


    @FXML
    Label dataTemp;
    public Label dataHR;
    public Label dataSpO2;


    @FXML
    private synchronized void startSensors() {


        dataSpO2.setText("" + spO2sensor.getValue());
        dataHR.setText("" + hrSensor.getValue());
        dataTemp.setText("" + ts.getValue());


    }
}
