package pages;

import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.LoginPage.LoginPage;
import pages.ModulePage;

public class PageObjectManager {

    public WebDriver driver;

    public LoginPage loginPage;
    public HomePage homePage;
    public ModulePage modulePage;

    public  PageObjectManager(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage getLoginPage(){
        loginPage = new LoginPage(driver);
        return loginPage;
    }

    public HomePage getHomePage(){
        homePage = new HomePage(driver);
        return homePage;
    }
    public ModulePage getModulePage(){
        modulePage = new ModulePage(driver);
        return modulePage;
    }


}
