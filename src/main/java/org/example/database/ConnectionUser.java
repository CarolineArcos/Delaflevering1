package org.example.database;

import java.sql.*;

public class ConnectionUser {

    private Connection connection;
    private Statement statement;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;

    public ConnectionUser(Connection connection){
        this.connection = connection;
    }

    public void InsertInUsers(int value1, String value2, String value3, String value4){
        String SQLUsers = "INSERT INTO users (cpr, name, password, type) VALUES (?,?,?,?);";
        try {
            preparedStatement = connection.prepareStatement(SQLUsers);
            preparedStatement.setInt(1, value1);
            preparedStatement.setString(2, value2);
            preparedStatement.setString(3,value3);
            preparedStatement.setString(4,value4);
            preparedStatement.execute();

        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
    }
}
