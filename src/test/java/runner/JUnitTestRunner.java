package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/"},
        glue = {"stepdefinitions", "hooks"},
        plugin = {"pretty",
                "junit:target/output/junit/junit.xml",
                "html:target/output/cucumber/cucumber-html-report.html",
                "json:target/output/cucumber/Cucumber.json",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },
        publish = true,
        tags = "@All",
        dryRun = false)

public class JUnitTestRunner {

        @BeforeClass
        public static void beforeProcesses(){}

        @AfterClass
        public static void closeProcesses(){}

}
