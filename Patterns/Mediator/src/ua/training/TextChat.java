package ua.training;

import java.util.*;

public class TextChat implements Chat {
    User admin;
    List<User> users = new ArrayList<>();

    public  void setAdmin(User admin) {
        this.admin = admin;
    }

    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        for(User iUser : users) {
            iUser.getMessage(message);
        }
        admin.getMessage(message);
    }
}
