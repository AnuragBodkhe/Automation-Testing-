package TestNG;

import org.testng.annotations.*;
import org.testng.Assert;

public class DataProviderExample {

    @DataProvider(name = "data")
    public Object[][] getData() {
        return new Object[][] {
            {2, 3, 5},
            {5, 5, 10},
            {10, 2, 12}
        };
    }

    @Test(dataProvider = "data")
    public void additionTest(int a, int b, int expected) {
        int result = a + b;
        Assert.assertEquals(result, expected);
        System.out.println("DataProvider Test Passed");
    }
}