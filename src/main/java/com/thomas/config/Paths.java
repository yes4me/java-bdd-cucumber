package com.thomas.config;

import com.thomas.utilities.FileUtil;

import java.io.File;

/**
 * Created by Thomas on 12/21/2016.
 */
public class Paths {
    private static String getPath(String defaultPath, String... file) {
        String filename = (file.length>0)? file[0] : defaultPath;
        return FileUtil.getFullpath(filename);
    }

    // For properties files
    public static String getPropertiesPath(String... file) {
        return getPath("src/main/java/com/thomas/config/", file);
    }

    // For XLS files
    public static String getDataPath(String... file) {
        return getPath("src/test/java/data/", file);
    }

    // For Selenium webdriver
    public static String getVendorPath(String... file) {
        return getPath("vendor/", file);
    }

    /* -----------------------------------------------------
    For testing purpose
    ----------------------------------------------------- */

    public static void main(String[] args) {
        System.out.println( getPropertiesPath() );
        System.out.println( getDataPath() );
        System.out.println( getVendorPath() );
    }
}
