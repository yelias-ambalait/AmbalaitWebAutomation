package Problems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class JuiceShop {

    public static void main(String[] args) {
        WebDriver driver;
        String url;

        String uName = "juiceshop@yopmail.com";
        String pwd = "JuiceShop#123";

//        By account = By.xpath("//button[@id='navbarAccount']");
        By dismiss = By.xpath("//button[@aria-label='Close Welcome Banner']");
        By account = By.id("navbarAccount");
        By firstLoginButton = By.id("navbarLoginButton");
//        By email = By.xpath("//input[@id='email']");
        By email = By.id("email");
        By password = By.id("password");
        By loginButton = By.xpath("//button[@id='loginButton']");
        By addToBasket = By.xpath("(//span[contains(text(),'Add to Basket')])[1]");
        By addedNotification = By.className("mat-simple-snack-bar-content");
        By yourBasket = By.xpath("//span[normalize-space()='Your Basket']");
        By checkOut = By.id("checkoutButton");
        By addNewAddress = By.xpath("//span[normalize-space()='Add New Address']");
        By addNewAddressForm = By.xpath("//mat-card[@class='mat-card mat-focus-indicator mat-elevation-z6']");
        By country = By.xpath("//input[@id='mat-input-1']");
        By name = By.xpath("//input[@id='mat-input-2']");
        By mobileNo = By.xpath("//input[@id='mat-input-3']");
        By zipCode = By.xpath("//input[@id='mat-input-4']");
        By address = By.xpath("//textarea[@id='address']");
        By city = By.xpath("//input[@id='mat-input-6']");
        By state = By.xpath("//input[@id='mat-input-7']");
        By submitButton = By.xpath("//button[@id='submitButton']");





        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/chromedriver.exe");
        driver = new ChromeDriver(options);

//        driver.manage().window().maximize();
        url = "https://juice-shop.herokuapp.com/";
        driver.get(url);


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(dismiss));
        driver.findElement(dismiss).isDisplayed();
        driver.findElement(dismiss).click();

        driver.findElement(account).isDisplayed();
        driver.findElement(account).click();

        driver.findElement(firstLoginButton).isDisplayed();
        driver.findElement(firstLoginButton).click();

        driver.findElement(email).isDisplayed();
        driver.findElement(email).sendKeys(uName);

        driver.findElement(password).isDisplayed();
        driver.findElement(password).sendKeys(pwd);

        driver.findElement(loginButton).isDisplayed();
        driver.findElement(loginButton).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(addToBasket));
        driver.findElement(addToBasket).isDisplayed();
        driver.findElement(addToBasket).click();

//        wait.until(ExpectedConditions.presenceOfElementLocated(addedNotification));
//        driver.findElement(addedNotification).isDisplayed();
//        driver.findElement(addedNotification).getText();
//        System.out.println("Added Item: "+driver.findElement(addedNotification).getText());

        driver.findElement(yourBasket).isDisplayed();
        driver.findElement(yourBasket).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(checkOut));
        driver.findElement(checkOut).isDisplayed();
        driver.findElement(checkOut).click();
        System.out.println("Checkout done");

        driver.findElement(addNewAddress).isDisplayed();
        driver.findElement(addNewAddress).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(addNewAddressForm));
        driver.findElement(addNewAddressForm).isDisplayed();

        driver.findElement(country).isDisplayed();
        driver.findElement(country).sendKeys("country");

        driver.findElement(name).isDisplayed();
        driver.findElement(name).sendKeys("name");

        driver.findElement(mobileNo).isDisplayed();
        driver.findElement(mobileNo).sendKeys("0147896552");

        driver.findElement(zipCode).isDisplayed();
        driver.findElement(zipCode).sendKeys("6552");

        driver.findElement(address).isDisplayed();
        driver.findElement(address).sendKeys("address");

        driver.findElement(city).isDisplayed();
        driver.findElement(city).sendKeys("city");

        driver.findElement(state).isDisplayed();
        driver.findElement(state).sendKeys("state");

        driver.findElement(submitButton).isDisplayed();
//        driver.findElement(submitButton).click();


    }
}
