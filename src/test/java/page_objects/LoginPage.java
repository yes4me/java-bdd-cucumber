package page_objects;

import com.thomas.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Thomas on 12/19/2016.
 */
public class LoginPage extends BasePage {
    @FindBy(how = How.NAME, using = "UserName")
    private WebElement txtLogin;
    @FindBy(how = How.NAME, using = "Password")
    private WebElement txtPassword;
    @FindBy(how = How.NAME, using = "Login")
    private WebElement btnSubmit;
    //@FindBy(how = How.CSS, using = "[class*='name']") private WebElement btnSubmit;

    public LoginPage() {
    }

    public BasePage login(String login, String password) {
        txtLogin.sendKeys(login);
        txtPassword.sendKeys(password);
        btnSubmit.submit();
        return getInstance(HomePage.class);
    }
}
