package Problems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

class Another{
    public WebDriver driver;

    public Another(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement hoverToElement(WebElement element){
        Actions action = new Actions(driver);
        WebElement we = element;
        action.moveToElement((WebElement) we).perform();
        return we;
    }

}
public class Erp09 {

    public static void main(String[] args) {
        WebDriver driver;
        String url;

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/chromedriver.exe");
        driver = new ChromeDriver(options);

//        driver.manage().window().maximize();
        url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

        driver.get(url);


        By loginForm = By.className("orangehrm-login-slot");
        By userName = By.name("username");
        By password = By.name("password");
        By loginButton = By.xpath("//button[@type='submit']");
        By dashboard = By.className("oxd-topbar-header");
        By currentLoggedUserDropdown = By.className("oxd-userdropdown-name");
        By dropdownMenu = By.className("oxd-dropdown-menu");
        By logout = By.xpath("//a[contains(text(),'Logout')]");




        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(loginForm));

        WebElement loginFormDetail = driver.findElement(loginForm);
        System.out.println("Login Form Details: "+loginFormDetail.getText());

        String username = "Admin";
        WebElement userInpput = driver.findElement(userName);
        userInpput.sendKeys(username);

        String passwd = "admin123";
        WebElement loginPass = driver.findElement(password);
        loginPass.sendKeys(passwd);

        WebElement loginBtn = driver.findElement(loginButton);
        loginBtn.click();

        wait.until(ExpectedConditions.presenceOfElementLocated(dashboard));
        WebElement dashboardDetails = driver.findElement(dashboard);
        dashboardDetails.isDisplayed();
        System.out.println("Dashboard: " + dashboardDetails.getText());


        WebElement userMenu = driver.findElement(currentLoggedUserDropdown);
        userMenu.click();

//        Logout Section
//        wait.until(ExpectedConditions.presenceOfElementLocated(dropdownMenu));
//        WebElement logoutOption = driver.findElement(logout);
//        logoutOption.click();
//
//
//        wait.until(ExpectedConditions.visibilityOfElementLocated(userName));
//
//        System.out.println("Login to Logout was completed successfully");
//
//        driver.quit();

// Add user in the Admin section

        By admin = By.xpath("//span[normalize-space() = 'Admin']");
        WebElement adminSection = driver.findElement(admin);
        adminSection.click();

        By addBtn = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']");
        wait.until(ExpectedConditions.presenceOfElementLocated(addBtn));
        WebElement addButton = driver.findElement(addBtn);
        addButton.click();

        By addUser = By.className("orangehrm-card-container");
        wait.until(ExpectedConditions.presenceOfElementLocated(addUser));
        WebElement addUserForm = driver.findElement(addUser);
        addUserForm.isDisplayed();
        System.out.println(addUserForm.getText());

        By userRole = By.xpath("(//div[@class='oxd-select-text-input'])[1]");
        WebElement userRoleDropdown = driver.findElement(userRole);
        userRoleDropdown.click();

        By userRoleOpt = By.xpath("//div[contains(text(), 'Admin')]");
        WebElement userRoleOption = driver.findElement(userRoleOpt);
        wait.until(ExpectedConditions.visibilityOfElementLocated(userRoleOpt));
        userRoleOption.click();





    }
}
