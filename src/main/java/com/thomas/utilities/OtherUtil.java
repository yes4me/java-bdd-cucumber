package com.thomas.utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

/**
 * Created by Thomas on 12/31/2016.
 */
public class OtherUtil {
    public static void wait(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        }catch(Exception e) {
            // ignore
        }
    }

    public static void main(String[] args) {
        System.out.println("BEGIN");
        wait(2000);
        System.out.println("END");
    }
}
