package steps;

import base.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pages.HomePage;
import pages.P02_login;
import org.testng.Assert;

public class D02_loginStepDef extends TestBase {
    HomePage homePage=new HomePage(driver);
    P02_login p02Login=new P02_login(driver);

    @When("click on login button")
    public void click_on_login_button() {
        p02Login.clickOnLoginLink();

    }

    @When("enter valid email")
    public void enter_valid_email() {
        p02Login.enterValidEmail();

    }

    @When("enter valid password")
    public void enter_valid_password() {
        p02Login.enterPassword();

    }
    @And("press on login button")
    public void pressOnLoginButton() {
        p02Login.pressOnLoginButton();
    }

    @Then("user is login success")
    public void user_is_redirect_to_login_page() {
       Assert.assertEquals(driver.getTitle(),"nopCommerce demo store. Login");


    }

    @When("enter invalid email")
    public void enter_invalid_email() {
        p02Login.enterInvalidEmail();

    }

    @Given("redirect home page")
    public void redirectHomePage() {
        homePage.navigateToHomePage();
        Assert.assertEquals(driver.getTitle(),"nopCommerce demo store");
    }


    @Then("error message should appear to the user")
    public void error_message_should_appear_to_the_user() {
        String actualMsg =  driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[1]")).getText();
        Assert.assertTrue(actualMsg.contains("Login was unsuccessful. Please correct the errors and try again."));

    }

}
