package functional;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SmokeTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/");

        if (driver.getTitle().contains("The Internet")) {
            System.out.println("Smoke Test Passed: Title verified successfully.");
        } else {
            System.out.println("Smoke Test Failed: Title did not match.");
        }

        driver.quit();
    }
}