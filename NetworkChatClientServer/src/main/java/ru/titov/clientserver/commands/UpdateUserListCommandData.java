package ru.titov.clientserver.commands;

import java.io.Serializable;
import java.util.List;

public class UpdateUserListCommandData implements Serializable {

    private final List<String> users;

    public UpdateUserListCommandData(List<String> users) {
        this.users = users;
    }

    public List<String> getUsers() {
        return users;
    }
}
