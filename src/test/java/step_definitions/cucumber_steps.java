package step_definitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import page_objects.User;
import utils.BaseUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Thomas on 12/14/2016.
 */
public class cucumber_steps extends BaseUtil {
    private BaseUtil baseUtil;
    public cucumber_steps(BaseUtil baseUtil) {
        this.baseUtil = baseUtil;
    }

    @Given("^user goes to fake website$")
    public void userGoesToFakeWebsite() throws Throwable {
        System.out.println("step1: "+ baseUtil.StepInfo);
    }

    @And("^user enters the following info$")
    public void userEntersTheFollowingInfo(DataTable table) throws Throwable {
        System.out.println("step2");

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

    @Given("^user goes to fake website \"([^\"]*)\"$")
    public void userGoesToFakeWebsite(String url) throws Throwable {
        System.out.println("url=" + url);
    }
}
