package page_objects;

import com.thomas.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Thomas on 12/19/2016.
 */
public class HomePage extends BasePage {
    @FindBy(how = How.NAME, using = "FirstName") private WebElement txtFirstName;
    @FindBy(how = How.NAME, using = "MiddleName") private WebElement txtMiddleName;

    public HomePage() {
    }

    public void setFirstName(String name) {
        txtFirstName.sendKeys(name);
    }
    public void setMiddleName(String name) {
        txtMiddleName.sendKeys(name);
    }
}
