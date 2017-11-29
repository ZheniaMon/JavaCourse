package ua.training;

public class CarElement implements Element {
    Element[] elements;

    public CarElement() {
        this.elements = new Element[] {new BodyElement(), new EngineElement()};
    }

    @Override
    public void accept(Visitor visitor) {
        for(Element element : elements) {
            element.accept(visitor);
        }
        visitor.visit(this);
    }
}
