package step_definitions;

import cucumber.api.DataTable;
import cucumber.api.Transform;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import page_objects.User;
import transformation.EmailTransform;
import utils.BaseUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Thomas on 12/14/2016.
 */
public class Cucumber_steps extends BaseUtil {
    // Defined only to show how to inject code into Cucumber step definitions
    private BaseUtil baseUtil;
    public Cucumber_steps(BaseUtil baseUtil) {
        this.baseUtil = baseUtil;
    }

    // ==================================================

    @Given("^user goes to fake website$")
    public void userGoesToFakeWebsite() throws Throwable {
        System.out.println("env StepInfo: "+ baseUtil.browser);
    }

    @Given("^user goes to fake website \"([^\"]*)\"$")
    public void userGoesToFakeWebsite(String url) throws Throwable {
        System.out.println("url=" + url);
    }

    @And("^user enters the following info$")
    public void userEntersTheFollowingInfo(DataTable table) throws Throwable {
//        List<List<String>> data = table.raw();
//        for (int i = 0; i < data.size(); i++) {
//            System.out.println(data.get(i));
//        }

        List<User> users = new ArrayList<User>();
        users = table.asList(User.class);

        for (User user: users) {
            System.out.println("username:" + user.getUsername());
            System.out.println("password:" + user.getPassword());
        }
    }

    @And("^user enter the email address as \"([^\"]*)\"$")
    public void userEnterTheEmailAddressAs(@Transform(EmailTransform.class) String email) throws Throwable {
        // @Transform will modify the parameters before using it
        System.out.println("## Email: "+ email +"##");
    }
}
