package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java8.En;
import utils.BaseUtil;

/**
 * Created by Thomas on 12/14/2016.
 */
public class Common_steps extends BaseUtil implements En {
    private BaseUtil baseUtil;

    public Common_steps(BaseUtil baseUtil) {
        this.baseUtil = baseUtil;

        Given("^user goes to url \"([^\"]*)\"$", (String url) -> {
            System.out.println("url=" + url);
            baseUtil.driver.navigate().to(url);
        });
    }
}
