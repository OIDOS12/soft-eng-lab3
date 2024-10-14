package Proxy;

public class ImageProxy implements Image {
    private RealImage realImage;
    private int x1, x2, y1, y2;

    public ImageProxy(RealImage realImage, int x1, int x2, int y1, int y2) {
        this.realImage = realImage;
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    @Override
    public void getColor(int x, int y) {
        if (x >= x1 && x <= x2 && y >= y1 && y <= y2) {
            realImage.getColor(x, y);
        } else {
            System.out.println("Access denied: координати поза допустимими межами");
        }
    }

}


