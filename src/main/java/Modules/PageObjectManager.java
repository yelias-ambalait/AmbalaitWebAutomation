package Modules;

import Modules.HRPayrollModule.HRPayrollModule;
import Modules.MicrofinanceModule.MicrofinanceModule;
import org.openqa.selenium.WebDriver;
import Modules.LoginPage.LoginPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PageObjectManager {

    public static WebDriver driver;

    public LoginPage loginPage;
    public MicrofinanceModule microfinanceModule;
    public HRPayrollModule hrPayrollModule;


    public  PageObjectManager(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage getLoginPage(){
        loginPage = new LoginPage(driver);
        return loginPage;
    }
    public MicrofinanceModule getMicrofinanceModule(){
        microfinanceModule = new MicrofinanceModule(driver);
        return microfinanceModule;
    }
    public HRPayrollModule getHRPayrollModule(){
        hrPayrollModule = new HRPayrollModule(driver);
        return hrPayrollModule;
    }

    public static WebElement hoverToElement(WebElement element) {
        Actions action = new Actions(driver);
        WebElement we = element;
        action.moveToElement(we).perform();
        return we;
    }

}
