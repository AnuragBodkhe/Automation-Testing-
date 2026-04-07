package nonfunctional;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class CompatibilityTest2 {
    @Test
    void testChrome() {
        WebDriver d = new ChromeDriver();
        d.get("https://google.com");
        d.quit();
    }
}