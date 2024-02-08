package pages.LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    public WebDriver driver;

    public String getText;

    By loginForm = By.xpath("//form[@id='login']");
    By usernameLabel = By.xpath("//label[@for='username']");
    By passwordLabel = By.xpath("//label[@for='passwd']");
    By loginButton = By.xpath("//button[@type='submit']");
    By userName = By.xpath("//input[@id='username']");
    By password = By.xpath("//input[@id='password']");
    By microFinPlus = By.xpath("//a[normalize-space()='Microfin Plus']");
    By superAdmin = By.xpath("//span[normalize-space()='Super Admin']");
    By logoutButton = By.xpath("//a[normalize-space()='Logout']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getLoginForm(){
        return driver.findElement(loginForm);
    }
    public WebElement getUsernameLabel(){
        return driver.findElement(usernameLabel);
    }
    public WebElement getPasswordLabel(){
        return driver.findElement(passwordLabel);
    }
    public WebElement getLoginButton(){
        return driver.findElement(loginButton);
    }
    public WebElement getUserName(){
        return driver.findElement(userName);
    }
    public WebElement getPassword(){
        return driver.findElement(password);
    }
    public WebElement getMicroFinPlus(){
        return driver.findElement(microFinPlus);
    }
    public WebElement getSuperAdmin(){
        return driver.findElement(superAdmin);
    }
    public WebElement getLogoutButton(){
        return driver.findElement(logoutButton);
    }
}

