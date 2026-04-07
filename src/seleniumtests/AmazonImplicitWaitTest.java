package seleniumtests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class AmazonImplicitWaitTest {

    public static void main(String[] args) {

        // No need to set driver path!

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.amazon.in");
        driver.manage().window().maximize();

        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("laptop");

        driver.findElement(By.id("nav-search-submit-button")).click();

        System.out.println("Title: " + driver.getTitle());

        driver.quit();
    }
}