package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LambdaCustomerPage {
    WebDriver driver;
    By myAccountHeader = By.xpath("//h2[contains(text(),'My Account')]");
    By myAccountdropdown = By.xpath("//span[contains(text(),'My account')]");
    By logOut = By.xpath("//span[contains(text(),'Logout')]");
    By accountLogoutPage = By.xpath("//h1[contains(text(),'Account Logout')]");

    public LambdaCustomerPage(WebDriver driver) {
        this.driver = driver;
    }

    public String findmyAccount() {
        return driver.findElement(myAccountHeader).getText();
    }

    public void HooveronMyaccountLogout() {
        new Actions(driver).moveToElement(driver.findElement(myAccountHeader)).perform();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(logOut)).click();
    }
    public String findAccountLogout(){
        return driver.findElement(accountLogoutPage).getText();
    }
}