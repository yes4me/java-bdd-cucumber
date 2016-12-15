package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java8.En;
import org.junit.Assert;
import org.openqa.selenium.By;
import page_objects.GooglePage;
import utils.BaseUtil;

/**
 * Created by Thomas on 12/14/2016.
 */
public class Common_steps extends BaseUtil implements En {
    private BaseUtil baseUtil;

    public Common_steps(BaseUtil baseUtil) {
        this.baseUtil = baseUtil;

        Given("^user goes to url \"([^\"]*)\"$", (String url) -> {
            baseUtil.driver.navigate().to(url);
            // Assert.assertEquals("", base);
        });
        When("^user sets the \"([^\"]*)\" to be \"([^\"]*)\" on the \"([^\"]*)\" page$", (String arg0, String arg1, String arg2) -> {
            GooglePage google = new GooglePage(baseUtil.driver);
            google.setSearch("cat");
            //google.searchForm();
        });
        And("^user clicks on \"([^\"]*)\" on the \"([^\"]*)\" page$", (String arg0, String arg1) -> {
            GooglePage google = new GooglePage(baseUtil.driver);
            google.searchForm();
        });
    }
}
