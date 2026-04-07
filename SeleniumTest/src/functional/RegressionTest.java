package functional;
                                                    // In this code i used TestNG and selenium  both 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class RegressionTest {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    // ✅ Test Case 1: Login Test
    @Test(priority = 1)
    public void testLogin() {

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        String url = driver.getCurrentUrl();

        if (url.contains("inventory")) {
            System.out.println("Login Test Passed ✅");
        } else {
            System.out.println("Login Test Failed ❌");
        }
    }

    // ✅ Test Case 2: Add to Cart Test
    @Test(priority = 2)
    public void testAddToCart() {

        // Login first
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        // Add product to cart
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

        String cartCount = driver.findElement(By.className("shopping_cart_badge")).getText();

        if (cartCount.equals("1")) {
            System.out.println("Add to Cart Passed ✅");
        } else {
            System.out.println("Add to Cart Failed ❌");
        }
    }

    // ✅ Test Case 3: Logout Test
    @Test(priority = 3)
    public void testLogout() throws InterruptedException {

        // Login first
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        Thread.sleep(2000);

        // Open menu
        driver.findElement(By.id("react-burger-menu-btn")).click();
        Thread.sleep(1000);

        // Logout
        driver.findElement(By.id("logout_sidebar_link")).click();

        String url = driver.getCurrentUrl();

        if (url.contains("saucedemo")) {
            System.out.println("Logout Passed ✅");
        } else {
            System.out.println("Logout Failed ❌");
        }
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}