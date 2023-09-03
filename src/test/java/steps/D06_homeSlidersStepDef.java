package steps;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.HomePage;
import pages.P04_homepage;

public class D06_homeSlidersStepDef extends TestBase {
    HomePage homePage=new HomePage(driver);
    P04_homepage p04HomePage=new P04_homepage(driver);

    @Given("user will go to  home page")
    public void user_will_go_to_home_page() {
        homePage.navigateToHomePage();
        Assert.assertEquals(driver.getTitle(),"nopCommerce demo store");

    }
    @Then("click on slider1")
    public void click_on_slider1() {
        p04HomePage.clickOnSlider1();
      Assert.assertEquals("  https://demo.nopcommerce.com/nokia-lumia-1020","https://demo.nopcommerce.com/");
      // driver.get("https://demo.nopcommerce.com/nokia-lumia-1020");

    }

    @Then("click on slider2")
    public void click_on_slider2() {
        p04HomePage.clickOnSlider2();
        Assert.assertEquals("https://demo.nopcommerce.com/iphone-6","https://demo.nopcommerce.com/");
        //driver.get(" https://demo.nopcommerce.com/iphone-6");

    }


}
