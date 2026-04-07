package functional;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class CartFunctionalTest {
    WebDriver driver;

    @BeforeClass
    void setup() {
        driver = new ChromeDriver();
        driver.get("https://www.amazon.in");
    }

    @Test
    void openCart() {
        driver.findElement(By.id("nav-cart")).click();
        assert driver.getCurrentUrl().contains("cart");
    }

    @AfterClass
    void close() { driver.quit(); }
}