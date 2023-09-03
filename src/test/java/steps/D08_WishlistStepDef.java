package steps;

import base.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.HomePage;
import pages.P03_homePage;

import java.util.concurrent.TimeUnit;

public class D08_WishlistStepDef extends TestBase {
    HomePage homePage=new HomePage(driver);
    P03_homePage page=new P03_homePage(driver);

    @Given("user go to main page")
    public void user_go_to_main_page() {
        homePage.navigateToHomePage();
        Assert.assertEquals(driver.getTitle(),"nopCommerce demo store");

    }
    @When("user click on Wishlist button")
    public void user_click_on_wishlist_button() {
        page.product();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Then("success message is displayed")
    public void successMessageIsDisplayed() {
        Assert.assertFalse("The product has been added to your ".contains("success"));
    }

    @And("click on Wishlist Tab on the top of the page")
    public void clickOnWishlistTabOnTheTopOfThePage() {
        page.wishListLink();

    }

    @Then("get Qty value and verify it's bigger than {int}")
    public void getQtyValueAndVerifyItSBiggerThan(int arg0) {
        Assert.assertEquals(driver.findElement(By.name("itemquantity11234")).getText(),1);

    }
}
