package org.example.database;

import org.example.Sensors.HRSensor;
import org.example.Sensors.SpO2sensor;
import org.example.Sensors.TemperatureSensor;

import java.sql.Connection;

public class main {

    TemperatureSensor ts = new TemperatureSensor();
    SpO2sensor spO2sensor = new SpO2sensor();
    HRSensor hrSensor = new HRSensor();

    public static void main(String[] args) {
        ConnectionSingleton singleton = new ConnectionSingleton();

        Connection conn = singleton.connectToSQLite("identifier.sqlite");
        ConnectionUser cu = new ConnectionUser(conn);
        ConnectionMeasurement cm = new ConnectionMeasurement(conn);
        //cu.InsertInUsers(160194,"Mia","password", "patient");

        for (int i=0; i<20;i++) {
            cm.InsertInMeasurements(123456, ((double) (40.1 - (Math.random() * 5.0))), (double) (100.1 - (Math.random() * 6)), (int) (Math.round(110 - (Math.random() * 60))));
        }

    }

}
