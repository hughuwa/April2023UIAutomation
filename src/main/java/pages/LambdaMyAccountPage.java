package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LambdaHomepage {
    WebDriver driver;
    By myAccountButton = By.xpath("'//span[contains(text(),'My account')]'");



    public LambdaHomepage(WebDriver driver){
        this.driver = driver;
    }
    public void clickOnMyAccount(){
        driver.findElements(myAccountButton).get(1).click();
    }


}
