package org.tjc.common.utils;

import java.nio.file.Path;
import static org.tjc.common.utils.PathUtils.pathOf;

/**
 *
 * @author tjclancy
 */
public class SystemUtils {

    /**
     * Returns the string property of the user's current directory.
     *
     * @return
     */
    public static String getUserDir() {
        return System.getProperty("user.dir");
    }

    /**
     * Returns the string property of the user's home directory.
     *
     * @return
     */
    public static String getUserHome() {
        return System.getProperty("user.home");
    }

    public static Path getUserDirPath() {
        return pathOf(getUserDir());
    }

    public static Path getUserHomePath() {
        return pathOf(getUserHome());
    }
}
