//package StepDefinitions;
//
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.*;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import pages.LambdaHomepage;
//import pages.LambdaMyAccountPage;
//import pages.LambdaRegisterConfirmationPage;
//import pages.LambdaRegistrationPage;
//
//import java.io.File;
//import java.io.IOException;
//import java.time.Duration;
//import java.util.List;
//import java.util.Random;
//
//import static org.hamcrest.CoreMatchers.equalTo;
//import static org.hamcrest.CoreMatchers.is;
//import static org.hamcrest.MatcherAssert.assertThat;
//
//
//public class LambdaRegisterAnAccountStepDefPOM {
//    //This second step definition is to make the code "neater"
//    WebDriver driver;
//    @Before
//    public void initialize(){
//        //Creating a chrome driver instances
//        WebDriverManager.chromedriver().setup();
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--remote-allow-origins=*");
//        DesiredCapabilities dp = new DesiredCapabilities();
//        dp.setCapability(ChromeOptions.CAPABILITY, options);
//        options.merge(dp);
//        driver = new ChromeDriver(options);
//
//        //maximizing the screen
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//    }
//
//    @Given("I am on the Lambdatest home page {string}")
//    public void i_am_on_the_lambdatest_home_page(String lambdaUrl) {
//        // Write code here that turns the phrase above into concrete actions
//
////        //Creating a chrome driver instances
////        WebDriverManager.chromedriver().setup();
////        ChromeOptions options = new ChromeOptions();
////        options.addArguments("--remote-allow-origins=*");
////        DesiredCapabilities dp = new DesiredCapabilities();
////        dp.setCapability(ChromeOptions.CAPABILITY, options);
////        options.merge(dp);
////        driver = new ChromeDriver(options);
////
////        //maximizing the screen
////        driver.manage().window().maximize();
//
//        //Navigate to the lambda home page
////        driver.get(lambdaUrl);
//        driver.navigate().to(lambdaUrl);
//    }
//
//    @When("I click on the MyAccount Menu")
//    public void i_click_on_the_my_account_menu() {
//        // Write code here that turns the phrase above into concrete actions
////        List<WebElement> myAccount = driver.findElements(By.xpath("//span[contains(text(),'My account')]"));
////        myAccount.get(1).click();
//        // driver.findElements(By.xpath("//span[contains(text(),'My account')]")).get(1).click();
//
//        //Learning how to use page of the model(object page model)
//        LambdaHomepage lambdaHomepage = new LambdaHomepage(driver);
//        lambdaHomepage.clickOnMyAccount();
//
//    }
//
//    @And("I click on continue under the New Customer")
//    public void i_click_on_continue_under_the_new_customer() {
//        // Write code here that turns the phrase above into concrete actions
////        WebElement continueButton = driver.findElement(By.linkText("Continue"));
////        continueButton.click();
////        driver.findElement(By.linkText("Continue")).click();
//       LambdaMyAccountPage lambdaMyAccountPage = new LambdaMyAccountPage(driver);
//       lambdaMyAccountPage.clickContinueButton();
//    }
//    //    @Then("the Register Account page should be displayed")
////    public void the_register_account_page_should_be_displayed() {
////        // Write code here that turns the phrase above into concrete actions
////        WebElement registerAccountH = driver.findElement(By.cssSelector("h1[class='page-title h3']"));
////        String actualResult = registerAccountH.getText();
////        assertThat(actualResult, is(equalTo("Register Account")));
////
//////        assertThat(driver.findElement(By.cssSelector("h1[class='page-title h3']")).getText(), is(equalTo("Register Account")));
////
////    }
//
//    @And("I enter valid details for First Name as {string}, Last Name as {string}, E-mail as {string}, Telephone {string}, Password as {string}, and Confirm password")
//    public void iEnterValidDetailsForFirstNameAsLastNameAsEMailAsTelephonePasswordAsAndConfirmPassword(String fName, String lName, String eMail, String tNumb, String pWord) {
//        WebElement firstName = driver.findElement(By.id("input-firstname"));
//        firstName.sendKeys(fName);
//        WebElement lastName = driver.findElement(By.id("input-lastname"));
//        lastName.sendKeys(lName);
//        WebElement emailAdd = driver.findElement(By.id("input-email"));
//        emailAdd.sendKeys(pNum() + eMail);
//        WebElement telephoneNum = driver.findElement(By.id("input-telephone"));
//        telephoneNum.sendKeys(tNumb);
//        WebElement passWord = driver.findElement(By.id("input-password"));
//        passWord.sendKeys(pWord);
//        WebElement confirmPass = driver.findElement(By.id("input-confirm"));
//        confirmPass.sendKeys(pWord);
//    }
//    static int pNum(){
//        Random ran = new Random();
//        return ran.nextInt(1000);
//    }
//
//
////    @When("I enter valid details for First Name, Last Name, E-mail, Telephone, Password, Confirm password")
////    public void i_enter_valid_details_for_first_name_last_name_e_mail_telephone_password_confirm_password() {
////        // Write code here that turns the phrase above into concrete actions
////        WebElement firstName = driver.findElement(By.id("input-firstname"));
////        firstName.sendKeys("aabb");
////        WebElement lastName = driver.findElement(By.id("input-lastname"));
////        lastName.sendKeys("ccdd");
////        WebElement emailAdd = driver.findElement(By.id("input-email"));
////        emailAdd.sendKeys("ce@e.e");
////        WebElement telephoneNum = driver.findElement(By.id("input-telephone"));
////        telephoneNum.sendKeys("123");
////        WebElement passWord = driver.findElement(By.id("input-password"));
////        passWord.sendKeys("1234");
////        WebElement confirmPass = driver.findElement(By.id("input-confirm"));
////        confirmPass.sendKeys("1234");
////
////    }
//
//    @When("I accept the privacy policy")
//    public void i_accept_the_privacy_policy() {
//        // Write code here that turns the phrase above into concrete actions
////        WebElement privacyP = driver.findElement(By.xpath("//label[@for=\"input-agree\"]"));
////        privacyP.click();
//        LambdaRegistrationPage lambdaRegistrationPage = new LambdaRegistrationPage(driver);
//        lambdaRegistrationPage.clickonPrivacyPolicy();
//
//    }
//
//    @When("I click on Continue button on the Register an Account Page")
//    public void i_click_on_continue_button_on_the_register_an_account_page() {
//        // Write code here that turns the phrase above into concrete actions
////        WebElement continueB = driver.findElement(By.xpath("//input [@value=\"Continue\"]"));
////        continueB.click();
//        LambdaRegistrationPage lambdaRegistrationPage = new LambdaRegistrationPage(driver);
//        lambdaRegistrationPage.clickonContinueButton();
//
//    }
//
//    @Then("Register confirmation page is displayed")
//    public void registerConfirmationPageIsDisplayed() {
//        // Write code here that turns the phrase above into concrete actions
////        WebElement registerConfirm = driver.findElement(By.cssSelector("h1[ class='page-title my-3']"));
////        Assert.assertTrue(registerConfirm.isDisplayed());
//        LambdaRegisterConfirmationPage lambdaRegisterConfirmationPage = new LambdaRegisterConfirmationPage(driver);
//        assertThat(lambdaRegisterConfirmationPage.getPageheader(), is(equalTo("Your Account Has Been Created!")));
//
//    }
//
//    @Then("error message Warning: You must agree to the Privacy Policy should be displayed")
//    public void errorMessageWarningYouMustAgreeToThePrivacyPolicyShouldBeDisplayed() {
//        WebElement ppMsg = driver.findElement(By.xpath("//div[contains(text(), 'Warning: You must agree to the Privacy Policy!')]"));
//        assertThat(ppMsg.getText(), is(equalTo("Warning: You must agree to the Privacy Policy!")));
//
//    };;
//
//    @When("I hover on myAccount and click register")
//    public void iHoverOnMyAccountAndClickRegister() {
//        List<WebElement> myAccount = driver.findElements(By.xpath("//span[contains(text(),'My account')]"));
//        new Actions(driver).moveToElement(myAccount.get(1)).perform();
//        //Creating a hoover action with explicit wait
//        WebElement registerLink = driver.findElement(By.xpath("//span[contains(text(),'Register')]"));
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//        wait.until(ExpectedConditions.visibilityOf(registerLink));
//        registerLink.click();
//
//
//    }
//
//    @And("I enter valid details for {string}, {string}, {string}, {string}, {string}, and Confirm password")
//    public void iEnterValidDetailsForAndConfirmPassword(String fName, String lName, String eMail, String tNumb, String pWord) {
////            WebElement firstName = driver.findElement(By.id("input-firstname"));
////            firstName.sendKeys(fName);
////            WebElement lastName = driver.findElement(By.id("input-lastname"));
////            lastName.sendKeys(lName);
////            WebElement emailAdd = driver.findElement(By.id("input-email"));
////            emailAdd.sendKeys(pNum() + eMail);
////            WebElement telephoneNum = driver.findElement(By.id("input-telephone"));
////            telephoneNum.sendKeys(tNumb);
////            WebElement passWord = driver.findElement(By.id("input-password"));
////            passWord.sendKeys(pWord);
////            WebElement confirmPass = driver.findElement(By.id("input-confirm"));
////            confirmPass.sendKeys(pWord);
//        LambdaRegistrationPage lambdaRegistrationPage = new LambdaRegistrationPage(driver);
//        lambdaRegistrationPage.enterFirstname(fName);
//        lambdaRegistrationPage.enterLastname(lName);
//        lambdaRegistrationPage.enterEmail(eMail);
//        lambdaRegistrationPage.enterTelephoneNumber(tNumb);
//        lambdaRegistrationPage.enterPassword(pWord);
//        lambdaRegistrationPage.enterConfirmPassword(pWord);
//    }
//    @After
//    public void teardown(){
//        driver.close();
//        driver.quit();
//
//    }
//    private void takeScreenshot() throws IOException {
//        TakesScreenshot scrshot = ((TakesScreenshot)driver);
//        File SrcFile=scrshot.getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(SrcFile, new File ("target/screenshot" + System.currentTimeMillis()+ ".png"));
//    }
//
//    @And("I enter valid details as")
//    public void iEnterValidDetailsAs(List<String> table) {
//        LambdaRegistrationPage lambdaRegistrationPage = new LambdaRegistrationPage(driver);
//        lambdaRegistrationPage.enterFirstname(table.get(0));
//        lambdaRegistrationPage.enterLastname(table.get(1));
//        lambdaRegistrationPage.enterEmail(table.get(2));
//        lambdaRegistrationPage.enterTelephoneNumber(table.get(3));
//        lambdaRegistrationPage.enterPassword(table.get(4));
//        lambdaRegistrationPage.enterConfirmPassword(table.get(4));
//    }
//
//    @And("I enter valid details for registration as")
//    public void iEnterValidDetailsForRegistrationAs(List<List<String>>table) {
//        LambdaRegistrationPage lambdaRegistrationPage = new LambdaRegistrationPage(driver);
//        lambdaRegistrationPage.enterFirstname(table.get(1).get(1));
//        lambdaRegistrationPage.enterLastname(table.get(2).get(1));
//        lambdaRegistrationPage.enterEmail(table.get(3).get(1));
//        lambdaRegistrationPage.enterTelephoneNumber(table.get(4).get(1));
//        lambdaRegistrationPage.enterPassword(table.get(5).get(1));
//        lambdaRegistrationPage.enterConfirmPassword(table.get(5).get(1));
//    }
//}
