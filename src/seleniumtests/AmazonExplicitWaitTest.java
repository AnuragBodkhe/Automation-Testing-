package seleniumtests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class AmazonExplicitWaitTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        driver.get("https://www.amazon.in");
        driver.manage().window().maximize();

        // Wait for search box
        WebElement searchBox = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("twotabsearchtextbox"))
        );
        searchBox.sendKeys("laptop");

        // Click search
        wait.until(
                ExpectedConditions.elementToBeClickable(By.id("nav-search-submit-button"))
        ).click();

        // 🔥 Wait for results using stable locator
        wait.until(
                ExpectedConditions.presenceOfElementLocated(By.cssSelector("h2 a"))
        );

        // Get first product safely
        WebElement firstProduct = driver.findElements(By.cssSelector("h2 a")).get(0);
        firstProduct.click();

        // Switch tab
        String mainWindow = driver.getWindowHandle();
        for (String window : driver.getWindowHandles()) {
            if (!window.equals(mainWindow)) {
                driver.switchTo().window(window);
                break;
            }
        }

        // Wait for Add to Cart
        WebElement addToCart = wait.until(
                ExpectedConditions.elementToBeClickable(By.id("add-to-cart-button"))
        );
        addToCart.click();

        // Confirm
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("sw-gtc"))
        );

        System.out.println("✅ Product added to cart!");

        driver.quit();
    }
}