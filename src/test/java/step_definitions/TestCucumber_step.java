package step_definitions;

import cucumber.api.DataTable;
import cucumber.api.Transform;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import other_objects.User;
import transformation.EmailTransform;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Thomas on 12/23/2016.
 */
public class TestCucumber_step {
    @Given("^user goes to fake url \"([^\"]*)\"$")
    public void userGoesToFakeUrl(String url) throws Throwable {
        System.out.println("user goes to the fake website: " + url);
    }

    @And("^user enters the following info$")
    public void userEntersTheFollowingInfo(DataTable table) throws Throwable {
        // Basic way to access the DataTable
        /*
        List<List<String>> data = table.raw();
        for (int i=0, size=data.size(); i<size; i++) {
            System.out.println(data.get(i));
        }
        */

        List<User> users = new ArrayList<User>();
        users = table.asList(User.class);
        for (User user : users) {
            System.out.println("username:" + user.getUsername());
            System.out.println("password:" + user.getPassword());
        }
    }

    @And("^user enters the email address as \"([^\"]*)\"$")
    public void userEnterTheEmailAddressAs(@Transform(EmailTransform.class) String email) throws Throwable {
        // @Transform will modify the parameters before using it
        System.out.println("Email: " + email);
    }
}
