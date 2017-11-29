package ua.training;

abstract public class CarBuilder {
    Car car;

    void createCar() {
        car = new Car();
    }

    public Car getCar() {
        return car;
    }

    abstract void buildMake();
    abstract void buildTransmission();
    abstract void buildMaxSpeed();

}
