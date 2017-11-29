package ua.training.radio;

import ua.training.human.Human;
import ua.training.human.Work;

public class Main {
    public static void main(String[] args) {
        Station station = new Radio7();
        Radio radio = new Radio();
        radio.setStation(station);

        for(int i = 0; i < 10; i++) {
            radio.play();
            radio.nextStation();
        }

        Human human = new Human();
        human.setState(new Work());
        for(int i = 0; i < 10; i++) {
            human.doSomething();
        }
    }
}
