package stepDefinitions.Login;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.LoginPage.LoginPage;
import utils.ContextSetup;

public class LoginStep {

    public WebDriver driver;
    ContextSetup contextSetup;
    LoginPage loginPage;
    public LoginStep(ContextSetup contextSetup){
        this.contextSetup = contextSetup;
        this.loginPage = contextSetup.pageObjectManager.getLoginPage();
        this.driver = loginPage.driver;
    }

    @Given("Check that the login page is displayed")
    public void getHomePage() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(loginPage.getLoginForm().isDisplayed());
        Assert.assertEquals(loginPage.getUsernameLabel().getText(),"User Name:");
        Assert.assertEquals(loginPage.getPasswordLabel().getText(),"Password:");
        Assert.assertEquals(loginPage.getLoginButton().getText(),"Log In");
        Thread.sleep(1000);
    }
    @And("Enter username and password")
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
        Assert.assertTrue(loginPage.getMicroFinPlus().isDisplayed());
        Thread.sleep(1000);
        Assert.assertEquals(loginPage.getMicroFinPlus().getText(),"Microfin Plus");
        Thread.sleep(1000);
    }

    @And("Check that the super admin is displayed top right corner")
    public void SuperAdmin() throws InterruptedException {
        Assert.assertTrue(loginPage.getSuperAdmin().isDisplayed());
        Thread.sleep(1000);
        Assert.assertEquals(loginPage.getSuperAdmin().getText(),"Super Admin");
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
        Assert.assertEquals(loginPage.getLogoutButton().getText(),"Logout");
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
        Assert.assertEquals(loginPage.getUsernameLabel().getText(),"User Name:");
        Assert.assertEquals(loginPage.getPasswordLabel().getText(),"Password:");
        Assert.assertEquals(loginPage.getLoginButton().getText(),"Log In");
        Thread.sleep(2000);
    }
}
