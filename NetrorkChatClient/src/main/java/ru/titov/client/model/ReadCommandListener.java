package ru.titov.client.model;

import ru.titov.clientserver.Command;

public interface ReadCommandListener {

    void processReceivedCommand(Command command);

}