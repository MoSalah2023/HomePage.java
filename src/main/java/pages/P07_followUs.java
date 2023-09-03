package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P07_followUs extends HomePage{
    By clickOnFacebook=By.linkText("Facebook");
    By clickOnTwitter=By.linkText("Twitter");
    By clickOnRSS=By.linkText("RSS");
    By clickOnYouTube=By.linkText("YouTube");

    public P07_followUs(WebDriver driver) {
        super(driver);
    }
    public void linkOnFacebook(){
        clickOnElement(clickOnFacebook);
    }
    public void linkOnTwitter(){
        clickOnElement(clickOnTwitter);
    }
    public void linkOnRSS(){
        clickOnElement(clickOnRSS);
    }
    public void linkOnYouTube(){
        clickOnElement(clickOnYouTube);
    }


}
