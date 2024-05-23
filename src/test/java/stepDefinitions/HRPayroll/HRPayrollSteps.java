package stepDefinitions.HRPayroll;

import Modules.HRPayrollModule.HRPayrollModule;
import Modules.PageObjectManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.Base;
import utils.ContextSetup;

public class HRPayrollSteps {
    public WebDriver driver;
    ContextSetup contextSetup;
    HRPayrollModule hrPayrollModule;
    Base base;

    public HRPayrollSteps(ContextSetup contextSetup) {
        this.contextSetup = contextSetup;
        this.hrPayrollModule = contextSetup.pageObjectManager.getHRPayrollModule();
        this.driver = hrPayrollModule.driver;
    }


    @When("Click on the HR & Payroll")
    public void HRPayroll() throws InterruptedException {
        Assert.assertTrue(hrPayrollModule.getHrPayroll().isDisplayed());
        Assert.assertEquals(hrPayrollModule.getHrPayroll().getText(),"HR & Payroll");
        hrPayrollModule.getHrPayroll().click();

    }

    @And("Hover over the Information")
    public void Information() throws InterruptedException {
        PageObjectManager.hoverToElement(hrPayrollModule.getInformation());

    }

    @And("Click on the Add Employee")
    public void AddEmployee() throws InterruptedException {
        Assert.assertTrue(hrPayrollModule.getAddEmployee().isDisplayed());
        hrPayrollModule.getAddEmployee().click();

    }

    @And("Fill the required fields except TIN")
    public void RequiredFieldsExceptTIN() throws InterruptedException {
        Assert.assertTrue(hrPayrollModule.getEmployeeId().isDisplayed());
        hrPayrollModule.getEmployeeId().sendKeys("5258");

        Assert.assertTrue(hrPayrollModule.getEmployeeName().isDisplayed());
        hrPayrollModule.getEmployeeName().sendKeys("Karim");

        Assert.assertTrue(hrPayrollModule.getFathersName().isDisplayed());
        hrPayrollModule.getFathersName().sendKeys("Rahim");

        Assert.assertTrue(hrPayrollModule.getMothersName().isDisplayed());
        hrPayrollModule.getMothersName().sendKeys("Rabeya");

        Assert.assertTrue(hrPayrollModule.getSex().isDisplayed());
        hrPayrollModule.getSex().click();

        Assert.assertTrue(hrPayrollModule.getDateOfBirth().isDisplayed());
        hrPayrollModule.getDateOfBirth().sendKeys("03-05-1999");

        Assert.assertTrue(hrPayrollModule.getNID().isDisplayed());
        hrPayrollModule.getNID().sendKeys("158995466565");
        hrPayrollModule.getNID().click();

        Assert.assertTrue(hrPayrollModule.getMobileNo().isDisplayed());
        hrPayrollModule.getMobileNo().sendKeys("01478966522");

        Assert.assertTrue(hrPayrollModule.getEmail().isDisplayed());
        hrPayrollModule.getEmail().sendKeys("abc@test.com");

        hrPayrollModule.getBloodGroup();

        hrPayrollModule.getDivision();

        hrPayrollModule.getDistrict();

        hrPayrollModule.getUpazila();

        hrPayrollModule.getAddress().click();

        hrPayrollModule.getAddress().sendKeys("Shyamoli, Dhaka");

    }

    @And("Click on the Save button")
    public void SaveButton() throws InterruptedException {
        Assert.assertTrue(hrPayrollModule.getSaveButton().isDisplayed());
        hrPayrollModule.getSaveButton().click();

    }

    @And("Click on the Appointment Letter List")
    public void AppointmentLetterList() throws InterruptedException {
        Assert.assertTrue(hrPayrollModule.getAppointmentLetterList().isDisplayed());
        hrPayrollModule.getAppointmentLetterList().click();

    }

    @And("Select all required fields or specific field")
    public void BranchAndId() throws InterruptedException {
        hrPayrollModule.getSearchBranch();

        Assert.assertTrue(hrPayrollModule.getNameOrId().isDisplayed());
        hrPayrollModule.getNameOrId().sendKeys("00016-002-00014-0908");

    }

    @And("Click on the Search button")
    public void SearchButton() throws InterruptedException {
        hrPayrollModule.getSearchButton().click();

    }

    @And("Click on the Document Manager")
    public void DocumentManager() throws InterruptedException {
        hrPayrollModule.getDocumentManager().click();


    }

    @And("Click on the New Document Button")
    public void NewDocumentButton() throws InterruptedException {
        hrPayrollModule.getNewDocument().click();


    }

    @And("Click on the Close Button from the bottom")
    public void CloseButton() throws InterruptedException {
        hrPayrollModule.getCloseButton().click();


    }
}
