package functional;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class NavigationFunctionalTest {
    WebDriver driver;

    @BeforeClass
    void setup() {
        driver = new ChromeDriver();
        driver.get("https://www.amazon.in");
    }

    @Test
    void clickLogo() {
        driver.findElement(By.id("nav-logo-sprites")).click();
        assert driver.getCurrentUrl().contains("amazon");
    }

    @AfterClass
    void close() { driver.quit(); }
}