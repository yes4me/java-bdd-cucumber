package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.eclipse.jetty.util.security.CertificateUtils;
import org.junit.runner.RunWith;

/**
 * Created by Thomas on 12/15/2016.
 */

// For running the JUnit tests from the command line
/*
@RunWith(Cucumber.class)
@CucumberOptions(features ={"src/test/java/features"}, glue = "step_definitions")
public class TestRunner {
}
*/

// For running the TestNg tests from the command line
@CucumberOptions(
        features ={"src/test/java/features"},
        glue = "step_definitions",
        format={"json:target/cucumber.json", "html:target/site/cucumber-pretty"} )
public class TestRunner extends AbstractTestNGCucumberTests {

}
