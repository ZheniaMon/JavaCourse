package ua.training;

public class StopCommand implements Command {
    Computer computer;
    public StopCommand(Computer computer) {
        super();
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.stop();
    }
}
