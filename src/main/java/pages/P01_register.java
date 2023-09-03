package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class P01_register extends PageBase {
    By selectGender=By.id("gender-male");
    By enterFirstName=By.id("FirstName");
    By enterLastName=By.id("LastName");
    By dropdownListDay=By.name("DateOfBirthDay");
    By dropdownListMonth=By.name("DateOfBirthMonth");
    By dropdownListYear=By.name("DateOfBirthYear");
    By enterEmail=By.id("Email");
    By enterPassword=By.id("Password");
    By enterConfirmedPassword=By.id("ConfirmPassword");
    By clickOnRegisterButton=By.id("register-button");
    public P01_register(WebDriver driver) {
        super(driver);
    }
    public void selectedGender(){
        clickOnElement(selectGender);
    }
    public void enteredFirstName(){
       setElementText(enterFirstName,"automation");
    }
    public void enteredLastName(){
        setElementText(enterLastName,"tester");
    }
    public void selectBirthdateDay() {
        Select birthDateDay = new Select(driver.findElement(dropdownListDay));
        birthDateDay.selectByValue("10");
    }
    public void selectBirthdateMonth() {
        Select birthDateDay = new Select(driver.findElement(dropdownListMonth));
        birthDateDay.selectByValue("11");
    }
    public void selectBirthdateYear() {
        Select birthDateDay = new Select(driver.findElement(dropdownListYear));
        birthDateDay.selectByValue("1996");
    }
    public void enteredEmail(){
        setElementText(enterEmail, "te1st@example.com");
    }
    public void enteredPassword(){
        setElementText(enterPassword, "P@ssw0rd");
    }
    public void enteredConfirmPassword(){
        setElementText(enterConfirmedPassword, "P@ssw0rd");
    }
    public void clickOnRegisterButton(){
        clickOnElement(clickOnRegisterButton);
    }

}
