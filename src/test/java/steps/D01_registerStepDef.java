package steps;
import io.cucumber.java.en.And;
import org.testng.Assert;
import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.P01_register;


public class D01_registerStepDef  extends TestBase {
HomePage homePage=new HomePage(driver);
P01_register p01Register=new P01_register(driver);


    @Given("user can navigate to home page")
    public void userCanNavigateToHomePage() {
        homePage.navigateToHomePage();
        Assert.assertEquals(driver.getTitle(),"nopCommerce demo store");
    }

    @When("clicks on register button")
    public void clicksOnRegisterButton() {
        homePage.clickOnRegisterButton();
    }

    @And("select gender")
    public void selectGender() {
        p01Register.selectedGender();
    }

    @And("enter first name")
    public void enterFirstName() {
        p01Register.enteredFirstName();
    }

    @And("enter last name")
    public void enterLastName() {
        p01Register.enteredLastName();
    }

    @And("enter date of birth")
    public void enterDateOfBirth() {
        p01Register.selectBirthdateDay();
        p01Register.selectBirthdateMonth();
        p01Register.selectBirthdateYear();
    }

    @And("enter email")
    public void enterEmail() {
        p01Register.enteredEmail();
    }

    @And("enter passwords")
    public void enterPasswords() {
        p01Register.enteredPassword();
        p01Register.enteredConfirmPassword();
    }

    @When("click on register button")
    public void clickOnRegisterButton() {
        p01Register.clickOnRegisterButton();
    }

    @Then("success message will appear")
    public void successMessageWillAppear() {
        Assert.assertEquals("Your registration completed","Your registration completed");
    }

}
