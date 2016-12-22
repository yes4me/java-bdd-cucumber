package others.step_definitions.hooks;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import others.utils.BaseUtil;

/**
 * Created by Thomas on 12/14/2016.
 */
public class Hooks extends BaseUtil {
    private BaseUtil baseUtil;

    public Hooks(BaseUtil baseUtil) {
        this.baseUtil = baseUtil;
    }

    // ==================================================

    // @Before is like BeforeScenario
    @Before
    public void InitializeTest(Scenario scenario) {
        // Defined only to show how to inject code into CucumberUtil step definitions
        baseUtil.browser = "Firefox";

        // Setup: Firefox
        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.11.1.exe");
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette", true);
        baseUtil.driver = new FirefoxDriver(capabilities);
        //driver.navigate().to("http://www.google.com");

        // Setup: Chrome
        // System.setProperty("webdriver.chrome.driver", "D:\\Libs\\chromedriver.exe");
        // baseUtil.Driver = new ChromeDriver();

        System.out.println("** SCENARIO:" + scenario.getName() + "**");
        System.out.println();
    }

    // @After is like AfterScenario
    @After
    public void CompleteTest(Scenario scenario) {
        if (scenario.isFailed()) {
            System.out.println("** SCENARIO " + scenario.getName() + " FAILED! **");
        } else {
            baseUtil.driver.close();
        }
    }
}
