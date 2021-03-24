package org.example;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import org.example.Sensors.HRSensor;
import org.example.Sensors.SpO2sensor;
import org.example.Sensors.TemperatureSensor;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    TemperatureSensor ts = new TemperatureSensor();
    SpO2sensor spO2sensor= new SpO2sensor();
    HRSensor hrSensor = new HRSensor();
    Thread Opdatering = new Thread();

    @FXML
    Label label;

    boolean start = false;


    @FXML
    private synchronized void startSensors(){
        start = !start;


            label.setText("Temperatur: " + ts.getValue() + " C");





    }
}
