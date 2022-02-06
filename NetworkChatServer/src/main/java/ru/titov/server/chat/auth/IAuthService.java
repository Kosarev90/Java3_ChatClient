package ru.titov.server.chat.auth;

public interface IAuthService {

    default void start() {
        // Do nothing
    };

    String getUserNameByLoginAndPassword(String login, String password);

    default void stop() {
        // Do nothing
    }

    void updateUsername(String currentUsername, String newUsername);
}