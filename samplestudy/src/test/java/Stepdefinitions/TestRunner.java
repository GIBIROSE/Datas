package Stepdefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", glue = { "Stepdefinitions" },
monochrome=true,
plugin= {"pretty","junit:target/JUNITReports/report.xml",
		"json:target/JSONReports/report.json",
		"html:target/HTMLReports/report.html",


},
tags="@smoketest"
)
public class TestRunner {

}
