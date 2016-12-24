package com.thomas.config;

import com.thomas.base.BrowserList;
import com.thomas.utilities.PropertiesUtil;

import java.sql.Connection;
import java.util.Map;
import java.util.Properties;

/**
 * Created by Thomas on 12/19/2016.
 */
public class Settings {
    final static String CONFIG_FILENAME = "src/main/java/com/thomas/config/config.properties";

    public static BrowserList browserName;
    public static String url;

    public static void PopulateSettings(String filename) {
        Map<String, String> data = PropertiesUtil.getAllProperties(filename);
        Settings.browserName = BrowserList.valueOf(data.get("BROWSERNAME"));
        Settings.url = data.get("URL");
    }
    public static void PopulateSettings() {
        PopulateSettings(CONFIG_FILENAME);
    }

    /* -----------------------------------------------------
    For testing purpose
    ----------------------------------------------------- */

    public static void main(String[] args) {
        PopulateSettings();
        System.out.println("browserName = " + Settings.browserName);
        System.out.println("url = " + Settings.url);
    }
}
