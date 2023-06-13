package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LambdaMyAccountPage {
    WebDriver driver;
    By continueButton = By.linkText("Continue");
    By email = By.xpath("//*[@id='input-email']");
    By passWord = By.id("input-password");
    By logIn = By.cssSelector("input.btn.btn-primary");




    public LambdaMyAccountPage(WebDriver driver){
        this.driver = driver;
    }
    public void clickContinueButton(){driver.findElement(continueButton).click();}
    public void enterEmail (String eMail){driver.findElement(email).sendKeys(eMail);}
    public void enterPassword (String pWord){driver.findElement(passWord).sendKeys(pWord);}
    public void clickonLogin(){driver.findElement(logIn).click();}



}
