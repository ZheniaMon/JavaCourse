package ua.training;

public class Main {
    public static void main(String[] args) {
        Painter painter = new Painter();
        painter.setGraphics(new Triangle());
        painter.draw();

        painter.setGraphics(new Square());
        painter.draw();

        painter.setGraphics(new Circle());
        painter.draw();
    }
}
