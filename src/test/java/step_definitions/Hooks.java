package step_definitions;

import com.thomas.base.Browser;
import com.thomas.base.DriverContext;
import com.thomas.base.FrameworkInitialize;
import com.thomas.config.Settings;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import java.io.IOException;

/**
 * Created by Thomas on 12/23/2016.
 */
public class Hooks extends FrameworkInitialize {
    @Before
    public void Initialize() throws IOException {
        Settings.populateSettings();

        // Open the browser
        InitializeBrowser(Settings.browserName);
    }

    @After
    public void closing() {
        //DriverContext.getDriver().quit();
    }
}
