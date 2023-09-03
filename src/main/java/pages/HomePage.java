package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageBase{
By clickOnRegisterButton=By.linkText("Register");
By clickOnLoginButton=By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button");

    public HomePage(WebDriver driver) {
        super(driver);
    }
 public void clickOnRegisterButton(){
clickOnElement(clickOnRegisterButton);
 }


public void navigateToHomePage(){
        driver.navigate().to("https://demo.nopcommerce.com/");
}


}
