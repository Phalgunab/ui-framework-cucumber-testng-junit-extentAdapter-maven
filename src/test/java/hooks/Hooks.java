package hooks;

import driver.DriverManager;
import io.cucumber.java.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Hooks {
    private static Logger logger = LoggerFactory.getLogger(Hooks.class);
    private WebDriver driver;
    @Before
    public void doSomething() {
        logger.trace("Before Scenario Executed");
        driver = DriverManager.getDriver();
        driver.get("https://www.google.com");
        logger.info("Driver launched before test");
        Assert.assertNull(null);
    }

    @After
    public void doAfterThing() {
        logger.info("After Scenario Executed");

    }

    @BeforeStep
    public void prepareStep() {
        logger.info("Before Every Step");
    }

    @AfterStep
    public void afterStep() {
        logger.debug("After Every Step");
    }
}
