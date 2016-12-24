package step_definitions;

import cucumber.api.java8.En;

/**
 * Created by Thomas on 12/24/2016.
 */
public class TestCucumber8_step implements En {
    public TestCucumber8_step() {
        Given("^user tests \"([^\"]*)\"$", (String text) -> {
            System.out.println(text + " PASS");
        });

    }
}
