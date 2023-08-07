package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupLoginPage extends PageBase {
    By signupNameField = By.name("name");
    By signupEmailField = By.xpath("//input[@data-qa='signup-email']");
    By signupButton = By.xpath("//button[@data-qa='signup-button']");

    public SignupLoginPage(WebDriver driver) {
        super(driver);
    }

    public void setSignupNameField() {
        setElementText(signupNameField, "Ahmed Sarhan");
    }

    public void setSignupEmailField() {
        setElementText(signupEmailField, "emaillllllll@mail.com");
    }

    public void clickOnSignupButton() {
        clickOnElement(signupButton);
    }


}
