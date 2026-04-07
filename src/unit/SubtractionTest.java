package unit;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SubtractionTest {

    @Test
    public void sub() {
        int result = 5 - 2;
        Assert.assertEquals(result, 3);

        System.out.println("Subtraction Test Passed");
    }
}