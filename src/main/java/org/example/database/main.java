package org.example.database;

import java.sql.Connection;

public class main {

    public static void main(String[] args) {
        ConnectionSingleton singleton = new ConnectionSingleton();

        Connection conn = singleton.connectToSQLite("identifier.sqlite");
        ConnectionUser cu = new ConnectionUser(conn);
        cu.InsertInUsers(123456,"Solveigh","password", "patient");
    }

}
