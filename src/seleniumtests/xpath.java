package seleniumtests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

    public static void main(String[] args) {

        // No need for System.setProperty (Selenium Manager handles driver)

        WebDriver driver = new ChromeDriver();

        try {
            // Maximize browser
            driver.manage().window().maximize();

            // Open Amazon India
            driver.get("https://www.amazon.in/");

            // Search box
            WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
            searchBox.sendKeys("laptop");

            // Click search button
            WebElement searchBtn = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
            searchBtn.click();

            // Wait for results (simple wait)
            Thread.sleep(3000);

            // Click first product
            WebElement firstProduct = driver.findElement(
                    By.xpath("(//div[@data-component-type='s-search-result']//h2/a)[1]"));
            firstProduct.click();

            // Wait to view product page
            Thread.sleep(3000);

        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        } finally {
            
        }
    }
}