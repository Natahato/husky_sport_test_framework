package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

import static com.sun.javafx.tools.resource.DeployResource.Type.data;

public class CabinetPage extends BasedPageObject {

    public CabinetPage(WebDriver driver) {
            super(driver);
    }


    public By buttonContinue = By.xpath(".//*[@id='node-page-376']/div[2]/nav/div/div/a");
    public By myProfile = By.id("page-title");
    public By thisCardNumberDoesNotExist = By.xpath(".//*[@id='messages']/div");




    public CabinetPage welcomeToPersonalCabinet () {

        clickOn(buttonContinue);

        return this;
    }


    public String isItYourCabinet (){

      return   findElement(myProfile).getText();

    }


    public String badUser (){

       return findElement(thisCardNumberDoesNotExist).getText();
    }

}
