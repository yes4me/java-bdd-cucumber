package page_objects;

import com.thomas.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Thomas on 12/19/2016.
 */
public class HomePage extends BasePage {
    @FindBy(how = How.NAME, using = "FirstName")
    private WebElement txtFirstname;
    @FindBy(how = How.NAME, using = "MiddleName")
    private WebElement txtMiddlename;

    public HomePage() {}

    public boolean checkPage() {
        return txtFirstname.isDisplayed();
    }

    public void setFirstname(String name) {
        txtFirstname.sendKeys(name);
    }

    public void setMiddlename(String name) {
        txtMiddlename.sendKeys(name);
    }
}
