package steps;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.HomePage;
import pages.P03_homePage;

public class D03_currenciesStepDef extends TestBase {
HomePage homePage=new HomePage(driver);
P03_homePage p03HomePage=new P03_homePage(driver);

    @Given("start home page")
    public void start_home_page() {
       homePage.navigateToHomePage();
        Assert.assertEquals(driver.getTitle(),"nopCommerce demo store");
    }

    @When("select euro currency")
    public void select_euro_currency() {
        p03HomePage.selectDropDownList();

    }

    @Then("assert currency")
    public void assertCurrency() {
        Assert.assertEquals(driver.findElements(By.xpath("//span[@class='price actual-price']")).get(0).getText(),"€1032.00");
        Assert.assertEquals(driver.findElements(By.xpath("//span[@class='price actual-price']")).get(1).getText(), "€1548.00");
        Assert.assertEquals(driver.findElements(By.xpath("//span[@class='price actual-price']")).get(2).getText(), "€210.70");
        Assert.assertEquals(driver.findElements(By.xpath("//span[@class='price actual-price']")).get(3).getText(), "€21.50");
    }


//    @Then("assert currency")
//    public void assertCurrency() {
//       for (int i= 0; i<p03HomePage.getItemsPrice().size();i++){
//           Assert.assertTrue(p03HomePage.getItemsPrice().get(i).contains("€"));
//       }

    }


