package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/"},
        glue = {"stepdefinitions"},
        plugin = {
                "pretty",
                "junit:target/output/junit/junit.xml",
                "html:target/output/cucumber/cucumber-html-report.html",
                "json:target/output/cucumber/Cucumber.json",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },

        tags = "",
        dryRun = true)

public class TestRunner {

}
