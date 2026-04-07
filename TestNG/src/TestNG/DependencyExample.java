package TestNG;

import org.testng.annotations.Test;

public class DependencyExample {

    @Test
    public void login() {
        System.out.println("Login Successful");
    }

    @Test(dependsOnMethods = "login")
    public void dashboard() {
        System.out.println("Dashboard Loaded");
    }
}