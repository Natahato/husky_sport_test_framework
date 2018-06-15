package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {

    protected WebDriver driver;

    public WebDriver getDriver(final  String browserName) throws Exception {

        switch (browserName) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                return driver = new ChromeDriver();

            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                return driver = new FirefoxDriver();

            default:
                throw new Exception("Invalid browser name");
        }
    }
}
