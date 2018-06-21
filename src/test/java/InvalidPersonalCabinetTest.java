import org.testng.annotations.Test;
import page_objects.CabinetPage;
import utils.HuskyDataProvider;
import utils.HuskyTestRunner;

import static org.testng.Assert.assertEquals;

public class InvalidPersonalCabinetTest extends HuskyTestRunner {


    @Test(dataProvider = "testDataAuthorization", dataProviderClass = HuskyDataProvider.class)
    public void errorMessageOnLoginWithBadCredentials (final String pass){

        homePage.invalidPersonalNumber(pass);

        cabinetPage = new CabinetPage(driver);

        String alertDanger = cabinetPage.badUser();

        assertEquals(alertDanger, "Такого номера картки не існує", "Something wrong with error cabinet page ");

    }
}
