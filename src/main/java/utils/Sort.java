package utils;

import org.openqa.selenium.WebElement;

import java.util.List;

public class Sort {

    private Sort() {
    }

    public static boolean sortArrayByTitle(final List<WebElement> brandShoesList, final String title) {

        for (WebElement element : brandShoesList) {
            if (!element.getText().contains(title)) {
                return false;
            }
        }
        return true;
    }


    public static boolean isListElementsOfGlassesEquals(final List<WebElement> glassesList, final int numberItems) {

        for (WebElement element : glassesList) {
            if (!element.getSize().equals(numberItems)) {
                return false;
            }
        }
        return true;

    }
}