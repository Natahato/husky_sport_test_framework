package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.testng.Assert.assertEquals;
import static utils.Sort.isListElementsOfGlassesEquals;
import static utils.Sort.sortArrayByTitle;

public class HomePage extends BasedPageObject {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public By logo = By.id("logo");
    public By searchBlock = By.id("edit-search-block-form--2");
    public By buttonSearch = By.id("edit-submit");
    public By ropesList = By.xpath(".//*[@id='block-system-main']//div[@class='views-row views-row-1 views-row-odd views-row-first']");
    public By ropePrice = By.xpath(".//a[text()='Динамічна мотузка Skylotec CIMAI DRY']/following::td[2]");
    public By buttonTent = By.xpath(".//*[@id='dhtml_menu-5082']/a/div/div");
    public By pageNumber = By.xpath(".//*[@id='block-system-main']/div/div/div/div[2]/ul/li[6]/a");
    public By buttonDetails = By.xpath(".//*[@id='block-system-main']//div[3]/div[10]/div[4]/span/a");
    public By buttonBuyIt = By.id("button-cart");
    public By shoppingList = By.xpath(".//*[@id='block-block-7']/div/div/div[1]/a");
    public By tentInBasket = By.xpath("(.//*[@id='block-system-main']//table[@class='table table-bordered']//a)[2]");
    public By enterToClub = By.id("edit-name--3");
    public By buttonOk = By.id("edit-submit--4");
    public By buttonGlasses = By.xpath(".//*[@id='dhtml_menu-5238']/a/div/div");
    public By glassesList = By.xpath(".//*[@id='block-system-main']//descendant::div[@class='views-row views-row-1 views-row-odd views-row-first']");


    public HomePage lookingForRope() {

        fillInput(searchBlock, "мотузка");
        clickOn(buttonSearch);

        return this;
    }

    public int getSizeOfRopesList() {

        return driver.findElements(ropesList).size();
    }

    public String priceOfRope() {

        WebElement price = driver.findElement(ropePrice);

        return price.getText();

    }

    public HomePage lookingForTent() {

        clickOn(buttonTent);
        clickOn(pageNumber);
        clickOn(buttonDetails);
        clickOn(buttonBuyIt);

        return this;
    }

    public String getNameOfTent() {

        clickOn(shoppingList);

        return findElement(tentInBasket).getText();
    }

    public CabinetPage goToPersonalCabinet() {

        fillInput(enterToClub, "BCI7796559");
        clickOn(buttonOk);

        return new CabinetPage(driver);
    }


    public void invalidPersonalNumber(final String pass) {

        fillInput(enterToClub, pass);
        clickOn(buttonOk);
    }

//    public Dimension getListOfGlasses (){
//
//        clickOn(buttonGlasses);
//        return findElement(glassesList).getSize();
//    }

    public boolean getListOfGlasses(final int numberItems) {

        return isListElementsOfGlassesEquals(findElements(glassesList), numberItems);

    }
}







