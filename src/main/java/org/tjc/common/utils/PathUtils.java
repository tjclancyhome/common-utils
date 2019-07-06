package org.tjc.common.utils;

import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author tjclancy
 */
public final class PathUtils {
    private PathUtils() {
    }

    public static Path pathOf(String pathString) {
        return Paths.get(pathString);
    }

    public static Path pathOf(URI uri) {
        return Paths.get(uri);
    }

}
