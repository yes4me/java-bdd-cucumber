package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import cucumber.runtime.model.CucumberScenario;
import cucumber.runtime.model.CucumberTagStatement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.List;


/**
 * Created by Thomas on 12/15/2016.
 */

@CucumberOptions(
        features = {"src/test/java/features/"},
        tags    = {"@Testing-cucumber"},
        glue    = {"step_definitions/"},
        format  = {"pretty"}
)

// For running the JUnit tests from the command line
//@RunWith(CucumberUtil.class)
//public class TestRunner {}

// For running the TestNg tests from the command line
//public class TestRunner extends AbstractTestNGCucumberTests {}

public class TestRunner {
    private TestNGCucumberRunner testNGCucumberRunner;
    //private String scenarioToRun = "Scenario: [Test#1.1] Testing cucumber (Java)";
    private String scenarioToRun = "";

    public TestRunner() {}

    @BeforeClass(alwaysRun = true)
    public void setUpClass() {
        this.testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }

    @DataProvider
    public Object[][] features() {
        return this.testNGCucumberRunner.provideFeatures();
    }
    @Test(dataProvider = "features")
    public void runFeature(CucumberFeatureWrapper cucumberFeatureWrapper) {
        // run the specific feature defined by scenarioToRun, or run everything based on the tags
        if (scenarioToRun != "") {
            List features = cucumberFeatureWrapper.getCucumberFeature().getFeatureElements();
            Iterator feature = features.iterator();

            while (feature.hasNext()) {
                CucumberTagStatement scenario = (CucumberTagStatement) feature.next();
                String scenarioName = scenario.getVisualName();
                // System.out.println("## scenario name: " + scenarioName);
                if (!scenarioName.equals(scenarioToRun)) {
                    feature.remove();
                }
            }
        }

        this.testNGCucumberRunner.runCucumber(cucumberFeatureWrapper.getCucumberFeature());
    }

    @AfterClass(alwaysRun = true)
    public void tearDownClass() throws Exception {
        this.testNGCucumberRunner.finish();
    }
}
