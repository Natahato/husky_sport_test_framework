package asserts;

import org.assertj.core.api.AbstractAssert;
import org.openqa.selenium.WebElement;
import ru.yandex.qatools.allure.annotations.Step;

public class HardAssert extends AbstractAssert<HardAssert, WebElement> {

    HardAssert(final WebElement actual) {
        super(actual, HardAssert.class);
    }

    public static final HardAssert assertThat(final WebElement actual) {
        return new HardAssert(actual);
    }

    @Step
    public final HardAssert isDisplayed() {

        isNotNull();

        if (!actual.isDisplayed()) {
            failWithMessage("Element {" + actual.getText() + " should be displayed !");
        }
        return this;
    }

    @Step
    public final HardAssert containsText(final String condition) {

        isNotNull();

        if (!actual.getText().contains(condition)) {
            failWithMessage("Element {" + condition + " should contain " + actual.getText());
        }
        return this;
    }

    @Step
    public final HardAssert equals(final String condition) {

        isNotNull();

        if (!actual.getText().equalsIgnoreCase(condition)) {
            failWithMessage("Element {" + condition + " should be equals " + actual.getText());
        }
        return this;
    }

}

