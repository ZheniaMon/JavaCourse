package ua.training;

public class LeftBracketDecorator extends Decorator {
    public  static final String LEFT_BRACKET = "[";

    public LeftBracketDecorator(PrinterInterface component) {
        super(component);
    }

    @Override
    public void print() {
        System.out.print(LEFT_BRACKET);
        component.print();
    }
}
