package features.SeleniumTest;

import com.thomas.base.Base;
import com.thomas.base.BrowserList;
import com.thomas.base.DriverContext;
import com.thomas.base.FrameworkInitialize;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
import page_objects.HomePage;
import page_objects.LoginPage;

/**
 * Created by Thomas on 12/19/2016.
 */
public class LoginTest extends FrameworkInitialize {
    @Before
    public void Initialize()
    {
        //Open the browser
        InitializeBrowser(BrowserList.Firefox);
        DriverContext.getBrowser().goUrl("http://executeautomation.com/demosite/Login.html");
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
        currentPage = getInstance(LoginPage.class);
        currentPage = currentPage.As(LoginPage.class).login("admin", "password");
        Thread.sleep(1000);
        currentPage.As(HomePage.class).setFirstName("firstname");
        currentPage.As(HomePage.class).setMiddleName("middlename");
    }
}
