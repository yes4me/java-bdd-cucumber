package com.thomas.config;

import java.io.File;

/**
 * Created by Thomas on 12/21/2016.
 */
public class Paths {
    private static String getFullPath(String path, String filename) {
        StringBuilder path_file = new StringBuilder();
        path_file.append(path).append("\\").append(filename);
        return path_file.toString();
    }

    public static String getDataPath() {
        return new File("src/test/java/data/").getAbsolutePath();
    }

    public static String getDataPath(String file) {
        return getFullPath(getDataPath(), file);
    }

    public static String getVendorPath() {
        return new File("vendor/").getAbsolutePath();
    }

    public static String getVendorPath(String file) {
        return getFullPath(getVendorPath(), file);
    }
}
