package ua.training;

public class Main {
    public static void main(String[] args) {
        Watch watch = new DigitalWatchFactory().createWatch();
        watch.showTime();
    }
}
