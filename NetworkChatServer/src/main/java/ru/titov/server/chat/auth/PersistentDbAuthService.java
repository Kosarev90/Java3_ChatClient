package ru.titov.server.chat.auth;

import java.sql.*;

public class PersistentDbAuthService implements IAuthService {

    private static final String DB_URL = "jdbc:sqlite:chatUsers.db";
    private Connection connection;
    private PreparedStatement getUsernameStatement;
    private PreparedStatement updateUsernameStatement;


    @Override
    public void start() {
        try {
            System.out.println("Creating DB connection...");
            connection = DriverManager.getConnection(DB_URL);
            System.out.println("DB connection is created successfully");
            getUsernameStatement = createGetUsernameStatement();
            updateUsernameStatement = createUpdateUsernameStatement();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            System.err.println("Failed to connect to DB by URL: " + DB_URL);
            throw new RuntimeException("Failed to start auth service");
        }
    }

    @Override
    public String getUserNameByLoginAndPassword(String login, String password) {
        String username = null;
        try {
            getUsernameStatement.setString(1, login);
            getUsernameStatement.setString(2, password);
            ResultSet resultSet = getUsernameStatement.executeQuery();
            while (resultSet.next()) {
                username = resultSet.getString("username");
                break;
            }
            resultSet.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            System.err.printf("Failed to fetch username from DB. Login: %s; password: %s%n", login, password);
        }

        return username;
    }

    @Override
    public void updateUsername(String currentUsername, String newUsername) {
        try {
            updateUsernameStatement.setString(1, newUsername);
            updateUsernameStatement.setString(2, currentUsername);
            int result = updateUsernameStatement.executeUpdate();
            System.out.println("Update username. Updated rows: " + result);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            System.err.printf("Failed to update username. currentUsername: %s; newUsername: %s%n",
                    currentUsername, newUsername);
        }
    }

    @Override
    public void stop() {
        if (connection != null) {
            try {
                System.out.println("Closing DB connection");
                connection.close();
                System.out.println("DB connection is closed");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
                System.err.println("Failed to close connection to DB by URL: " + DB_URL);
                throw new RuntimeException("Failed to stop auth service");
            }
        }
    }

    private PreparedStatement createGetUsernameStatement() throws SQLException {
        return connection.prepareStatement("SELECT username FROM users WHERE login = ? AND password = ? ");
    }


    private PreparedStatement createUpdateUsernameStatement() throws SQLException {
        return connection.prepareStatement("UPDATE users SET username = ? WHERE username = ? ");
    }
}
