package steps;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.HomePage;
import pages.SignupLoginPage;

public class SD_01RegistrationTestSteps extends TestBase {
    HomePage homePageObject = new HomePage(driver);
    SignupLoginPage signupLoginPageObject = new SignupLoginPage(driver);

    @Given("user is in home page")
    public void user_is_in_home_page() {
        homePageObject.navigateToHomePage();
        Assert.assertEquals(driver.getTitle(), "Automation Exercise");
    }

    @When("user clicks on signup login button")
    public void user_clicks_on_signup_login_button() {
        homePageObject.clickOnSignupLoginButton();
    }

    @When("enter his name")
    public void enter_his_name() {
        signupLoginPageObject.setSignupNameField();
    }

    @When("enter his email")
    public void enter_his_email() {
        signupLoginPageObject.setSignupEmailField();
    }

    @When("clicks on signup button")
    public void clicks_on_signup_button() {
        signupLoginPageObject.clickOnSignupButton();
    }

    @Then("user is redirected to signup page")
    public void user_is_redirected_to_signup_page() {
        Assert.assertEquals(driver.getTitle(), "Automation Exercise - Signup");
    }

    @When("enter his already registered email")
    public void enter_his_already_registered_email() {
        System.out.println("this is from scenario 2");
    }

    @Then("error message should appear to the user")
    public void error_message_should_appear_to_the_user() {
        System.out.println("this is from scenario 2");
    }

    @Given("user opens register page")
    public void user_opens_register_page() {

    }

    @When("user enters char in mobile")
    public void user_enters_char_in_mobile() {

    }

    @When("clicks on register")
    public void clicks_on_register() {

    }

    @Then("error message appears")
    public void error_message_appears() {

    }
}
