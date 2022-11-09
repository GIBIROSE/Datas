package Testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions


        (features = ".//Features/Customers.feature",
        glue = {"stepdefinitions" }, 
        dryRun = false,
        monochrome = true,
        plugin = { "pretty",
				"junit:target/JUNITReports/report.xml", "json:target/JSONReports/report.json",
				"html:target/HTMLReports/report.html",

}

)
public class Runner {

}
