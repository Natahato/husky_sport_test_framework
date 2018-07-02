package utils;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import page_objects.CabinetPage;
import page_objects.HomePage;

import static utils.PropertiesReader.getProperty;

@Listeners(Listener.class)
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

    public WebDriver getDriver() {
        return driver;
    }

    public HomePage getHomePage() {
        return homePage;
    }

    public CabinetPage getCabinetPage() {
        return cabinetPage;
    }
}
