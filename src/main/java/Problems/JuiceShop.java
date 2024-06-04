package Problems;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class JuiceShop {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        String url;

        String uName = "hovab13674@jzexport.com";
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
        By addedNotification = By.xpath("//span[@class='mat-simple-snack-bar-content']");
        By yourBasket = By.xpath("//span[normalize-space()='Your Basket']");
        By checkOut = By.id("checkoutButton");
        By checkOutBtn = By.xpath("//app-basket[1]/mat-card[1]/button[1]/span[1]");
        By addNewAddress = By.xpath("//span[normalize-space()='Add New Address']");
        By addNewAddressForm = By.xpath("//mat-card[@class='mat-card mat-focus-indicator mat-elevation-z6']");
        By country = By.xpath("//input[@placeholder='Please provide a country.']");
        By name = By.xpath("//input[@placeholder='Please provide a name.']");
        By mobileNo = By.xpath("//input[@placeholder='Please provide a mobile number.']");
        By zipCode = By.xpath("//input[@placeholder='Please provide a ZIP code.']");
        By address = By.xpath("//textarea[@id='address']");
        By city = By.xpath("//input[@placeholder='Please provide a city.']");
        By state = By.xpath("//input[@placeholder='Please provide a state.']");
        By submitButton = By.xpath("//button[@id='submitButton']");


        By searchButton = By.xpath("//mat-icon[normalize-space()='search']");
        By searchInput = By.xpath("//input[@id='mat-input-0']");
        By searchItems = By.xpath("//mat-grid-list[@class='mat-grid-list']");








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


//
//        wait.until(ExpectedConditions.presenceOfElementLocated(addToBasket));
//        driver.findElement(addToBasket).isDisplayed();
//        driver.findElement(addToBasket).click();
//        Thread.sleep(3000);
//
//
//        wait.until(ExpectedConditions.presenceOfElementLocated(addedNotification));
//        driver.findElement(addedNotification).isDisplayed();
//        driver.findElement(addedNotification).getText();
//        System.out.println("Added Item: "+driver.findElement(addedNotification).getText());
//
//
//        wait.until(ExpectedConditions.presenceOfElementLocated(yourBasket));
//        driver.findElement(yourBasket).isDisplayed();
//        driver.findElement(yourBasket).click();
//        Thread.sleep(2000);
//
//        wait.until(ExpectedConditions.presenceOfElementLocated(checkOut));
//        driver.findElement(checkOut).isDisplayed();
//
//        driver.findElement(checkOutBtn).isDisplayed();
//        driver.findElement(checkOutBtn).click();
//
//
//        wait.until(ExpectedConditions.presenceOfElementLocated(addNewAddress));
//        driver.findElement(addNewAddress).isDisplayed();
//        driver.findElement(addNewAddress).click();
////        Thread.sleep(2000);
//
//        wait.until(ExpectedConditions.presenceOfElementLocated(addNewAddressForm));
//        driver.findElement(addNewAddressForm).isDisplayed();
////        Thread.sleep(2000);
//
//        driver.findElement(country).isDisplayed();
//        driver.findElement(country).sendKeys("country");
//
//        driver.findElement(name).isDisplayed();
//        driver.findElement(name).sendKeys("name");
//
//        driver.findElement(mobileNo).isDisplayed();
//        driver.findElement(mobileNo).sendKeys("0147896552");
//
//        driver.findElement(zipCode).isDisplayed();
//        driver.findElement(zipCode).sendKeys("6552");
//
//        driver.findElement(address).isDisplayed();
//        driver.findElement(address).sendKeys("address");
//
//        driver.findElement(city).isDisplayed();
//        driver.findElement(city).sendKeys("city");
//
//        driver.findElement(state).isDisplayed();
//        driver.findElement(state).sendKeys("state");
//
//        driver.findElement(submitButton).isDisplayed();
//        driver.findElement(submitButton).click();



//--------------------------------Searching ------------------------------------

        driver.findElement(searchButton).isDisplayed();
        driver.findElement(searchButton).click();

        driver.findElement(searchInput).isDisplayed();
        driver.findElement(searchInput).sendKeys("apple");
        driver.findElement(searchInput).sendKeys(Keys.ENTER);

        driver.findElement(searchItems).isDisplayed();
        driver.findElement(searchItems).getText();
        System.out.println("List Items: "+driver.findElement(searchItems).getText());







    }
}
