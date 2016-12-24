package features;

import com.thomas.base.DriverContext;
import com.thomas.config.Settings;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Thomas on 12/19/2016.
 */
public class Test_selenium {
    //Global Variable
    private WebDriver _driver = null;

    @Before
    public void Initialize() {
        Settings.populateSettings();

        //Open the browser
        System.setProperty("webdriver.gecko.driver", "vendor\\geckodriver-v0.11.1.exe");
        _driver = new FirefoxDriver();
        _driver.navigate().to("http://executeautomation.com/demosite/Login.html");
    }

    @Test
    public void Login() {
        _driver.findElement(By.name("UserName")).sendKeys("admin");
        _driver.findElement(By.name("Password")).sendKeys("password");
        _driver.findElement(By.name("Login")).submit();
    }
}
