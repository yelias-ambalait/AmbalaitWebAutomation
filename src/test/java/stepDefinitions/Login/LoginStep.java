package stepDefinitions.Login;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import Modules.LoginPage.LoginPage;
import utils.ContextSetup;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class LoginStep {



    public WebDriver driver;
    ContextSetup contextSetup;
    LoginPage loginPage;
    Properties properties;

    public LoginStep(ContextSetup contextSetup) {
        this.contextSetup = contextSetup;
        this.loginPage = contextSetup.pageObjectManager.getLoginPage();
        this.driver = loginPage.driver;
        properties = new Properties();
        try {
            properties.load(new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/global.properties"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Given("Check that the login page is displayed")
    public void getHomePage() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(loginPage.driver, Duration.ofSeconds(7));
        wait.until(ExpectedConditions.visibilityOf(loginPage.getLoginForm()));
        Assert.assertTrue(loginPage.getLoginForm().isDisplayed());
//        System.out.println(loginPage.getText);
//        Assert.assertEquals(loginPage.getUsernameLabel().getText(), "User Name:");
//        Assert.assertEquals(loginPage.getPasswordLabel().getText(), "Password:");
//        System.out.println("before login");
//        Assert.assertEquals(loginPage.getLoginButton().getText(), "Log In");

    }

    @And("Enter valid username and password")
    public void getCredentials() throws InterruptedException {

//        String userName = System.getenv("USERNAME");
//        String pwd = System.getenv("PASSWORD");

        String username = properties.getProperty("username");
        String password = properties.getProperty("password");


        loginPage.getUserName().sendKeys(username);
        loginPage.getPassword().sendKeys(password);
    }

    @When("Click on the login button")
    public void getLogin() throws InterruptedException {
        Assert.assertTrue(loginPage.getLoginButton().isDisplayed());

        loginPage.getLoginButton().click();

    }

    @When("Check that the homepage is displayed")
    public void HomePage() throws InterruptedException {
        Assert.assertTrue(loginPage.getHome().isDisplayed());

        Assert.assertEquals(loginPage.getHome().getText(), "Laravel");

    }

    @And("Check that the super admin is displayed top right corner")
    public void SuperAdmin() throws InterruptedException {
        Assert.assertTrue(loginPage.getSuperAdmin().isDisplayed());

        Assert.assertEquals(loginPage.getSuperAdmin().getText(), "Super Admin");

    }

    @When("Click on the super admin")
    public void clickOnTheSuperAdmin() throws InterruptedException {
        loginPage.getSuperAdmin().click();

    }

    @Then("Check that the logout button is displayed")
    public void checkThatTheLogoutButtonIsDisplayed() throws InterruptedException {
        Assert.assertTrue(loginPage.getLogoutButton().isDisplayed());

        Assert.assertEquals(loginPage.getLogoutButton().getText(), "Logout");

    }

    @When("Click on the logout button")
    public void clickOnTheLogoutButton() throws InterruptedException {
        loginPage.getLogoutButton().click();

    }

    @Then("Check that the login page is displayed again")
    public void LoginPageAgain() throws InterruptedException {
        Assert.assertTrue(loginPage.getLoginForm().isDisplayed());
        System.out.println(loginPage.getText);
//        System.out.println("Before username");
//        Assert.assertEquals(loginPage.getUsernameLabel().getText(), "User Name:");
//        System.out.println("After username");
//        Assert.assertEquals(loginPage.getPasswordLabel().getText(), "Password:");
//        Assert.assertEquals(loginPage.getLoginButton().getText(), "Log In");

    }

//    TC_2
    @And("Enter invalid username and password")
    public void InvalidUsernamePassword() throws InterruptedException {
        loginPage.getUserName().sendKeys("admin");
        loginPage.getPassword().sendKeys("12345");

    }

    @Then("Check that the invalid message is displayed")
    public void InvalidMessage() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(loginPage.getInvalidUsername().isDisplayed());

        Assert.assertEquals(loginPage.getInvalidUsername().getText(), "Invalid User Name!");


    }

    @And("Enter valid username and invalid password")
    public void enterValidUsernameAndInvalidPassword() throws InterruptedException {
        loginPage.getUserName().sendKeys("superadmin");

        loginPage.getPassword().sendKeys("12345");

    }

    @Then("Check that the error message is displayed for incorrect password")
    public void checkThatTheErrorMessageIsDisplayedForIncorrectPassword() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOf(loginPage.getInvalidPassword()));
        Assert.assertTrue(loginPage.getInvalidPassword().isDisplayed());

        Assert.assertEquals(loginPage.getInvalidPassword().getText(), "Credentials do not match!");

    }


//    ----------------------------------------------------------------------------------------------------
//@Given("Check that the login page is displayed")
//public void check_that_the_login_page_is_displayed() {
//    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
//}
//    @Given("Enter valid username and password")
//    public void enter_valid_username_and_password() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @When("Click on the login button")
//    public void click_on_the_login_button() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("Check that the homepage is displayed")
//    public void check_that_the_homepage_is_displayed() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("Check that the super admin is displayed top right corner")
//    public void check_that_the_super_admin_is_displayed_top_right_corner() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @When("Click on the super admin")
//    public void click_on_the_super_admin() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("Check that the logout button is displayed")
//    public void check_that_the_logout_button_is_displayed() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @When("Click on the logout button")
//    public void click_on_the_logout_button() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("Check that the login page is displayed again")
//    public void check_that_the_login_page_is_displayed_again() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }

}
