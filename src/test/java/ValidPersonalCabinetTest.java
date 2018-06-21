import org.testng.annotations.Test;
import utils.HuskyTestRunner;

import static org.testng.Assert.assertEquals;

public class ValidPersonalCabinetTest extends HuskyTestRunner {


    @Test
    public void testCabinetPage() {

        cabinetPage = homePage
                .goToPersonalCabinet();

        cabinetPage
                .welcomeToPersonalCabinet()
                .isItYourCabinet();

        String itIsMyProfile = cabinetPage.isItYourCabinet();

        assertEquals(itIsMyProfile, "Мій профіль", "Something wrong with exist profile ");

    }
}
