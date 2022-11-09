package TestRunner;

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
//import cucumber.api.junit.Cucumber;





@RunWith(Cucumber.class)
@CucumberOptions(
        features=".//Features//",
        glue="stepDefinitions",
        monochrome=true,
        tags= {"@sanity"},
        plugin= {"pretty","html:test-output"}
)
public class MyTestRunner {
}
