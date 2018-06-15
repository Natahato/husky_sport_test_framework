package utils;


import org.testng.annotations.DataProvider;

public class HuskyDataProvider {

    @DataProvider
    public static Object[][] testDataAuthorization() {
        return new Object[][]{
                {"11111111111"},
                {""},
                {"qtwyuiwioxjx"},
                {"77HHJJ_99"}
        };

    }
}
