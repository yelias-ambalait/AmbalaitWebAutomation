package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class Base {

    public WebDriver driver;
    public WebDriver WebDriverManager() throws IOException, InterruptedException {

        FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/global.properties");
        Properties prop = new Properties();
        prop.load(fis);

        String url = prop.getProperty("AitURL");
//        String browser_properties = prop.getProperty("browser");
//        String browser_maven = prop.getProperty("browser");
//
//        String browser = browser_maven != null ? browser_maven : browser_properties;

        if( driver == null){

            if (prop.getProperty("browser").equalsIgnoreCase("chrome")){
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--remote-allow-origins=*");
                driver = new ChromeDriver(options);
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/chromedriver.exe");

            }
//            if (browser.equalsIgnoreCase("firefox")){
//                System.setProperty("webdriver.firefox.driver", System.getProperty("user.dir") + "src/test/resources/gecko.exe");
//                driver = new FirefoxDriver();
//            }

            assert driver != null;
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();
            driver.get(url);
        }
        return driver;
    }

}
