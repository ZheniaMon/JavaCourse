package ua.training;

public class StartCommand implements Command {

    Computer computer;
    public StartCommand(Computer computer) {
        super();
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.start();
    }

}
