package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Thomas on 12/14/2016.
 */
public class Basepage {
    private WebDriver driver;

    public Basepage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

	/* ---------------------------------------------------------------------------
	Getter and Setter methods
	--------------------------------------------------------------------------- */

    public WebDriver getWebDriver() {
        return driver;
    }

    public void setWebDriver(WebDriver driver) {
        this.driver = driver;
    }
}
