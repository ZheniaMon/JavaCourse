package ua.training;

import java.util.*;

public class MeteoStation implements Observed {
    int temp;
    int pressure;

    List<Observer> observers = new ArrayList<>();

    public void setMeasurements(int temp, int pressure) {
        this.temp = temp;
        this.pressure = pressure;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer o : observers) {
            o.handleEvent(temp, pressure);
        }
    }
}
