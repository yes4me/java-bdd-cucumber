package com.thomas.base;

import org.openqa.selenium.WebDriver;

/**
 * Created by Thomas on 12/19/2016.
 * Purpose: Keep the browser and webDriver variables
 * Called by the others.SeleniumTest/*Test files to define and get the driver
 */
public class DriverContext {
    private static Browser _browser;
    private static WebDriver _driver;

    // getter and setter for _browser
    public static Browser getBrowser() {
        return _browser;
    }

    public static void setBrowser(Browser browser) {
        _browser = browser;
    }

    // getter and setter for _driver
    public static WebDriver getDriver() {
        return _driver;
    }

    public static void setDriver(WebDriver driver) {
        _driver = driver;
    }
}
