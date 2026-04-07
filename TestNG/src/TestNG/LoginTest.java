package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

    public boolean login(String user, String pass) {
        return user.equals("admin") && pass.equals("1234");
    }

    @Test
    public void validLoginTest() {
        Assert.assertTrue(login("admin", "1234"));
        System.out.println("Valid Login Passed");
    }

    @Test
    public void invalidLoginTest() {
        Assert.assertFalse(login("user", "wrong"));
        System.out.println("Invalid Login Passed");
    }
}