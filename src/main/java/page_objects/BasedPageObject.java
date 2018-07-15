package page_objects;

import com.sun.xml.internal.bind.v2.TODO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Waits;

import java.util.List;

public class BasedPageObject {

    WebDriver driver;
    Waits wait;

    public BasedPageObject(WebDriver driver) {
        this.driver = driver;
        wait = new Waits(driver);
    }

    public WebElement findElement(final By locator) {
        return (WebElement) wait.getPresentElement(locator);
    }
    //TODO

    public List<WebElement> findElements(final By locator) {
        return wait.getPresentElements(locator);
    }


    public void clickOn(final By locator) {
        wait
                .getClickableElement(locator)
                .click();
    }

    public void fillInput(final By locator, String variantOfSearch) {
        driver
                .findElement(locator)
                .sendKeys(variantOfSearch);
    }

}