package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HTCSearchPage {
    WebDriver driver;
    By htcPage = By.xpath("//h1[@class='h4']");
    public HTCSearchPage(WebDriver driver){this.driver=driver;}
    public void HTCsearchpage(){
        driver.findElement(htcPage);
    }

}
