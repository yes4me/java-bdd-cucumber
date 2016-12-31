package other_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Thomas on 12/14/2016.
 */
public class GooglePage {
    @FindBy(how = How.NAME, using = "q")
    private WebElement searchField;
    @FindBy(how = How.NAME, using = "btnG")
    private WebElement searchButton;

    public GooglePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void setSearch(String text) {
        searchField.sendKeys(text);
    }

    public void searchForm() {
        searchButton.click();
    }
}
