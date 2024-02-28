package Modules.MicrofinanceModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;

public class MicrofinanceModule {

    public WebDriver driver;


    By microfinanceModule = By.xpath("//strong[normalize-space()='Micro Finance']");
    By microfinanceDashboard = By.xpath("//div[@class='viewTitle']//img");

    ArrayList<String> function = new ArrayList<String>(Arrays.asList("Configuration", "Samity", "Members", "Savings", "Loans", "Process", "Reports"));
    By configuration = By.xpath("//span[normalize-space()='Configuration']");
    By samity = By.xpath("//span[normalize-space()='Samity']");
    By members = By.xpath("(//span[normalize-space()='Members'])[2]");
    By savings = By.xpath("(//span[normalize-space()='Savings'])[3]");
    By loans = By.xpath("//span[normalize-space()='Loans']");
    By process = By.xpath("//span[normalize-space()='Process']");
    By reports = By.xpath("(//span[normalize-space()='Reports'])[2]");
    By employees = By.xpath("//p[normalize-space()='Employees']");
    By employeeList = By.xpath("//font[@color='white']");
    By viewIcon = By.xpath("//tr[1]/td[8]/a[1]/i[1]");
    By generalConfig = By.xpath("(//span[normalize-space()='General Configuration'])[1]");
    By generalConfigOption = By.xpath("//div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]");
    By closeButton = By.xpath("//a[@class='btn btn-danger closeBtn']");

    public MicrofinanceModule(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getMicrofinanceModule(){
        return driver.findElement(microfinanceModule);
    }
    public WebElement getMicrofinanceDashboard(){
        return driver.findElement(microfinanceDashboard);
    }
    public WebElement getConfiguration(){
        return driver.findElement(configuration);
    }
    public WebElement getSamity(){
        return driver.findElement(samity);
    }
    public WebElement getMembers(){
        return driver.findElement(members);
    }
    public WebElement getSavings(){
        return driver.findElement(savings);
    }
    public WebElement getLoans(){
        return driver.findElement(loans);
    }
    public WebElement getProcess(){
        return driver.findElement(process);
    }
    public WebElement getReports(){
        return driver.findElement(reports);
    }
    public WebElement getEmployees(){
        return driver.findElement(employees);
    }
    public WebElement getEmployeeList(){
        return driver.findElement(employeeList);
    }
    public WebElement getViewIcon(){
        return driver.findElement(viewIcon);
    }
    public WebElement getGeneralConfig(){
        return driver.findElement(generalConfig);
    }
    public WebElement getGeneralConfigOption(){
        return driver.findElement(generalConfigOption);
    }
    public WebElement getCloseButton(){
        return driver.findElement(closeButton);
    }
}
