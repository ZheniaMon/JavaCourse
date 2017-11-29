package ua.training;

public class Main {
    public static void main(String[] args) {
        VectorGraphicsInterface vectorGraphics = new VectorAdapterFromRaster();
        System.out.println("Через наследование");
        vectorGraphics.drawLine();
        vectorGraphics.drawSquare();
        vectorGraphics.drawCircle();
        System.out.println("Через композицию");
        VectorGraphicsInterface vectorGraphics2 = new VectroAdapterFromRaster2();
        vectorGraphics2.drawLine();
        vectorGraphics2.drawSquare();
        vectorGraphics2.drawCircle();


    }
}
