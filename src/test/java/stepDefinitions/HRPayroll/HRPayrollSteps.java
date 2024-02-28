package stepDefinitions.HRPayroll;

import Modules.HRPayrollModule.HRPayrollModule;
import Modules.PageObjectManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.ContextSetup;

public class HRPayrollSteps {

    public WebDriver driver;
    ContextSetup contextSetup;
    HRPayrollModule hrPayrollModule;

    public HRPayrollSteps(ContextSetup contextSetup) {
        this.contextSetup = contextSetup;
        this.hrPayrollModule = contextSetup.pageObjectManager.getHRPayrollModule();
        this.driver = hrPayrollModule.driver;
    }


    @When("Click on the HR & Payroll")
    public void HRPayroll() throws InterruptedException {
        Assert.assertTrue(hrPayrollModule.getHrPayroll().isDisplayed());
        Thread.sleep(1000);
        Assert.assertEquals(hrPayrollModule.getHrPayroll().getText(),"HR & Payroll");
        Thread.sleep(1000);
        hrPayrollModule.getHrPayroll().click();
        Thread.sleep(1000);
    }

    @And("Hover over the Information")
    public void Information() throws InterruptedException {
        PageObjectManager.hoverToElement(hrPayrollModule.getInformation());
        Thread.sleep(1000);
    }

    @And("Click on the Add Employee")
    public void AddEmployee() throws InterruptedException {
        Assert.assertTrue(hrPayrollModule.getAddEmployee().isDisplayed());
        Thread.sleep(1000);
        hrPayrollModule.getAddEmployee().click();
        Thread.sleep(1000);
    }

    @And("Fill the required fields except TIN")
    public void RequiredFieldsExceptTIN() throws InterruptedException {
        Assert.assertTrue(hrPayrollModule.getEmployeeId().isDisplayed());
        hrPayrollModule.getEmployeeId().sendKeys("5258");
        Thread.sleep(1000);
        Assert.assertTrue(hrPayrollModule.getEmployeeName().isDisplayed());
        hrPayrollModule.getEmployeeName().sendKeys("Karim");
        Thread.sleep(1000);
        Assert.assertTrue(hrPayrollModule.getFathersName().isDisplayed());
        hrPayrollModule.getFathersName().sendKeys("Rahim");
        Thread.sleep(1000);
        Assert.assertTrue(hrPayrollModule.getMothersName().isDisplayed());
        hrPayrollModule.getMothersName().sendKeys("Rabeya");
        Thread.sleep(1000);
        Assert.assertTrue(hrPayrollModule.getSex().isDisplayed());
        hrPayrollModule.getSex().click();
        Thread.sleep(1000);
        Assert.assertTrue(hrPayrollModule.getDateOfBirth().isDisplayed());
        hrPayrollModule.getDateOfBirth().sendKeys("03-05-1999");
        Thread.sleep(1000);
        Assert.assertTrue(hrPayrollModule.getNID().isDisplayed());
        hrPayrollModule.getNID().sendKeys("158995466565");
        hrPayrollModule.getNID().click();
        Thread.sleep(1000);
        Assert.assertTrue(hrPayrollModule.getMobileNo().isDisplayed());
        hrPayrollModule.getMobileNo().sendKeys("01478966522");
        Thread.sleep(1000);
        Assert.assertTrue(hrPayrollModule.getEmail().isDisplayed());
        hrPayrollModule.getEmail().sendKeys("abc@test.com");
        Thread.sleep(1000);
        hrPayrollModule.getBloodGroup();
        Thread.sleep(1000);
        hrPayrollModule.getDivision();
        Thread.sleep(1000);
        hrPayrollModule.getDistrict();
        Thread.sleep(1000);
        hrPayrollModule.getUpazila();
        Thread.sleep(1000);
        hrPayrollModule.getAddress().click();
        Thread.sleep(1000);
        hrPayrollModule.getAddress().sendKeys("Shyamoli, Dhaka");
        Thread.sleep(1000);
    }

    @And("Click on the Save button")
    public void SaveButton() throws InterruptedException {
        Assert.assertTrue(hrPayrollModule.getSaveButton().isDisplayed());
        hrPayrollModule.getSaveButton().click();
        Thread.sleep(1000);
    }

    @And("Click on the Appointment Letter List")
    public void AppointmentLetterList() throws InterruptedException {
        Assert.assertTrue(hrPayrollModule.getAppointmentLetterList().isDisplayed());
        hrPayrollModule.getAppointmentLetterList().click();
        Thread.sleep(1000);
    }

    @And("Select all required fields or specific field")
    public void BranchAndId() throws InterruptedException {
        hrPayrollModule.getSearchBranch();
        Thread.sleep(1000);
        Assert.assertTrue(hrPayrollModule.getNameOrId().isDisplayed());
        hrPayrollModule.getNameOrId().sendKeys("00016-002-00014-0908");
        Thread.sleep(1000);
    }

    @And("Click on the Search button")
    public void SearchButton() throws InterruptedException {
        hrPayrollModule.getSearchButton().click();
        Thread.sleep(1000);
    }

    @And("Click on the Document Manager")
    public void DocumentManager() throws InterruptedException {
        hrPayrollModule.getDocumentManager().click();
        Thread.sleep(1000);

    }

    @And("Click on the New Document Button")
    public void NewDocumentButton() throws InterruptedException {
        hrPayrollModule.getNewDocument().click();
        Thread.sleep(1000);

    }

    @And("Click on the Close Button from the bottom")
    public void CloseButton() throws InterruptedException {
        hrPayrollModule.getCloseButton().click();
        Thread.sleep(1000);

    }
}
