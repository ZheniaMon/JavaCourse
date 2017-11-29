package ua.training;

public class ConsoleObserver implements Observer {
    @Override
    public void handleEvent(int temp, int presser) {
        System.out.println("Measurements changed: " + temp + " " + presser);
    }
}
