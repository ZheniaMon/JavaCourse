package ua.training;

public interface Visitor {
    void visit(EngineElement engineElement);
    void visit(BodyElement bodyElement);
    void visit(CarElement carElement);
}
