package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P02_login extends PageBase{
    By clickOnLoginButton=By.linkText("Log in");
    By enterEmail=By.id("Email");
    By enterPassword=By.id("Password");
    By pressOnLoginButton=By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button");


    public P02_login(WebDriver driver) {
        super(driver);
    }
    public void clickOnLoginLink(){
     clickOnElement(clickOnLoginButton);
    }
    public void enterValidEmail(){
        setElementText(enterEmail,"test@example.com");
    }
    public void enterPassword(){
        setElementText(enterPassword,"P@ssw0rd");
    }
    public void pressOnLoginButton(){
        clickOnElement(pressOnLoginButton);
    }

    public void enterInvalidEmail(){
        setElementText(enterEmail," wrong@example.com");
    }


}
