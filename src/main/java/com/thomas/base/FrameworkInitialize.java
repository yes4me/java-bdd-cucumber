package com.thomas.base;

import com.thomas.config.Paths;
import com.thomas.config.Settings;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Thomas on 12/19/2016.
 * Purpose: Initialize the framework
 */
public class FrameworkInitialize extends Base {
    public void InitializeBrowser(BrowserList browserType) {
        WebDriver driver = null;
        switch (browserType) {
            case Chrome: {
                driver = new ChromeDriver();
                break;
            }
            case Firefox: {
                //Open the browser
                //System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.11.1.exe");
                System.setProperty("webdriver.gecko.driver", Paths.getVendorPath("geckodriver-v0.11.1.exe"));
                driver = new FirefoxDriver();
                break;
            }
            case IE: {
                break;
            }
        }

        // Set the browser (in the Browser and DriverContext)
        DriverContext.setBrowser(new Browser(driver));
        // Set the Driver (in DriverContext)
        DriverContext.setDriver(driver);

        driver.manage().timeouts().implicitlyWait(Settings.timeoutDriver, TimeUnit.SECONDS);
    }
}
