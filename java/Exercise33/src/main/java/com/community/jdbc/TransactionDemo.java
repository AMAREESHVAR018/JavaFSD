package com.community.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TransactionDemo {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:community.db";
        String sql = "INSERT INTO registrations(student_name, event_name) VALUES (?, ?)";

        try (Connection connection = DriverManager.getConnection(url)) {
            connection.setAutoCommit(false);

            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, "Aarav");
                statement.setString(2, "Music Festival");
                statement.executeUpdate();

                statement.setString(1, "Meera");
                statement.setString(2, "Food Carnival");
                statement.executeUpdate();

                connection.commit();
                System.out.println("Transaction committed");
            } catch (Exception exception) {
                connection.rollback();
                System.out.println("Transaction rolled back");
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}