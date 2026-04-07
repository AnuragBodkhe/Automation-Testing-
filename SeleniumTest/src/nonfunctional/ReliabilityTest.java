package nonfunctional;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class ReliabilityTest {

    public static void main(String[] args) {
        
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(1));

        try {
            System.out.println("Attempting to load page (1-second limit)...");
            driver.get("https://the-internet.herokuapp.com/");
            
            System.out.println("✅ Success: Page loaded incredibly fast!");

        } catch (TimeoutException e) {

            System.out.println("⚠️ Timeout caught! Page was too slow. Recovering system...");

            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
            
            driver.get("https://the-internet.herokuapp.com/");
            System.out.println("✅ Recovery Successful: System stabilized and page loaded.");

        } finally {
            driver.quit();
        }
    }
}