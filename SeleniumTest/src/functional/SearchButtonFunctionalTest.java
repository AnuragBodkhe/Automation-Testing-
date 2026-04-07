package functional;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class SearchButtonFunctionalTest {
    WebDriver driver;

    @BeforeClass
    void setup() {
        driver = new ChromeDriver();
        driver.get("https://www.amazon.in");
    }

    @Test
    void verifySearchButton() {
        WebElement btn = driver.findElement(By.id("nav-search-submit-button"));
        assert btn.isEnabled();
    }

    @AfterClass
    void close() { driver.quit(); }
}