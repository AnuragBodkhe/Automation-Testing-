package functional;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class LoginSanityTest {
    WebDriver driver;

    @BeforeClass
    void setup() {
        driver = new ChromeDriver();
        driver.get("https://www.amazon.in");
    }

    @Test
    void verifyLoginClick() {
        driver.findElement(By.id("nav-link-accountList")).click();
        assert driver.getCurrentUrl().contains("signin");
    }

    @AfterClass
    void close() { driver.quit(); }
}