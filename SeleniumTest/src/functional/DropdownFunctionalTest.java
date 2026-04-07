package functional;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class DropdownFunctionalTest {
    WebDriver driver;

    @BeforeClass
    void setup() {
        driver = new ChromeDriver();
        driver.get("https://www.amazon.in");
    }

    @Test
    void verifyDropdown() {
        WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
        assert dropdown.isDisplayed();
    }

    @AfterClass
    void close() { driver.quit(); }
}