 package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Random;

 public class LambdaRegistrationPage {
    WebDriver driver;
    private By firstName = By.id("input-firstname");
    private By lastName = By.id("input-lastname");
    private By email = By.id("input-email");
    private By telephone = By.id("input-telephone");
    private By passWord = By.id("input-password");
    private By confirmPassword = By.id("input-confirm");
    private By privacyPolicy = By.xpath("//label[@for='input-agree']");
    private By continueButton= By.xpath("//input [@value='Continue']");



    public LambdaRegistrationPage(WebDriver driver){
        this.driver = driver;
    }
    public void enterFirstname(String fName){
        driver.findElement(firstName).sendKeys(fName);
    }
    public void enterLastname(String lName){
        driver.findElement(lastName).sendKeys(lName);
    }
    public void enterEmail(String eMail){
        driver.findElement(email).sendKeys(pNum()+ eMail);
    }
    public void enterTelephoneNumber(String tNumb){
        driver.findElement(telephone).sendKeys(tNumb);
    }
    public void enterPassword(String pWord){
        driver.findElement(passWord).sendKeys(pWord);
    }
    public void enterConfirmPassword(String pWord){
        driver.findElement(confirmPassword).sendKeys(pWord);
    }
     public void clickonPrivacyPolicy(){
         driver.findElement(privacyPolicy).click();
     }
     public void clickonContinueButton(){
         driver.findElement(continueButton).click();
     }
     static int pNum(){
         Random ran = new Random();
         return ran.nextInt(1000);
     }


}
