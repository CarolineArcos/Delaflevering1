package org.example.database;
import org.example.Sensors.HRSensor;
import org.example.Sensors.SpO2sensor;
import org.example.Sensors.TemperatureSensor;

import java.sql.*;
public class ConnectionMeasurement {

    private Connection connection;
    private Statement statement;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;

    TemperatureSensor ts = new TemperatureSensor();
    SpO2sensor spO2sensor = new SpO2sensor();
    HRSensor hrSensor = new HRSensor();


    public ConnectionMeasurement(Connection connection){
        this.connection = connection;
    }

    public void InsertInMeasurements(int value1, double value2, double value3, int value4){


        String SQLMeasurements = "INSERT INTO measurements (cpr, temperature, spO2, heartrate) VALUES (?,?,?,?);";
        try {
            preparedStatement = connection.prepareStatement(SQLMeasurements);
            preparedStatement.setInt(1, value1);
            preparedStatement.setDouble(2, value2);
            preparedStatement.setDouble(3, value3);
            preparedStatement.setInt(4, value4);

            preparedStatement.execute();

        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
    }

}
