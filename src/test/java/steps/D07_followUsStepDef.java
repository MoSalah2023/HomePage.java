package steps;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.HomePage;
import pages.P07_followUs;

import java.util.ArrayList;

public class D07_followUsStepDef extends TestBase {

    HomePage homePage=new HomePage(driver);
    P07_followUs p07FollowUs=new P07_followUs(driver);
    @Given("click on facebook button")
    public void click_on_facebook_button() {
        p07FollowUs.linkOnFacebook();
    }
    @Then("redirect facebook page success")
    public void redirect_facebook_page_success() {
       Assert.assertEquals("https://www.facebook.com/nopCommerce","https://www.facebook.com/nopCommerce");
//        driver.get("https://www.facebook.com/nopCommerce");

    }

    @Given("click on twitter button")
    public void click_on_twitter_button() {
        p07FollowUs.linkOnTwitter();

    }
    @Then("redirect twitter page success")
    public void redirect_twitter_page_success() {
      Assert.assertEquals("https://twitter.com/nopCommerce","https://twitter.com/nopCommerce");
//        driver.get("https://twitter.com/nopCommerce");

    }

    @Given("click on rss button")
    public void click_on_rss_button() {
        p07FollowUs.linkOnRSS();

    }
    @Then("redirect rss page success")
    public void redirect_rss_page_success() {
       Assert.assertEquals("https://demo.nopcommerce.com/news/rss/1","https://rss.com/");
//        driver.get("https://demo.nopcommerce.com/news/rss/1");

    }

    @Given("click on youtube button")
    public void click_on_youtube_button() {
        p07FollowUs.linkOnYouTube();

    }
    @Then("redirect youtube page success")
    public void redirect_youtube_page_success() {
      Assert.assertEquals("https://www.youtube.com/user/nopCommerce","https://www.youtube.com/user/nopCommerce");
//        driver.get("https://www.youtube.com/user/nopCommerce");

    }


    @Given("user redirect to home page{int}")
    public void userRedirectToHomePage(int arg0) {
        homePage.navigateToHomePage();
        Assert.assertEquals(driver.getTitle(),"nopCommerce demo store");
    }


    @Then("switch between browsers")
    public void switchBetweenBrowsers() {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        System.out.println(tabs.size());
        driver.switchTo().window(tabs.get(1));
        System.out.println("tab 1:  " +driver.getCurrentUrl());
        driver.switchTo().window(tabs.get(0));
        System.out.println("tab 0:  " + driver.getCurrentUrl());
        tabs = new ArrayList<>(driver.getWindowHandles());

    }

}
