package stepdefinitions;

import driver.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class LoginStepDefinitions {

    private static Logger logger = LoggerFactory.getLogger(LoginStepDefinitions.class);
    @Given("I navigate to page")
    public void iNavigateToPage() {
        logger.info("Inside Navigation!");
        System.out.println("Inside Navigation!");
        WebDriver driver = DriverManager.getDriver();
        driver.get("http://www.facebook.com");
        logger.info("Accessing driver from Steps");
        Assert.assertEquals("Abc","Abc");
    }

    @When("I enter user name")
    public void iEnterUserName() {
        logger.info("Inside EnterUserName!");
    }

    @And("I enter password")
    public void iEnterPassword() {
        logger.error("Inside EnterPassword!");
    }

    @And("I click on Login button")
    public void iClickOnLoginButton() {
        logger.info("Inside Navigation!");
    }

    @Then("I land on home page")
    public void iLandOnHomePage() {
    }
}
