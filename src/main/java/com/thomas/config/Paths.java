package com.thomas.config;

import java.io.File;

/**
 * Created by Thomas on 12/21/2016.
 */
public class Paths {
    // ==> C:\save\thomas\job\computer\selenium_java\code
    private final static String PATH_BASE = new File("").getAbsolutePath();

    public static String getBasePath() {
        return PATH_BASE;
    }
    public static String getDataPath() {
        String path_xls = new File("src/test/java/data/").getAbsolutePath();
        return path_xls;
    }
    public static String getDataPath(String file) {
        String path_xls = getDataPath();
        StringBuilder path_file = new StringBuilder();
        path_file.append(path_xls).append("\\").append(file);
        return path_file.toString();
    }
}
