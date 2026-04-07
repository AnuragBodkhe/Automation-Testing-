package seleniumtests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Set;

public class AmazonFluentWaitTest {

    public static void main(String[] args) {

        // Launch browser
        WebDriver driver = new ChromeDriver();

        // Fluent Wait setup
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(25))       // max wait time
                .pollingEvery(Duration.ofSeconds(2))       // check every 2 sec
                .ignoring(NoSuchElementException.class);   // ignore exception

        // Open Amazon
        driver.get("https://www.amazon.in");
        driver.manage().window().maximize();

        // Wait for search box
        WebElement searchBox = wait.until(d ->
                d.findElement(By.id("twotabsearchtextbox"))
        );
        searchBox.sendKeys("laptop");

        // Click search button
        WebElement searchBtn = wait.until(d ->
                d.findElement(By.id("nav-search-submit-button"))
        );
        searchBtn.click();

        // Wait for search results & click first product
        WebElement firstProduct = wait.until(d ->
                d.findElements(By.cssSelector("h2 a")).get(0)
        );
        firstProduct.click();

        // Switch to new tab
        String mainWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();

        for (String window : allWindows) {
            if (!window.equals(mainWindow)) {
                driver.switchTo().window(window);
                break;
            }
        }

        // Wait for Add to Cart button
        WebElement addToCart = wait.until(d ->
                d.findElement(By.id("add-to-cart-button"))
        );
        addToCart.click();

        // Wait for confirmation (Go to Cart visible)
        wait.until(d ->
                d.findElement(By.id("sw-gtc"))
        );

        System.out.println("✅ Product successfully added using Fluent Wait!");

        // Close browser
        driver.quit();
    }
}