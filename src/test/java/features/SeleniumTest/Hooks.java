package features.SeleniumTest;

import com.thomas.base.DriverContext;
import com.thomas.base.FrameworkInitialize;
import com.thomas.config.Settings;
import org.junit.After;
import org.junit.Before;

import java.io.IOException;

/**
 * Created by Thomas on 12/23/2016.
 */
public class Hooks extends FrameworkInitialize {
    @Before
    public void Initialize() throws IOException {
        Settings.populateSettings();

        //Open the browser
        InitializeBrowser(Settings.browserName);
        DriverContext.getBrowser().goUrl(Settings.url);
    }

    @After
    public void closing() {
    }
}
