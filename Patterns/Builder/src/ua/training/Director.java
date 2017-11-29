package ua.training;

public class Director {
    CarBuilder carBuilder;

    void setCarBuilder(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    Car buildCar() {
        carBuilder.createCar();
        carBuilder.buildMake();
        carBuilder.buildTransmission();
        carBuilder.buildMaxSpeed();
        Car car = carBuilder.getCar();
        return car;
    }
}
