package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionExample {

    @Test
    public void testAssertions() {

        String actual = "TestNG";
        String expected = "TestNG";

        Assert.assertEquals(actual, expected);
        Assert.assertTrue(actual.contains("Test"));
        Assert.assertFalse(actual.isEmpty());

        System.out.println("Assertions Passed");
    }
}