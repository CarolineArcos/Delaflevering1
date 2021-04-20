package org.example.database;

import java.sql.*;
import java.util.Calendar;

public class ConnectionMeasurement {

    private Connection connection;
    private Statement statement;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;

    Calendar calendar = Calendar.getInstance();
    java.sql.Timestamp time = new java.sql.Timestamp(calendar.getTime().getTime());

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
            //preparedStatement.setTimestamp(5, time);
            preparedStatement.execute();

        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
    }

}
