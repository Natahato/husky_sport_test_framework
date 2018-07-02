import org.testng.Assert;
import org.testng.annotations.Test;
import utils.HuskyTestRunner;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class PageItemsExistTest extends HuskyTestRunner {

    @Test
    public void testPageItemsExist() {

        assertTrue(homePage.getListOfGlasses(11));
    }

}
