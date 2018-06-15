import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import utils.HuskyTestRunner;

public class TentSearchTest extends HuskyTestRunner {

    @Test
    public void searchTentTest () {

        homePage
                .lookingForTent()
                .getNameOfTent();


        String nameOfTent = homePage.getNameOfTent();

        assertEquals(nameOfTent, "Намет HUSKY Extreme FIGHTER 3-4", "It's must be another tent");

    }
}
