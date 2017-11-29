package ua.training;

public class VectroAdapterFromRaster2 implements VectorGraphicsInterface {
    RasterGraphics rasterGraphics = new RasterGraphics();
    @Override
    public void drawLine() {
        rasterGraphics.drawRasterLine();
    }

    @Override
    public void drawSquare() {
        rasterGraphics.drawRasterSquare();
    }

    @Override
    public void drawCircle() {
        rasterGraphics.drawRasterCircle();
    }
}
