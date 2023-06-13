package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LambdaHomepage {
    WebDriver driver;
    private By myAccountButton = By.xpath("//span[contains(text(),'My account')]");
    By loginLink = By.xpath("//span[contains(text(),'Login')]");
    By searchBar = By.xpath("//input[@name='search']");


    public LambdaHomepage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnMyAccount() {
        driver.findElements(myAccountButton).get(1).click();
    }

    public void hooveringOnMyAccount() {
        new Actions(driver).moveToElement(driver.findElements(myAccountButton).get(1)).perform();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginLink));
        driver.findElement(loginLink).click();
    }


    public void typeOnsearchBar(String HTC) {
        WebElement textbox = driver.findElement(searchBar);
        textbox.sendKeys(HTC + Keys.ENTER);

    }


}
