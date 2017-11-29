package ua.training;

public class Main {
    public static void main(String[] args) {
        MeteoStation meteoStation = new MeteoStation();

        meteoStation.addObserver(new ConsoleObserver());
        meteoStation.addObserver(new FileObserver());

        meteoStation.setMeasurements(20, 5);
        meteoStation.setMeasurements(-1, 0);
    }
}
