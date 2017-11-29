package ua.training;

public class QuotesDecorator extends Decorator {
    public static final String QUOTE = "\"";

    public QuotesDecorator(PrinterInterface component) {
        super(component);
    }
    @Override
    public void print() {
        System.out.print(QUOTE);
        component.print();
        System.out.print(QUOTE);
    }
}
