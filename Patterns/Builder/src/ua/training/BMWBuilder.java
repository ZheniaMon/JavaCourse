package ua.training;

public class BMWBuilder extends CarBuilder {
    @Override
    void buildMake() {
        car.setMake("BMW");
    }

    @Override
    void buildTransmission() {
        car.setTransmission(Transmission.MANUAL);
    }

    @Override
    void buildMaxSpeed() {
        car.setMaxSpeed(250);
    }
}
