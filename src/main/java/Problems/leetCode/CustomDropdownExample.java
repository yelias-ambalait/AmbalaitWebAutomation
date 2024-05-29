package Problems.leetCode;

//<div class="dropdown">
//<button class="dropdown-toggle">Dropdown</button>
//<ul class="dropdown-menu">
//<li class="dropdown-item">Option 1</li>
//<li class="dropdown-item">Option 2</li>
//<li class="dropdown-item">Option 3</li>
//</ul>
//</div>


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CustomDropdownExample {
    public static void main(String[] args) {
        // Set the path for the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to the web page with the custom dropdown
            driver.get("https://example.com");

            // Use WebDriverWait to wait until the dropdown toggle is present
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement dropdownToggle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("dropdown-toggle")));

            // Click the dropdown toggle to reveal the options
            dropdownToggle.click();

            // Wait until the dropdown options are visible
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("dropdown-menu")));

            // Locate and click the desired option in the dropdown (example: "Option 2")
            WebElement option = driver.findElement(By.xpath("//li[contains(text(),'Option 2')]"));
            option.click();

        } finally {
            // Close the browser after the operations are completed
            driver.quit();
        }


        // Set the path for the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize WebDriver
//        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to the OrangeHRM demo site
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

            // Use WebDriverWait to wait until the login elements are present
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
            WebElement passwordField = driver.findElement(By.name("password"));
            WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));

            // Log in to the application
            usernameField.sendKeys("Admin");
            passwordField.sendKeys("admin123");
            loginButton.click();


            // Locate the user dropdown trigger
            WebElement userDropdownTrigger = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("oxd-userdropdown-name")));

            // Click the user dropdown to reveal the options
            userDropdownTrigger.click();

            // Wait until the dropdown options are visible
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("oxd-dropdown-menu")));

            // Locate and click the desired option in the dropdown (example: "Logout")
            WebElement logoutOption = driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
            logoutOption.click();

            // Wait for the login page to be visible again
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));

        } finally {
            // Close the browser after the operations are completed
            driver.quit();
        }
    }
}
