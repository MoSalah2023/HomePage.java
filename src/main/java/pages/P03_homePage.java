package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;


public class P03_homePage extends HomePage {
    By dropDownList=By.id("customerCurrency");
    WebElement itemPrice = driver.findElement(By.xpath(".//*[@id='chosen_motivos_investimentos_chosen']/div[1]/ul[1]"));
    By clickOnWishlistButton=By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[3]/div/div[2]/div[3]/div[2]/button[3]");
    By clickOnWishlistLink=By.linkText("Wishlist");



    public P03_homePage(WebDriver driver) {
        super(driver);
    }
   public void selectDropDownList(){
        Select currency = new Select(driver.findElement(dropDownList));
      currency.selectByValue("https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F");

   }

//    public  List<String>  getItemsPrice(){
//        List<String> price=new ArrayList<>();
//        for(int i = 0; i<findElements(itemPrice).size(); i++){
//            String str= findElements(itemPrice).get(i).getText();
//            price.add(str);
//        }
//        return price;
//
//    }


    public void product(){
        clickOnElement(clickOnWishlistButton);
       }
       public void wishListLink(){
        clickOnElement(clickOnWishlistLink);
       }




}
