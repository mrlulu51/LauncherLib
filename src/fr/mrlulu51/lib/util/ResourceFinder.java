package fr.mrlulu51.lib.util;

import fr.mrlulu51.lib.system.Error;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class ResourceFinder {

    private static String path;

    public static BufferedImage findImage(String imageLocation) throws Throwable {
        try {
            return ImageIO.read(ResourceFinder.class.getResourceAsStream(getPath() + "/" + imageLocation));
        }catch (IOException e) {
            throw Error.printError("Can't load the image (" + getPath() + "/" + imageLocation + "): " + e);
        }
    }

    public static String getPath() {
        return path;
    }

    public static void setPath(String path) {
        ResourceFinder.path = path.endsWith("/") ? path.substring(0, path.length() - 1) : path;
    }
}
