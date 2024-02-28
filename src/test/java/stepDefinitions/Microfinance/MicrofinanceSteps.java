package stepDefinitions.Microfinance;

import Modules.MicrofinanceModule.MicrofinanceModule;
import Modules.PageObjectManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.ContextSetup;

public class MicrofinanceSteps {

    public WebDriver driver;
    ContextSetup contextSetup;
    MicrofinanceModule microfinancePage;

    public MicrofinanceSteps(ContextSetup contextSetup) {
        this.contextSetup = contextSetup;
        this.microfinancePage = contextSetup.pageObjectManager.getMicrofinanceModule();
        this.driver = microfinancePage.driver;
    }

    @Given("Click on the microfinance module")
    public void MicrofinanceModule() throws InterruptedException {
        Assert.assertTrue(microfinancePage.getMicrofinanceModule().isDisplayed());
        Thread.sleep(1000);
        microfinancePage.getMicrofinanceModule().click();
        Thread.sleep(1000);
    }

    @Then("Check that the microfinance module dashboard is displayed")
    public void MicrofinanceModuleDashboard() throws InterruptedException {
        Assert.assertTrue(microfinancePage.getMicrofinanceDashboard().isDisplayed());
        Thread.sleep(1000);

        Assert.assertTrue(microfinancePage.getConfiguration().isDisplayed());
        Assert.assertEquals(microfinancePage.getConfiguration().getText(), "Configuration");
        Thread.sleep(1000);
        Assert.assertTrue(microfinancePage.getSamity().isDisplayed());
        Assert.assertEquals(microfinancePage.getSamity().getText(), "Samity");
        Thread.sleep(1000);
        Assert.assertTrue(microfinancePage.getMembers().isDisplayed());
        Assert.assertEquals(microfinancePage.getMembers().getText(), "Members");
        Thread.sleep(1000);
        Assert.assertTrue(microfinancePage.getSavings().isDisplayed());
        Assert.assertEquals(microfinancePage.getSavings().getText(), "Savings");
        Thread.sleep(1000);
        Assert.assertTrue(microfinancePage.getLoans().isDisplayed());
        Assert.assertEquals(microfinancePage.getLoans().getText(), "Loans");
        Thread.sleep(1000);
        Assert.assertTrue(microfinancePage.getProcess().isDisplayed());
        Assert.assertEquals(microfinancePage.getProcess().getText(), "Process");
        Thread.sleep(1000);
        Assert.assertTrue(microfinancePage.getReports().isDisplayed());
        Assert.assertEquals(microfinancePage.getReports().getText(), "Reports");
        Thread.sleep(1000);
    }

    @When("Click on the Employees")
    public void Employees() throws InterruptedException {
        Assert.assertTrue(microfinancePage.getEmployees().isDisplayed());
        Thread.sleep(1000);
        microfinancePage.getEmployees().click();
        Thread.sleep(1000);
    }

    @Then("Check that the employee list is displayed")
    public void EmployeeList() throws InterruptedException {
        Assert.assertTrue(microfinancePage.getEmployeeList().isDisplayed());
        Assert.assertEquals(microfinancePage.getEmployeeList().getText(), "Employee List");
        Thread.sleep(1000);
    }

    @And("Check that the View Icon is available")
    public void ViewIconIsAvailable() throws InterruptedException {
        Assert.assertTrue(microfinancePage.getViewIcon().isDisplayed());
        Thread.sleep(1000);
    }

    @When("Click on the View Icon")
    public void ViewIcon() throws InterruptedException {
        microfinancePage.getViewIcon().click();
        Thread.sleep(1000);
    }

    @Then("Check that the employee details is displayed")
    public void EmployeeDetails() throws InterruptedException {
        Assert.assertTrue(microfinancePage.getEmployeeList().isDisplayed());
        Assert.assertEquals(microfinancePage.getEmployeeList().getText(), "Employee Details");
        Thread.sleep(1000);
    }

    @Then("Check that the Configuration is available")
    public void ConfigurationIsAvailable() throws InterruptedException {
        Assert.assertTrue(microfinancePage.getConfiguration().isDisplayed());
        Assert.assertEquals(microfinancePage.getConfiguration().getText(), "Configuration");
        Thread.sleep(1000);
    }

    @And("Hover over the Configuration")
    public void Configuration() throws InterruptedException {
        PageObjectManager.hoverToElement(microfinancePage.getConfiguration());
        Thread.sleep(1000);
    }

    @And("Hover over the General Configuration")
    public void GeneralConfiguration() throws InterruptedException {
        PageObjectManager.hoverToElement(microfinancePage.getGeneralConfig());
        Thread.sleep(2000);

    }

    @When("Click on the General Configuration")
    public void GeneralConfigurationOption() throws InterruptedException {
        Assert.assertTrue(microfinancePage.getGeneralConfigOption().isDisplayed());
        Thread.sleep(1000);
        microfinancePage.getGeneralConfigOption().click();
        Thread.sleep(1000);
    }

    @And("Click on the Close button")
    public void CloseButton() throws InterruptedException {
        Assert.assertTrue(microfinancePage.getCloseButton().isDisplayed());
        Thread.sleep(1000);
        Assert.assertEquals(microfinancePage.getCloseButton().getText(),"Close");
        Thread.sleep(1000);
        microfinancePage.getCloseButton().click();
        Thread.sleep(1000);
    }

}
