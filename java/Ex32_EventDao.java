package com.community.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
class Ex32_EventDao {
    private static final String URL = "jdbc:sqlite:community.db";

    public Ex32_EventDao() {
        createTable();
    }

    private Connection getConnection() throws Exception {
        return DriverManager.getConnection(URL);
    }

    private void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS events (id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL, category TEXT NOT NULL)";
        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.executeUpdate();
        } catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    public void insertEvent(Ex32_Event event) {
        String sql = "INSERT INTO events(name, category) VALUES (?, ?)";
        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, event.getName());
            statement.setString(2, event.getCategory());
            statement.executeUpdate();
        } catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    public int insertEventAndReturnId(Ex32_Event event) {
        String sql = "INSERT INTO events(name, category) VALUES (?, ?)";
        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            statement.setString(1, event.getName());
            statement.setString(2, event.getCategory());
            statement.executeUpdate();

            try (ResultSet keys = statement.getGeneratedKeys()) {
                if (keys.next()) {
                    return keys.getInt(1);
                }
            }
            return -1;
        } catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    public void updateCategory(int id, String category) {
        String sql = "UPDATE events SET category = ? WHERE id = ?";
        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, category);
            statement.setInt(2, id);
            statement.executeUpdate();
        } catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    public List<Ex32_Event> findAll() {
        List<Ex32_Event> events = new ArrayList<>();
        String sql = "SELECT id, name, category FROM events";
        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(sql); ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                events.add(new Ex32_Event(resultSet.getInt("id"), resultSet.getString("name"), resultSet.getString("category")));
            }
        } catch (Exception exception) {
            throw new RuntimeException(exception);
        }
        return events;
    }
}


