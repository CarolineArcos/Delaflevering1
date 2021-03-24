package org.example;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import org.example.Sensors.HRSensor;
import org.example.Sensors.SpO2sensor;
import org.example.Sensors.TemperatureSensor;

import static java.lang.Thread.*;

public class PrimaryController {



    TemperatureSensor ts = new TemperatureSensor();
    SpO2sensor spO2sensor= new SpO2sensor();
    HRSensor hrSensor = new HRSensor();



    @FXML
    Label dataTemp;
    public Label dataHR;
    public Label dataSpO2;



    @FXML
    private synchronized void startSensors(){

            dataTemp.setText("" + ts.getValue());
            dataHR.setText(hrSensor.getValue() + "");
            dataSpO2.setText("" + spO2sensor.getValue());


        }
}
