package ru.titov.server;

import ru.titov.server.chat.MyServer;

public class ServerApp {

    private static final int DEFAULT_PORT = 8189;

    public static void main(String[] args) {
        int port = DEFAULT_PORT;
        if (args.length != 0) {
            port = Integer.parseInt(args[0]);
        }

        new MyServer().start(port);
    }
}
