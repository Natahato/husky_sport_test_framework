package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;

import java.util.List;

import static com.sun.javafx.tools.resource.DeployResource.Type.data;
import static utils.Sort.sortArrayByTitle;

public class CabinetPage extends BasedPageObject {

    public CabinetPage(WebDriver driver) {
            super(driver);
    }


    public By buttonContinue = By.xpath(".//*[@id='node-page-376']/div[2]/nav/div/div/a");
    public By myProfile = By.id("page-title");
    public By thisCardNumberDoesNotExist = By.xpath(".//*[@id='messages']/div");
    public By buttonShopping = By.xpath(".//*[@id='node-page-376']/div[2]/nav/div/div/a");
    public By buttonShoes = By.xpath(".//*[@id='dhtml_menu-5229']/a/div/div");
    public By sortShoesByLabelMillet = By.id("mid-7774");
    public By brandShoesList = By.xpath(".//span[@class='field-content']/a");





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

    public void chooseOneBrand (){

        clickOn(buttonShopping);
        clickOn(buttonShoes);
        clickOn(sortShoesByLabelMillet);

    }

    public boolean isTitleMillet (final String title){

        return sortArrayByTitle (findElements(brandShoesList), title);
    }
}
