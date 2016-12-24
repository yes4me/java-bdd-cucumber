package features.SeleniumTest;

import com.thomas.base.BrowserList;
import com.thomas.base.DriverContext;
import com.thomas.base.FrameworkInitialize;
import com.thomas.config.Settings;
import com.thomas.utilities.ExcelUtil;
import jxl.read.biff.BiffException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by Thomas on 12/19/2016.
 */
public class LoginTest extends FrameworkInitialize {
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

    @Test
    public void login() throws InterruptedException {
        /*
        LoginPage loginPage = new LoginPage();
        loginPage.login("admin", "password");
        HomePage homePage = (HomePage) loginPage.login("admin", "password");
        homePage.setFirstName("firstname");
        homePage.setMiddleName("middlename");
        */

        // Using Generics
        // - save memory (no need to allocate memory for each page = no more new ObjectPage() for each page)
        // - flexibility for currentPage to be any class. For example, if loginPage may return homePage or errorPage
//        currentPage = getInstance(LoginPage.class);
//        currentPage = currentPage.As(LoginPage.class).login("admin", "password");
//        Thread.sleep(1000);
//        currentPage.As(HomePage.class).setFirstName("firstname");
//        currentPage.As(HomePage.class).setMiddleName("middlename");
    }
}
