package com.vavan.db;

import java.sql.*;
import javax.sql.DataSource;

/**
 * Created by VAVAN on 26-Nov-14.
 */
public class Main {
    public static void main(String[] args) {

        DBWorker worker = new DBWorker();

        String query = "select * from users";

        try {
            Statement statement = worker.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);


            while (resultSet.next()){
                User user = new User();
              user.setId(resultSet.getInt("id"));
               user.setUsername(resultSet.getString("username"));
               user.setPassword(resultSet.getString("password"));
                System.out.println(user);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
