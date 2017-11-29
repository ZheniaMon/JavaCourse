package ua.training;

public class Main {
    public static void main(String[] args) {
        Element body = new BodyElement();
        Element engine = new EngineElement();
        Visitor badVisitor = new BadVisitor();

        body.accept(badVisitor);
        engine.accept(badVisitor);

        Element car = new CarElement();
        car.accept(badVisitor);

    }
}
