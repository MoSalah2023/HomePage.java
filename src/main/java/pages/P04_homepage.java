package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P04_homepage extends HomePage{

    By slider1=By.linkText("1");
    By slider2=By.linkText("2");

    public P04_homepage(WebDriver driver) {
        super(driver);
    }
    public void clickOnSlider1(){
        clickOnElement(slider1);

    }
    public void clickOnSlider2(){
        clickOnElement(slider2);

    }
}
