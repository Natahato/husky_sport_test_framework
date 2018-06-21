import org.testng.annotations.Test;
import utils.HuskyTestRunner;

import static org.testng.Assert.assertEquals;

public class CheckPriceOfRopeTest extends HuskyTestRunner {


    @Test
    public void testCheckPrice() {

        homePage
                .lookingForRope()
                .priceOfRope();

        assertEquals(homePage.priceOfRope(), "3 480 грн.", "Price of this rope should be 3 480");
    }
}
