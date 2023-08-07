package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageBase {
    By signupLoginButton = By.xpath("//a[@href='/login']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickOnSignupLoginButton() {
        clickOnElement(signupLoginButton);
    }
    public void navigateToHomePage() {
        driver.navigate().to("https://www.automationexercise.com/");
    }
}
