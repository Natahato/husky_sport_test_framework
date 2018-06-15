import org.testng.annotations.Test;
import utils.HuskyTestRunner;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class RopesOnPageTest extends HuskyTestRunner {

    @Test
    public void testRopesOnPage() {

        homePage.lookingForRope();

        int sizeOfRopeArray = homePage.getSizeOfRopesList();

        assertEquals(sizeOfRopeArray, 4, "Collection of ropes should be 4");
    }
}
