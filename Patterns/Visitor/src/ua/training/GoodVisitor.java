package ua.training;

public class GoodVisitor implements Visitor {
    @Override
    public void visit(EngineElement engineElement) {
        System.out.println("Check engine");
    }

    @Override
    public void visit(CarElement carElement) {
        System.out.println("Check car");
    }

    @Override
    public void visit(BodyElement bodyElement) {
        System.out.println("Check body");
    }
}
