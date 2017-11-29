package ua.training;

public class ResetCommand implements Command {
    Computer computer;
    public ResetCommand(Computer computer) {
        super();
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.reset();
    }
}
