package ua.training;

public class Main {
    public static void main(String[] args) {
        TextChat textChat = new TextChat();

        User admin = new Admin(textChat);
        User user1 = new SimpleUser(textChat);
        User user2 = new SimpleUser(textChat);

        textChat.setAdmin(admin);
        textChat.addUser(user1);
        textChat.addUser(user2);

        user1.sendMessage("Hello");
    }
}
