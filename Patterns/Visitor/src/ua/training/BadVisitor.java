package ua.training;

public class BadVisitor implements Visitor {
    @Override
    public void visit(EngineElement engineElement) {
        System.out.println("Break the engine");
    }

    @Override
    public void visit(CarElement carElement) {
        System.out.println("Break car");
    }

    @Override
    public void visit(BodyElement bodyElement) {
        System.out.println("Break the body");
    }
}
