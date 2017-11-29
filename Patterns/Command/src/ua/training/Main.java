package ua.training;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        User user = new User(new StartCommand(computer), new StopCommand(computer), new ResetCommand(computer));

        user.startComputer();
        user.resetComputer();
        user.stopComputer();
    }
}
