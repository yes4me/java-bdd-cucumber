package step_definitions;

import com.thomas.base.Base;
import com.thomas.base.DriverContext;
import com.thomas.config.Settings;
import cucumber.api.PendingException;
import cucumber.api.java8.En;
import org.apache.commons.lang3.text.WordUtils;
import page_objects.HomePage;
import page_objects.LoginPage;

/**
 * Created by Thomas on 12/24/2016.
 */
public class TestSelenium_step extends Base implements En {
    public TestSelenium_step() {
        Given("^user goes to default url$", () -> {
            DriverContext.getBrowser().goUrl(Settings.url);
        });
        When("^user logins as \"([^\"]*)\" and \"([^\"]*)\"$", (String username, String password) -> {
            /* The old way
            LoginPage loginPage = new LoginPage();
            loginPage.login("admin", "password");
            HomePage homePage = (HomePage) loginPage.login("admin", "password");
            homePage.setFirstname("firstname");
            homePage.setMiddlename("middlename");
            */

            // Using Generics
            // - save memory (no need to allocate memory for each page = no more new ObjectPage() for each page)
            // - flexibility for currentPage to be any class. For example, if loginPage may return homePage or errorPage
            currentPage = getInstance(LoginPage.class);
            currentPage = currentPage.As(LoginPage.class).login(username, password);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        When("^user sets the firstname to be \"([^\"]*)\" for the home page$", (String firstname) -> {
            //FAIL_TransformMethod.runMethod(page, method, value);
            currentPage.As(HomePage.class).setFirstname(firstname);
        });
        And("^user sets the middlename to be \"([^\"]*)\" for the home page$", (String middlename) -> {
            currentPage.As(HomePage.class).setMiddlename(middlename);
        });
    }
}
