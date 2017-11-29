package ua.training;

public class VectorAdapterFromRaster extends RasterGraphics implements VectorGraphicsInterface {
    @Override
    public void drawLine() {
        drawRasterLine();
    }

    @Override
    public void drawSquare() {
        drawRasterSquare();
    }

    @Override
    public void drawCircle() {
        drawRasterCircle();
    }
}
