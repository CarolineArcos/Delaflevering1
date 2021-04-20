package org.example.database;
import org.example.Sensors.HRSensor;
import org.example.Sensors.SpO2sensor;
import org.example.Sensors.TemperatureSensor;

import java.sql.*;
public class ConnectionMeasurement {

   /* private Connection connection;
    private Statement statement;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;

    TemperatureSensor ts = new TemperatureSensor();
    SpO2sensor spO2sensor = new SpO2sensor();
    HRSensor hrSensor = new HRSensor();

    public ConnectionMeasurement(Connection connection){
        this.connection = connection;
    }

    public void InsertInMeasurements(int value1, double value2, double value3, double value4){

        double ts = ts;

        String SQLUsers = "INSERT INTO measurements (cpr, temperature, heartrate, bpm, date) VALUES (?,?,?,?);";
        try {
            preparedStatement = connection.prepareStatement(SQLUsers);
            preparedStatement.setInt(1, value1);
            preparedStatement.setString(2, ts);
            preparedStatement.setString(3, spO2sensor);
            preparedStatement.setString(4, HRSensor);
            preparedStatement.execute();

        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
    }*/

}
