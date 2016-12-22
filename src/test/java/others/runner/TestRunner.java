package others.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * Created by Thomas on 12/15/2016.
 */

// For running the JUnit tests from the command line
/*
@RunWith(CucumberUtil.class)
@CucumberOptions(others.features ={"src/test/java/others.features"}, glue = "others.step_definitions")
public class TestRunner {
}
*/

// For running the TestNg tests from the command line
@CucumberOptions(features = {"src/test/java/others.features"}, glue = "others/step_definitions", format = {"json:target/cucumber.json", "html:target/site/cucumber-pretty"})
public class TestRunner extends AbstractTestNGCucumberTests {
}
