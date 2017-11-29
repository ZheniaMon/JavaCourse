package ua.training.radio;

public class Radio {
    Station station;

    void setStation(Station station) {
        this.station = station;
    }

    void nextStation() {
        if(station instanceof Radio7) {
            setStation(new RadioFM());
        } else if(station instanceof RadioFM) {
            setStation(new HitFM());
        } else {
            setStation(new Radio7());
        }
    }

    void play() {
        station.play();
    }
}
