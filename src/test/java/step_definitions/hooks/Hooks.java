package step_definitions.hooks;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.BaseUtil;

/**
 * Created by Thomas on 12/14/2016.
 */
public class Hooks extends BaseUtil{
    private BaseUtil baseUtil;
    public Hooks(BaseUtil baseUtil) {
        this.baseUtil = baseUtil;
    }


    // @Before is like BeforeScenario
    @Before
    public void InitializeTest(Scenario scenario)
    {
        System.out.println("** SCENARIO:" + scenario.getName());
        baseUtil.StepInfo = "Firefox driver";
    }

    // @After is like AfterScenario
    @After
    public void CompleteTest(Scenario scenario)
    {
        if (scenario.isFailed()) {
            System.out.println("** SCENARIO " + scenario.getName() + " FAILED! **");
        }
    }
}
