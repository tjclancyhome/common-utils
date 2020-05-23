package org.tjc.common.utils;

import java.net.URI;
import java.nio.file.Files;
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

    public static String getFileAttributes(Path p) {
        String attributes = String.format("D:%s RF:%s EX:%s LNK:%s R:%s W:%s",
            (Files.isDirectory(p) ? "Y" : "N"),
            (Files.isRegularFile(p) ? "Y" : "N"),
            (Files.isSymbolicLink(p) ? "Y" : "N"),
            (Files.isExecutable(p) ? "Y" : "N"),
            (Files.isReadable(p) ? "Y" : "N"),
            (Files.isWritable(p) ? "Y" : "N"));
        return attributes;

    }

}
