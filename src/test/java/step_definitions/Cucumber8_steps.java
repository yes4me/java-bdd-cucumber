package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java8.En;

/**
 * Created by Thomas on 12/14/2016.
 */
public class Cucumber8_steps implements En {
    public Cucumber8_steps() {

        // ==================================================

        // Testing Lambda
        Given("^user test \"([^\"]*)\"$", (String something) -> {
            System.out.println("Hello, " + something);
        });
    }
}
