package Proxy;

/**
 * Class representing a real image.
 */
public class RealImage implements Image {
    private String[][] image;

    /**
     * Constructor for the RealImage class.
     *
     * @param width The width of the image.
     * @param height The height of the image.
     */
    public RealImage(int width, int height) {

        image = new String[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                image[i][j] = "Color(" + i + "," + j + ")";
            }
        }
    }
    /**
     * Implementation of the {@link Image getColor()} method.
     * <p>
     * This method prints a pixel color to the console.
     * </p>
     */
    @Override
    public void getColor(int x, int y) {
        System.out.println(image[x][y]);
    }
}


