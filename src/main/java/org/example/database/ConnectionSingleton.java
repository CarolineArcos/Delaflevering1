package org.example.database;
import java.sql.*;

public class ConnectionSingleton {


    private Connection connection = null;
    String Driver = "jdbc:sqlite:";
    String url;


public Connection connectToSQLite(String Filename){

    url = Driver + Filename;
    //url = "jdbc:sqlite:identifier.sqlite";

    try{

        connection = DriverManager.getConnection(url);

        if(connection != null){
            System.out.println("url = " + url );
            System.out.println("connected to: " + Filename);
        }
    }catch (SQLException throwables){
        throwables.printStackTrace();
    }


    return connection;
}

    public void connectToSQLite() {
    }
}




 /*
    private static Connection connection = null;
    private static String SQLITEDriver = "jdbc:sqlite:";
    private static String MYSQLDriver = "jdbc:mysql://" + "localhost:3306/";
    private static String url;

    public ConnectionDRYnSOC() {


    }
    //Using singleton
    public static Connection getSQLITEConnection(String Filename) {
        url = SQLITEDriver + Filename;
        try {
            connection = DriverManager.getConnection(url);
            if (connection != null) {
                System.out.println("Connected to: " + Filename);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return connection;*/

