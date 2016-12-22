package com.thomas.base;

import org.openqa.selenium.WebDriver;

/**
 * Created by Thomas on 12/19/2016.
 * Purpose: This is what I called traditionally a basepage. It will contain the library for Selenium
 */
public class Browser extends Base {
    private WebDriver _driver;

    public Browser(WebDriver driver) {
        _driver = driver;
    }

    public void goUrl(String url) {
        _driver.get(url);
    }

    public void maximize() {
        _driver.manage().window().maximize();
    }
}