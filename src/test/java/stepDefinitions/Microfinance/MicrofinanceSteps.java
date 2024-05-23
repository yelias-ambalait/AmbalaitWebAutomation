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
        microfinancePage.getMicrofinanceModule().click();

    }

    @Then("Check that the microfinance module dashboard is displayed")
    public void MicrofinanceModuleDashboard() throws InterruptedException {
        Assert.assertTrue(microfinancePage.getMicrofinanceDashboard().isDisplayed());
        Assert.assertTrue(microfinancePage.getConfiguration().isDisplayed());
        Assert.assertEquals(microfinancePage.getConfiguration().getText(), "Configuration");

        Assert.assertTrue(microfinancePage.getSamity().isDisplayed());
        Assert.assertEquals(microfinancePage.getSamity().getText(), "Samity");

        Assert.assertTrue(microfinancePage.getMembers().isDisplayed());
        Assert.assertEquals(microfinancePage.getMembers().getText(), "Members");

        Assert.assertTrue(microfinancePage.getSavings().isDisplayed());
        Assert.assertEquals(microfinancePage.getSavings().getText(), "Savings");

        Assert.assertTrue(microfinancePage.getLoans().isDisplayed());
        Assert.assertEquals(microfinancePage.getLoans().getText(), "Loans");

        Assert.assertTrue(microfinancePage.getProcess().isDisplayed());
        Assert.assertEquals(microfinancePage.getProcess().getText(), "Process");

        Assert.assertTrue(microfinancePage.getReports().isDisplayed());
        Assert.assertEquals(microfinancePage.getReports().getText(), "Reports");

    }

    @When("Click on the Employees")
    public void Employees() throws InterruptedException {
        Assert.assertTrue(microfinancePage.getEmployees().isDisplayed());
        microfinancePage.getEmployees().click();

    }

    @Then("Check that the employee list is displayed")
    public void EmployeeList() throws InterruptedException {
        Assert.assertTrue(microfinancePage.getEmployeeList().isDisplayed());
        Assert.assertEquals(microfinancePage.getEmployeeList().getText(), "Employee List");

    }

    @And("Check that the View Icon is available")
    public void ViewIconIsAvailable() throws InterruptedException {
        Assert.assertTrue(microfinancePage.getViewIcon().isDisplayed());

    }

    @When("Click on the View Icon")
    public void ViewIcon() throws InterruptedException {
        microfinancePage.getViewIcon().click();

    }

    @Then("Check that the employee details is displayed")
    public void EmployeeDetails() throws InterruptedException {
        Assert.assertTrue(microfinancePage.getEmployeeList().isDisplayed());
        Assert.assertEquals(microfinancePage.getEmployeeList().getText(), "Employee Details");

    }

    @Then("Check that the Configuration is available")
    public void ConfigurationIsAvailable() throws InterruptedException {
        Assert.assertTrue(microfinancePage.getConfiguration().isDisplayed());
        Assert.assertEquals(microfinancePage.getConfiguration().getText(), "Configuration");

    }

    @And("Hover over the Configuration")
    public void Configuration() throws InterruptedException {
        PageObjectManager.hoverToElement(microfinancePage.getConfiguration());

    }

    @And("Hover over the General Configuration")
    public void GeneralConfiguration() throws InterruptedException {
        PageObjectManager.hoverToElement(microfinancePage.getGeneralConfig());


    }

    @When("Click on the General Configuration")
    public void GeneralConfigurationOption() throws InterruptedException {
        Assert.assertTrue(microfinancePage.getGeneralConfigOption().isDisplayed());
        microfinancePage.getGeneralConfigOption().click();

    }

    @And("Click on the Close button")
    public void CloseButton() throws InterruptedException {
        Assert.assertTrue(microfinancePage.getCloseButton().isDisplayed());
        Assert.assertEquals(microfinancePage.getCloseButton().getText(),"Close");
        microfinancePage.getCloseButton().click();

    }

}
