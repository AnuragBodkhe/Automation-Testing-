package functional;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class SearchFunctionalTest {
    WebDriver driver;

    @BeforeClass
    void setup() {
        driver = new ChromeDriver();
        driver.get("https://www.amazon.in");
    }

    @Test
    void searchProduct() {
        driver.findElement(By.id("twotabsearchtextbox"))
              .sendKeys("headphones", Keys.ENTER);
        assert driver.getTitle().contains("headphones");
    }

    @AfterClass
    void tearDown() { driver.quit(); }
}