package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SignupPage extends PageBase{
    By passwordField = By.id("password");
    By firstNameField = By.id("first_name");
    By lastNameField = By.id("last_name");
    By addressField = By.id("address1");
    By stateField = By.id("state");
    By cityField = By.id("city");
    By zipcodeField = By.id("zipcode");
    By mobileNumberField = By.id("mobile_number");
    By createAccountButton = By.xpath("//button[@data-qa='create-account']");
    By dropdownList = By.id("days");
    public SignupPage(WebDriver driver) {
        super(driver);
    }

    public void setPassword() {
        setElementText(passwordField,"123456789");
    }
    public void selectBirthdateDay() {
        Select birthDateDay = new Select(driver.findElement(dropdownList));
        birthDateDay.selectByIndex(5);
    }
    public void setFirstName() {
        setElementText(firstNameField,"Yasser");
    }
    public void setLastName() {
        setElementText(lastNameField,"Mohamed");
    }
    public void setAddress() {
        setElementText(addressField,"6th October city");
    }
    public void setState() {
        setElementText(stateField,"Giza");
    }
    public void setCity() {
        setElementText(cityField,"6th October city");
    }
    public void setZipCode() {
        setElementText(zipcodeField,"236548");
    }
    public void setMobileNumber() {
        setElementText(mobileNumberField,"0112345689");
    }
    public void clickOnCreateAccountButton() {
        clickOnElement(createAccountButton);
    }


}
