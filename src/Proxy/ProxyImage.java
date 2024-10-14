package Proxy;

/**
 * Class representing a proxy for an image.
 */

public class ProxyImage implements Image {

    private RealImage realImage;
    private int x1, x2, y1, y2;

    /**
     * Constructor for the ProxyImage class.
     * Initializes a RealImage object and defines
     * the coordinates of the region that will be accessed via the proxy.
     */

    public ProxyImage() {
        realImage = new RealImage(10, 10);
        this.x1 = 2;
        this.x2 = 8;
        this.y1 = 2;
        this.y2 = 8;
    }

    /**
     * Implementation of the {@link Image getColor()} method.
     * <p>
     * This method checks the borders of the photo and ensures that the requested coordinates in the allowed range.
     * If the coordinates are valid, it calls the {@link RealImage getColor()} method to retrieve the color of the pixel.
     * Otherwise, it prints an error message indicating that the access is denied.
     * </p>
     */

    @Override
    public void getColor(int x, int y) {
        if (x >= x1 && x <= x2 && y >= y1 && y <= y2) {
            realImage.getColor(x, y);
        } else {
            System.out.println("Access denied: coordinates outside the allowed range");
        }
    }
}

