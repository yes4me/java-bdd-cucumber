package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.eclipse.jetty.util.security.CertificateUtils;
import org.junit.runner.RunWith;

/**
 * Created by Thomas on 12/15/2016.
 */

// To run the test from the command lines
@RunWith(Cucumber.class)
@CucumberOptions(features ={"src/test/java/features"}, glue = {"step_definitions"})
public class TestRunner {
}
