package unit;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AdditionTest {

    @Test
    public void add() {
        int result = 2 + 3;
        Assert.assertEquals(result, 5);

        System.out.println("Addition Test Passed");
    }
}