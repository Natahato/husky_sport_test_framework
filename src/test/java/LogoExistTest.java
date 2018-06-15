import org.testng.annotations.Test;
import utils.HuskyTestRunner;

import static org.testng.Assert.assertTrue;

public class LogoExistTest extends HuskyTestRunner {

    @Test
    public void logoTest() {

        assertTrue(homePage.findElement(homePage.logo).isDisplayed(), "Logo should be exist");
    }
}
