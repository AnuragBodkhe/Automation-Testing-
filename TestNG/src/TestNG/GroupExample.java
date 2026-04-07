package TestNG;

import org.testng.annotations.Test;

public class GroupExample {

    @Test(groups = "smoke")
    public void smokeTest() {
        System.out.println("Smoke Test");
    }

    @Test(groups = "regression")
    public void regressionTest() {
        System.out.println("Regression Test");
    }
}