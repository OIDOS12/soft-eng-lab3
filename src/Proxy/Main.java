package Proxy;

/**
 * Main class that represents a client-side application.
 */
public class Main {
    /**
     * The main method of the application.
     *
     * @param args
     */
    public static void main(String[] args) {

        /**
         * Create a new instance of the proxy image.
         */

        Image proxyImage = new ProxyImage();

        /**
         * Access a pixel from the proxy image at coordinates (5, 6).
         */

        proxyImage.getColor(5, 6);

        /**
         * Access a pixel from the proxy image at coordinates (0, 2).
         */

        proxyImage.getColor(0, 2);

        /**
         * Access a pixel from the proxy image at coordinates (2, 5).
         */

        proxyImage.getColor(2, 5);

        /**
         * Access a pixel from the proxy image at coordinates (9, 9).
         */

        proxyImage.getColor(9, 9);

        /**
         * Access a pixel from the proxy image at coordinates (7, 7).
         */

        proxyImage.getColor(7, 7);

    }
}



