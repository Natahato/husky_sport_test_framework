import org.testng.Assert;
import org.testng.annotations.Test;
import page_objects.CabinetPage;
import utils.HuskyTestRunner;

import static org.testng.Assert.assertEquals;

public class ValidPersonalCabinetTest extends HuskyTestRunner {


    @Test
    public void testCabinetPage() {

        homePage
                .goToPersonalCabinet()
                .welcomeToPersonalCabinet()
                .isItYourCabinet();

        String itIsMyProfile = cabinetPage.isItYourCabinet();

        assertEquals(itIsMyProfile, "Мій профіль", "Something wrong with exist profile ");

    }
}
