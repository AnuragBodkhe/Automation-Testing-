package unit;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultiplicationTest {

    @Test
    public void mul() {
        int result = 3 * 3;
        Assert.assertEquals(result, 9);

        System.out.println("Multiplication Test Passed");
    }
}