package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/features/"},
        glue = {"stepdefinitions", "hooks"},
        plugin = {"pretty",
                "html:target/output/cucumber/cucumber-html-report.html",
                "json:target/output/cucumber/Cucumber.json",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },
        publish = true,
        tags = "@All",
        dryRun = false)
public class TestNgTestRunner extends AbstractTestNGCucumberTests {

}
