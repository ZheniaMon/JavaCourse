package ua.training;

public class RightBracketDecorator extends Decorator {
    public static final String RIGHT_BRACKET = "]";

    public RightBracketDecorator(PrinterInterface component) {
        super(component);
    }

    @Override
    public void print() {
        component.print();
        System.out.print(RIGHT_BRACKET);
    }
}
