package functional;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class FooterFunctionalTest {
    WebDriver driver;

    @BeforeClass
    void setup() {
        driver = new ChromeDriver();
        driver.get("https://www.amazon.in");
    }

    @Test
    void verifyFooter() {
        WebElement footer = driver.findElement(By.id("navFooter"));
        assert footer.isDisplayed();
    }

    @AfterClass
    void close() { driver.quit(); }
}