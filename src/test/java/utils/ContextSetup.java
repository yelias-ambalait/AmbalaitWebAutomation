package utils;

import org.openqa.selenium.WebDriver;
import pages.PageObjectManager;

import java.io.IOException;

public class ContextSetup {
    public WebDriver driver;
    public PageObjectManager pageObjectManager;
    public Base base;

    public ContextSetup() throws IOException, InterruptedException {
       base = new Base();
       pageObjectManager = new PageObjectManager(base.WebDriverManager());
    }
}
