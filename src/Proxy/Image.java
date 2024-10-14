package Proxy;

/**
 * Interface defining the contract for an image object.
 * It provides a method to access the color of a pixel at a given coordinate.
 */
public interface Image {

    /**
     * Gets the color of the pixel at the specified coordinates.
     *
     * @param x The x-coordinate of the pixel.
     * @param y The y-coordinate of the pixel.

     */
    void getColor(int x, int y);


}
