package Modules.HRPayrollModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HRPayrollModule {

    public WebDriver driver;

    By hrPayroll = By.xpath("//strong[normalize-space()='HR & Payroll']");
    By information = By.xpath("//span[normalize-space()='Information']");
    By addEmployee = By.xpath("//span[normalize-space()='Add Employee']");
    By employeeId = By.xpath("//input[@id='emp_id']");
    By employeeName = By.xpath("//input[@id='emp_name_eng_id']");
    By fathersName = By.xpath("//input[@id='father_name_english']");
    By mothersName = By.xpath("//input[@id='mother_name_english']");
    By sex = By.xpath("//input[@id='sex_male']");
    By dateOfBirth = By.xpath("//input[@id='date_of_birth']");
    By nidNo = By.xpath("//input[@id='nid_no']");
    By mobileNo = By.xpath("//input[@id='mobile_number']");
    By email = By.xpath("//input[@id='email']");
    By bloodGroup = By.xpath("//select[@id='blood_group']");
    By division = By.xpath("//select[@id='pre_div_id']");
    By district = By.xpath("//select[@id='pre_dis_id']");
    By upazila = By.xpath("//select[@id='pre_upa_id']");
    By address = By.xpath("//textarea[@id='present_address']");
    By saveButton = By.xpath("//input[@id='add']");
    By appointmentLetterList = By.xpath("//span[normalize-space()='Appoinment Letter List']");
    By selectBranch = By.xpath("//span[@id='select2-chosen-1']");
    By nameId = By.xpath("//input[@id='employeeId']");
    By searchButton = By.xpath("//input[@id='submit']");
    By documentManager = By.xpath("//span[normalize-space()='Document Manager']");
    By newDocument = By.xpath("//a[@class='btn btn-info pull-right addViewBtn']");
    By closeButton = By.xpath("//a[normalize-space()='Close']");

    public HRPayrollModule(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getHrPayroll() {
        return driver.findElement(hrPayroll);
    }
    public WebElement getInformation() {
        return driver.findElement(information);
    }
    public WebElement getAddEmployee() {
        return driver.findElement(addEmployee);
    }
    public WebElement getEmployeeId() {
        return driver.findElement(employeeId);
    }
    public WebElement getEmployeeName() {
        return driver.findElement(employeeName);
    }
    public WebElement getFathersName() {
        return driver.findElement(fathersName);
    }
    public WebElement getMothersName() {
        return driver.findElement(mothersName);
    }
    public WebElement getSex() {
        return driver.findElement(sex);
    }
    public WebElement getDateOfBirth() {
        return driver.findElement(dateOfBirth);
    }
    public WebElement getNID() {
        return driver.findElement(nidNo);
    }
    public WebElement getMobileNo() {
        return driver.findElement(mobileNo);
    }
    public WebElement getEmail() {
        return driver.findElement(email);
    }

    public void getBloodGroup() {
        Select select = new Select(driver.findElement(bloodGroup));
        select.selectByValue("A+");

    }
    public void getDivision() {
        Select s1 = new Select(driver.findElement(division));
        s1.selectByIndex(2);

    }
    public void getDistrict() {
        Select s2 = new Select(driver.findElement(district));
        s2.selectByVisibleText("Brahmanbaria");
    }
    public void getUpazila() {
        Select s3 = new Select(driver.findElement(upazila));
        s3.selectByVisibleText("Brahmanbaria Sadar");
    }
    public WebElement getAddress() {
        return driver.findElement(address);
    }
    public WebElement getSaveButton() {
        return driver.findElement(saveButton);
    }
    public WebElement getAppointmentLetterList() {
        return driver.findElement(appointmentLetterList);
    }

    public void getSelectBranch() {
        Select s = new Select(driver.findElement(selectBranch));
        s.selectByIndex(1);
    }
    public WebElement getNameOrId() {
        return driver.findElement(nameId);
    }
    public WebElement getSearchButton() {
        return driver.findElement(searchButton);
    }
    public WebElement getDocumentManager() {
        return driver.findElement(documentManager);
    }
    public WebElement getNewDocument() {
        return driver.findElement(newDocument);
    }
    public WebElement getCloseButton() {
        return driver.findElement(closeButton);
    }
}