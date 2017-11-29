package ua.training;

abstract public class Decorator implements PrinterInterface {
    PrinterInterface component;
    public Decorator(PrinterInterface component) {
        this.component = component;
    }
}
