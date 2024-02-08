package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ModulePage {

    public WebDriver driver;

    By example = By.xpath("//tag[@attribute='value']");
    public ModulePage(WebDriver driver) {
        this.driver = driver;
    }
}
