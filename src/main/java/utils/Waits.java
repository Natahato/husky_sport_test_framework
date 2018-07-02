package utils;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static java.util.concurrent.TimeUnit.SECONDS;

public class Waits {

    private WebDriver driver;
    private int timeout = 30;

    public Waits (final WebDriver driver) {
        this.driver = driver;
    }

    public final WebElement getPresentElement(By locator) {

        return new FluentWait<WebDriver>(driver)
                .ignoring(NoSuchElementException.class)
                .pollingEvery(5, SECONDS)
                .until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public final List<WebElement> getPresentElements(By locator) {

        return new FluentWait<WebDriver>(driver)
                .ignoring(NoSuchElementException.class)
                .pollingEvery(5, SECONDS)
                .until(ExpectedConditions.visibilityOfElementLocated(locator))
                .findElements(locator);
    }

    public final WebElement getClickableElement(By locator) {

        return new WebDriverWait(driver, timeout)
                .ignoring(NoSuchElementException.class)
                .until(ExpectedConditions.elementToBeClickable(locator));
    }

    }



