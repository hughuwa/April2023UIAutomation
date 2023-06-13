package StepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.LambdaCustomerPage;
import pages.LambdaHTCSearchPage;
import pages.LambdaHomepage;
import pages.LambdaMyAccountPage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class LambdaCheckoutStepDef {
    WebDriver driver;
    @Before
    public void Initialize(){
        //Creating a chrome driver instances
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        DesiredCapabilities dp = new DesiredCapabilities();
        dp.setCapability(ChromeOptions.CAPABILITY, options);
        options.merge(dp);
        driver = new ChromeDriver(options);

        //maximizing the screen
        driver.manage().window().maximize();

        //learning implicitwait
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);


    }

    @Given("I am on the Lambdatest home page {string}")
    public void i_am_on_the_lambdatest_home_page(String lambdaUrl) {
        // Write code here that turns the phrase above into concrete actions


        //Navigate to the lambda home page
//        driver.get(lambdaUrl);
        driver.navigate().to(lambdaUrl);
    }

    @When("I click on the MyAccount Menu")
    public void i_click_on_the_my_account_menu() {
        // Write code here that turns the phrase above into concrete actions
        List<WebElement> myAccount = driver.findElements(By.xpath("//span[contains(text(),'My account')]"));
        myAccount.get(1).click();
        // driver.findElements(By.xpath("//span[contains(text(),'My account')]")).get(1).click();

    }

    @When("I enter E-mail as {string},Password as {string}")
    public void i_enter_e_mail_as_password_as(String eMail, String pWord) {
//        WebElement emailAdd = driver.findElement(By.xpath("//*[@id='input-email']"));
//        emailAdd.sendKeys(eMail);
//        WebElement passWord = driver.findElement(By.id("input-password"));
//        passWord.sendKeys(pWord);
        LambdaMyAccountPage lambdaMyAccountPage = new LambdaMyAccountPage(driver);
        lambdaMyAccountPage.enterEmail(eMail);
        lambdaMyAccountPage.enterPassword(pWord);
        // Write code here that turns the phrase above into concrete actions
    }

    @When("I Click on Login button")
    public void i_click_on_login_button() {
//        WebElement logIn = driver.findElement(By.cssSelector(" input.btn.btn-primary"));
//        logIn.click();
        LambdaMyAccountPage lambdaMyAccountPage = new LambdaMyAccountPage(driver);
        lambdaMyAccountPage.clickonLogin();
        // Write code here that turns the phrase above into concrete actions
    }

    @When("I click on {string} menu")
    public void i_click_on_menu(String string) {
        List<WebElement> shopCat = driver.findElements(By.xpath("//a[@data-toggle='mz-pure-drawer']"));
        shopCat.get(7).click();
        // Write code here that turns the phrase above into concrete actions
    }

    @When("I Click on {string} from the left hand menu")
    public void i_click_on_from_the_left_hand_menu(String string) {
        WebElement softWare = driver.findElement(By.xpath("//span[contains(text(),'Software')]"));
        softWare.click();
        // Write code here that turns the phrase above into concrete actions
    }

    @When("I choose {string}")
    public void i_choose(String string) {
        WebElement palmTree = driver.findElement(By.linkText("Palm Treo Pro"));
        palmTree.click();
        // Write code here that turns the phrase above into concrete actions
    }

    @When("I click on buy now")
    public void i_click_on_buy_now() {
        WebElement buyNow = driver.findElement(By.xpath("//*[@id='entry_216843']"));
        buyNow.click();
        // Write code here that turns the phrase above into concrete actions
    }

    //    @And("populate the necessary fields")
//    public void populateTheNecessaryFields() {
//        WebElement firstName = driver.findElement(By.id("input-payment-firstname"));
//        WebElement lastName = driver.findElement(By.id("input-payment-lastname"));
//        WebElement address = driver.findElement(By.id("input-payment-address-1"));
//        WebElement city = driver.findElement(By.id("input-payment-city"));
//        WebElement postCode = driver.findElement(By.id("input-payment-postcode"));
//        WebElement country = driver.findElement(By.id("input-payment-country"));
//        WebElement zone = driver.findElement(By.id("input-payment-zone"));
//        firstName.sendKeys("aabb");
//        lastName.sendKeys("ccdd");
//        address.sendKeys("1 tower");
//        city.sendKeys("Pontypridd");
//        postCode.sendKeys("cf37");
//        Select select = new Select(country);
//        select.selectByVisibleText("United Kingdom");
//        select = new Select(zone);
//        select.selectByVisibleText("Rhondda Cynon Taff");
//    }
    @When("I accept terms and conditions")
    public void i_accept_terms_and_conditions() {
        WebElement termsCon = driver.findElement(By.xpath("//label[@for='input-agree']"));
        termsCon.click();
        // Write code here that turns the phrase above into concrete actions
    }

    @When("click on continue button")
    public void click_on_continue_button() {
        WebElement continueB = driver.findElement(By.xpath("//*[@id='button-save']"));
        continueB.click();
        // Write code here that turns the phrase above into concrete actions
    }

    @When("click on confirm order")
    public void click_on_confirm_order() {
        WebElement orderCon = driver.findElement(By.id("button-confirm"));
        orderCon.click();
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("{string} is dispalayed")
    public void is_dispalayed(String string) {
        WebElement orderDis = driver.findElement(By.xpath("//h1[@class='page-title my-3']"));
        assertThat(orderDis.getText(), is(equalTo("Your order has been placed!")));
        // Write code here that turns the phrase above into concrete actions


    }

    @And("Hoover on myAccount and Click on Login")
    public void hooverOnMyAccountAndClickOnLogin() {
        LambdaHomepage lambdaHomepage = new LambdaHomepage(driver);
        lambdaHomepage.hooveringOnMyAccount();
//        new Actions(driver).moveToElement(lambdaHomepage).perform();

    }

    @And("enter {string} on the search bar and press enter")
    public void enterOnTheSearchBarAndPressEnter(String HTC) {
        LambdaHomepage lambdaHomepage = new LambdaHomepage(driver);
        lambdaHomepage.typeOnsearchBar(HTC);
    }

    @Then("the search tab should be displayed")
    public void theSearchTabShouldBeDisplayed() {
        LambdaHTCSearchPage htcSearchPage = new LambdaHTCSearchPage(driver);
        htcSearchPage.HTCsearchpagedisplayed();
        assertThat(htcSearchPage.getPageTitle().trim().toLowerCase(), is(equalTo("Search - htc".trim().toLowerCase())));
    }

    @And("I login with the following details")
    public void iLoginWithTheFollowingDetails(List<List<String>>table) {
        LambdaMyAccountPage lambdaMyAccountPage = new LambdaMyAccountPage(driver);
        lambdaMyAccountPage.enterEmail(table.get(0).get(1));
        lambdaMyAccountPage.enterPassword(table.get(1).get(1));
        lambdaMyAccountPage.clickonLogin();
        
    }

    @Then("{string} page is displayed")
    public void pageIsDisplayed(String MyAccount) {
        LambdaCustomerPage lambdaCustomerPage = new LambdaCustomerPage(driver);
        assertThat(lambdaCustomerPage.findmyAccount(), is(equalTo("My Account")));
        
    }

    @When("I hoover and click on Logout link from the right hand menu")
    public void iHooverAndClickOnLogoutLinkFromTheRightHandMenu() {
        LambdaCustomerPage lambdaCustomerPage = new LambdaCustomerPage(driver);
        lambdaCustomerPage.HooveronMyaccountLogout();
        
    }

    @Then("{string} page should be displayed")
    public void pageShouldBeDisplayed(String AccountLogout) {
        LambdaCustomerPage lambdaCustomerPage = new LambdaCustomerPage(driver);
        assertThat(lambdaCustomerPage.findAccountLogout(),is(equalTo("Account Logout")));
    }
    @After
    public void Teardown(){
        driver.close();
        driver.quit();
    }

}

