package others.step_definitions;

import cucumber.api.java8.En;
import others.page_objects.GooglePage;
import others.utils.BaseUtil;

/**
 * Created by Thomas on 12/14/2016.
 */
public class Common_steps extends BaseUtil implements En {
    private BaseUtil baseUtil;


    public Common_steps(BaseUtil baseUtil) {
        this.baseUtil = baseUtil;

        // ==================================================

        Given("^user goes to url \"([^\"]*)\"$", (String url) -> {
            baseUtil.driver.navigate().to(url);
        });
        When("^user sets the \"([^\"]*)\" to be \"([^\"]*)\" on the \"([^\"]*)\" page$", (String arg0, String arg1, String arg2) -> {
            GooglePage google = new GooglePage(baseUtil.driver);
            google.setSearch("cat");
        });
        And("^user clicks on \"([^\"]*)\" on the \"([^\"]*)\" page$", (String arg0, String arg1) -> {
            GooglePage google = new GooglePage(baseUtil.driver);
            google.searchForm();
        });
    }
}
