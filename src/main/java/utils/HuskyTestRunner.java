package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import page_objects.CabinetPage;
import page_objects.HomePage;

import java.util.concurrent.TimeUnit;

import static utils.PropertiesReader.getProperty;

public class HuskyTestRunner {

    protected WebDriver driver;
    protected HomePage homePage;
    protected CabinetPage cabinetPage;


    @BeforeTest
    public void setUp() throws Exception {

        WebDriverFactory webDriverFactory = new WebDriverFactory();

        driver = webDriverFactory.getDriver(getProperty("browser.name"));


//        WebDriverManager
//                .chromedriver()
//                .setup();

//
//        driver = new ChromeDriver();


//        driver
//                .manage()
//                .timeouts()
//                .implicitlyWait(10000, TimeUnit.MILLISECONDS);

        driver.get("http://huskysport.com.ua/");

        homePage = new HomePage(driver);


    }

    @AfterTest
    public void turnDown() {
        driver.quit();

    }
}
