package com.vavan.db;

import java.sql.*;

/**
 * Created by VAVAN on 26-Nov-14.
 */
public class DBWorker {

    private final String HOST = "jdbc:postgresql://localhost:5432/testdb";
    private final String USERNAME = "postgres";
    private final String PASSWORD = "root";

    private Connection connection;

    public DBWorker(){
        try {
            connection = DriverManager.getConnection(HOST, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public Connection getConnection(){
        return connection;
    }

}
