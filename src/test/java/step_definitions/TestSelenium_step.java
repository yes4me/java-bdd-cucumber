package step_definitions;

import com.thomas.base.Base;
import cucumber.api.PendingException;
import cucumber.api.java8.En;
import page_objects.HomePage;
import page_objects.LoginPage;

/**
 * Created by Thomas on 12/24/2016.
 */
public class TestSelenium_step extends Base implements En {
    public TestSelenium_step() {
        Given("^user goes to default url$", () -> {
            /* The old way (does not work due to the page object using getInstance):
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
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            currentPage.As(HomePage.class).setFirstName("firstname");
            currentPage.As(HomePage.class).setMiddleName("middlename");
        });
    }
}
