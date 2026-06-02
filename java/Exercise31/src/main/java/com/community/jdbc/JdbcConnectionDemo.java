package com.community.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcConnectionDemo {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:community.db";

        try (Connection connection = DriverManager.getConnection(url);
             Statement statement = connection.createStatement()) {

            statement.executeUpdate("CREATE TABLE IF NOT EXISTS events (id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL, category TEXT NOT NULL)");
            statement.executeUpdate("INSERT INTO events(name, category) VALUES ('Music Festival', 'Music')");

            try (ResultSet resultSet = statement.executeQuery("SELECT id, name, category FROM events")) {
                while (resultSet.next()) {
                    System.out.println(resultSet.getInt("id") + " " + resultSet.getString("name") + " " + resultSet.getString("category"));
                }
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}