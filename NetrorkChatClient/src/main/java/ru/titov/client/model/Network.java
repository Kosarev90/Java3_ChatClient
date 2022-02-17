package ru.titov.client.model;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.titov.clientserver.Command;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Network {

    private final static Logger LOGGER3 = LogManager.getLogger(Network.class);

    public static final int SERVER_PORT = 8189;
    public static final String SERVER_HOST = "localhost";

    private static Network INSTANCE;

    private final int port;
    private final String host;
    private Socket socket;
    private ObjectInputStream socketInput;
    private ObjectOutputStream socketOutput;

    private final List<ReadCommandListener> listeners = new CopyOnWriteArrayList<>();
    private Thread readMessageProcess;
    private String currentUserName;
    private boolean connected;

    public static Network getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Network();
        }

        return INSTANCE;
    }

    private Network(String host, int port) {
        this.host = host;
        this.port = port;
    }

    private Network() {
        this(SERVER_HOST, SERVER_PORT);
    }

    public boolean connect() {
        try {
            socket = new Socket(host, port);
            socketOutput = new ObjectOutputStream(socket.getOutputStream());
            socketInput = new ObjectInputStream(socket.getInputStream());
            readMessageProcess = startReadMessageProcess();
            connected = true;
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            LOGGER3.error("Не удалось установить соединение");
            return false;
        }
    }

    public void sendAuthMessage(String login, String password) throws IOException {
        sendCommand(Command.authCommand(login, password));
    }

    public void sendMessage(String message) throws IOException {
        LOGGER3.info("send public message");
        sendCommand(Command.publicMessageCommand(message));
    }

    private void sendCommand(Command command) throws IOException {
        try {
            socketOutput.writeObject(command);
        } catch (IOException e) {
            LOGGER3.error("Не удалось отправить сообщение на сервер");
            e.printStackTrace();
            throw e;
        }
    }

    public void sendPrivateMessage(String recipient, String message) throws IOException {
        sendCommand(Command.privateMessageCommand(recipient, message));
    }

    public Thread startReadMessageProcess() {
        Thread thread = new Thread(() -> {
            while (true) {
                try {
                    if (Thread.currentThread().isInterrupted()) {
                        return;
                    }
                    Command command = readCommand();
                    if (command.getType() == null) {
                        continue;
                    }
                    for (ReadCommandListener messageListener : listeners) {
                        messageListener.processReceivedCommand(command);
                    }
                } catch (IOException e) {
                    LOGGER3.error("Не удалось прочитать сообщения от сервера");
                    e.printStackTrace();
                    close();
                    break;
                }
            }
        });
        thread.setDaemon(true);
        thread.start();
        return thread;
    }

    private Command readCommand() throws IOException {
        Command command = null;
        try {
            command = (Command) socketInput.readObject();
        } catch (ClassNotFoundException e) {
            LOGGER3.error("Failed to read Command class");
            e.printStackTrace();
        }

        return command;
    }

    public ReadCommandListener addReadMessageListener(ReadCommandListener listener) {
        listeners.add(listener);
        return listener;
    }

    public void removeReadMessageListener(ReadCommandListener listener) {
        listeners.remove(listener);
    }

    public void changeUsername(String newUsername) throws IOException {
        sendCommand(Command.updateUsernameCommand(newUsername));
    }

    public void close() {
        try {
            connected = false;
            readMessageProcess.interrupt();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean isConnected() {
        return connected;
    }

    public String getCurrentUserName() {
        return currentUserName;
    }

    public void setCurrentUserName(String currentUserName) {
        this.currentUserName = currentUserName;
    }
}
