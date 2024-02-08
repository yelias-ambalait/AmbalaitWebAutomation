//package pages;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.interactions.Actions;
//
//import java.time.Duration;
//
//class Another{
//    public WebDriver driver;
//
//    public Another(WebDriver driver) {
//        this.driver = driver;
//    }
//
//    public WebElement hoverToElement(WebElement element){
//        Actions action = new Actions(driver);
//        WebElement we = element;
//        action.moveToElement((WebElement) we).perform();
//        return we;
//    }
//
//}
//public class Erp09 {
//
//    public static void main(String[] args) {
//        WebDriver driver;
//
//
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--remote-allow-origins=*");
//        System.setProperty("webdriver.chrome.driver", "E:\\Yelias\\Projects\\AmbalaitWebAutomation\\src\\test\\resources\\chromedriver.exe");
//        driver = new ChromeDriver(options);
//
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//        String url = "http://192.168.1.134/erp9/sajib/public/login/";
//
//        driver.get(url);
//
//        By loginForm = By.xpath("//form[@id='login']");
//        By userName = By.xpath("//input[@id='username']");
//        By password = By.xpath("//input[@id='password']");
//        By loginButton = By.xpath("//button[@type='submit']");
//        By microFin = By.xpath("//strong[normalize-space()='Micro Finance']");
//        By microFinDashboard = By.xpath("//strong[normalize-space()='Micro Finance']");
//        By members =  By.xpath("//a[@class='animated fadeInLeft']//span[@class='title'][normalize-space()='Members']");
//        By samityTransfer =  By.xpath("(//span[normalize-space()='Member Samity Transfer'])[2]");
//        By samityTransferView =  By.xpath("//tr[1]/td[10]/a[1]/i[1]");
//
//
//
//
//
//        System.out.println(driver.findElement(loginForm).getText());
//        driver.findElement(userName).sendKeys("superadmin");
//        driver.findElement(password).sendKeys("123456");
//        driver.findElement(loginButton).click();
//        driver.findElement(microFin).isDisplayed();
//        System.out.println("Dashboard: " +driver.findElement(microFin).getText());
//        driver.findElement(microFin).click();
////        driver.findElement(microFinDashboard).isDisplayed();
//
//        WebElement element = driver.findElement(members);
//
//
//        Another an = new Another(driver);
//        an.hoverToElement((WebElement) element);
//
//        driver.findElement(samityTransfer).click();
//        try {
//            driver.findElement(samityTransferView).click();
//            System.out.println("Clicked");
//        }catch (Exception e){
//            System.out.println(e);
//            System.out.println("Not clickable");
//        }
//
//    }
//}
