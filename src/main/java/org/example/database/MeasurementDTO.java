package org.example.database;

import java.sql.*;
import java.util.ArrayList;

public class MeasurementDTO {

    private Connection connection;
    private Statement statement;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;


    public MeasurementDTO(Connection connection) {
        this.connection = connection;
    }

    public void InsertInMeasurements(int value1, double value2, double value3, double value4) {


        String SQLMeasurements = "INSERT INTO measurements (cpr, temperature, spO2, heartrate) VALUES (?,?,?,?);";
        try {
            preparedStatement = connection.prepareStatement(SQLMeasurements);
            preparedStatement.setInt(1, value1);
            preparedStatement.setDouble(2, value2);
            preparedStatement.setDouble(3, value3);
            preparedStatement.setDouble(4, value4);
            preparedStatement.execute();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public ArrayList<MeasurementObjects> FindAllMeasurementResultsByCPR (int cprTal) {
        ArrayList<MeasurementObjects> liste = new ArrayList<>();

        String SQLResults = "SELECT temperature, spO2, heartrate, time FROM measurements WHERE cpr = " + cprTal + ";";
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(SQLResults);

            while (resultSet.next()) {
                liste.add(new MeasurementObjects(cprTal, resultSet.getDouble("temperature"), resultSet.getDouble("spO2"), resultSet.getDouble("heartrate")));
            }


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return liste;
    }

   /* public ObservableList<MeasurementResults> getAllRecords() throws ClassNotFoundException, SQLException {
        String SQlite = "select * from measurements";

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(SQlite);
            ObservableList<MeasurementResults> dataList = getMeasurementsObjects(ResultSet)


        }catch (SQLException throwables) {
            System.out.println("fejl opstod vedkommunikation med database");
            throwables.printStackTrace();
        }
    } */
}


