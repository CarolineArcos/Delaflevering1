package org.example.database;

import org.example.Sensors.HRSensor;
import org.example.Sensors.SpO2sensor;
import org.example.Sensors.TemperatureSensor;

import java.sql.Connection;

public class main {



    public static void main(String[] args) {
        ConnectionSingleton singleton = new ConnectionSingleton();

        Connection conn = singleton.connectToSQLite("identifier.sqlite");
        ConnectionUser cu = new ConnectionUser(conn);
        //ConnectionMeasurement cm = new ConnectionMeasurement(conn);
        cu.InsertInUsers(160195,"Mia","password", "patient");


    }

}
