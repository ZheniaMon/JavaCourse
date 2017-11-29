package ua.training;

public class Main {
    public static void main(String[] args) {
        Square square1 = new Square();
        Square square2 = new Square();
        Square square3 = new Square();

        Triangle triangle1 = new Triangle();

        Circle circle1 = new Circle();
        Circle circle2 = new Circle();
        Circle circle3 = new Circle();

        Composite composite = new Composite();
        Composite composite1 = new Composite();
        Composite composite2 = new Composite();

        composite1.addComponent(square1);
        composite1.addComponent(square2);
        composite1.addComponent(square3);

        composite2.addComponent(triangle1);
        composite2.addComponent(circle1);
        composite2.addComponent(circle2);
        composite2.addComponent(circle3);

        composite.addComponent(composite1);
        composite.addComponent(composite2);
        composite.draw();
    }
}
