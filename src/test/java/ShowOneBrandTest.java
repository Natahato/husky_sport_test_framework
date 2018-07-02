import org.testng.Assert;
import org.testng.annotations.Test;
import page_objects.CabinetPage;
import utils.HuskyTestRunner;

import static org.testng.Assert.assertTrue;

public class ShowOneBrandTest extends HuskyTestRunner {


    @Test
    public void testShowBrandOfShoes() {

        cabinetPage = homePage
                .goToPersonalCabinet();

        cabinetPage
                .welcomeToPersonalCabinet()
                .chooseOneBrand();

        assertTrue(cabinetPage.isTitleMillet("MILLET"));


}
}
