package stepDefinitions.Login;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import Modules.LoginPage.LoginPage;
import utils.ContextSetup;

public class LoginStep {

    public WebDriver driver;
    ContextSetup contextSetup;
    LoginPage loginPage;

    public LoginStep(ContextSetup contextSetup) {
        this.contextSetup = contextSetup;
        this.loginPage = contextSetup.pageObjectManager.getLoginPage();
        this.driver = loginPage.driver;
    }

    @Given("Check that the login page is displayed")
    public void getHomePage() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(loginPage.getLoginForm().isDisplayed());
        System.out.println(loginPage.getText);
        Assert.assertEquals(loginPage.getUsernameLabel().getText(), "User Name:");
        Assert.assertEquals(loginPage.getPasswordLabel().getText(), "Password:");
        Assert.assertEquals(loginPage.getLoginButton().getText(), "Log In");
        Thread.sleep(1000);
    }

    @And("Enter valid username and password")
    public void getCredentials() throws InterruptedException {
        loginPage.getUserName().sendKeys("superadmin");
        Thread.sleep(1000);
        loginPage.getPassword().sendKeys("123456");
        Thread.sleep(1000);
    }

    @When("Click on the login button")
    public void getLogin() throws InterruptedException {
        Assert.assertTrue(loginPage.getLoginButton().isDisplayed());
        Thread.sleep(1000);
        loginPage.getLoginButton().click();
        Thread.sleep(1000);
    }

    @When("Check that the homepage is displayed")
    public void HomePage() throws InterruptedException {
        Assert.assertTrue(loginPage.getHome().isDisplayed());
        Thread.sleep(1000);
        Assert.assertEquals(loginPage.getHome().getText(), "Laravel");
        Thread.sleep(1000);
    }

    @And("Check that the super admin is displayed top right corner")
    public void SuperAdmin() throws InterruptedException {
        Assert.assertTrue(loginPage.getSuperAdmin().isDisplayed());
        Thread.sleep(1000);
        Assert.assertEquals(loginPage.getSuperAdmin().getText(), "Super Admin");
        Thread.sleep(1000);
    }

    @When("Click on the super admin")
    public void clickOnTheSuperAdmin() throws InterruptedException {
        loginPage.getSuperAdmin().click();
        Thread.sleep(1000);
    }

    @Then("Check that the logout button is displayed")
    public void checkThatTheLogoutButtonIsDisplayed() throws InterruptedException {
        Assert.assertTrue(loginPage.getLogoutButton().isDisplayed());
        Thread.sleep(1000);
        Assert.assertEquals(loginPage.getLogoutButton().getText(), "Logout");
        Thread.sleep(1000);
    }

    @When("Click on the logout button")
    public void clickOnTheLogoutButton() throws InterruptedException {
        loginPage.getLogoutButton().click();
        Thread.sleep(1000);
    }

    @Then("Check that the login page is displayed again")
    public void LoginPageAgain() throws InterruptedException {
        Assert.assertTrue(loginPage.getLoginForm().isDisplayed());
        Assert.assertEquals(loginPage.getUsernameLabel().getText(), "User Name:");
        Assert.assertEquals(loginPage.getPasswordLabel().getText(), "Password:");
        Assert.assertEquals(loginPage.getLoginButton().getText(), "Log In");
        Thread.sleep(2000);
    }

//    TC_2
    @And("Enter invalid username and password")
    public void InvalidUsernamePassword() throws InterruptedException {
        loginPage.getUserName().sendKeys("admin");
        Thread.sleep(1000);
        loginPage.getPassword().sendKeys("12345");
        Thread.sleep(1000);
    }

    @Then("Check that the invalid message is displayed")
    public void InvalidMessage() throws InterruptedException {
        Assert.assertTrue(loginPage.getInvalidUsername().isDisplayed());
        Thread.sleep(1000);
        Assert.assertEquals(loginPage.getInvalidUsername().getText(), "Invalid User Name!");
        Thread.sleep(1000);

    }

    @And("Enter valid username and invalid password")
    public void enterValidUsernameAndInvalidPassword() throws InterruptedException {
        loginPage.getUserName().sendKeys("superadmin");
        Thread.sleep(1000);
        loginPage.getPassword().sendKeys("12345");
        Thread.sleep(1000);
    }

    @Then("Check that the error message is displayed for incorrect password")
    public void checkThatTheErrorMessageIsDisplayedForIncorrectPassword() throws InterruptedException {
        Assert.assertTrue(loginPage.getInvalidPassword().isDisplayed());
        Thread.sleep(1000);
        Assert.assertEquals(loginPage.getInvalidPassword().getText(), "Credentials do not match!");
        Thread.sleep(1000);
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
