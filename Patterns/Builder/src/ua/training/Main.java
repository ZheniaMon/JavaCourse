package ua.training;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        director.setCarBuilder(new BMWBuilder());
        Car car = director.buildCar();
        System.out.println(car);

        director.setCarBuilder(new FormBuilder());
        car = director.buildCar();
        System.out.println(car);

    }
}
