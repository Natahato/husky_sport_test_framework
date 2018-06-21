package utils;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import ru.yandex.qatools.allure.annotations.Attachment;
import ru.yandex.qatools.allure.annotations.Step;

import java.io.FileWriter;
import java.io.IOException;
import java.net.InetAddress;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Listener extends TestListenerAdapter {


    @Override
    public void onTestFailure(final ITestResult result) {

        final Object currentClass = result.getInstance();

        final WebDriver driver = ((HuskyTestRunner) currentClass).getDriver();

        byte[] srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);

        saveScreenshot(srcFile);
    }

    @Attachment(value = "Page screenshot", type = "image/png")
    private byte[] saveScreenshot(final byte[] screenshot) {

        return screenshot;
    }

}
