package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LambdaHTCSearchPage {
    WebDriver driver;
    By htcPage = By.xpath("//h1[@class='h4']");

    public LambdaHTCSearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void HTCsearchpagedisplayed() {
        driver.findElement(htcPage);
    }

    public String getPageTitle(){
        return driver.getTitle();
    }

}
