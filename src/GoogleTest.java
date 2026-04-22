
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.GoogleHomePage;   // import your POM class

public class GoogleTest {
    @Test
    public void verifyGoogleTitle() {
        // Setup WebDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Create object of POM class and call methods
        GoogleHomePage googlePage = new GoogleHomePage(driver);
        googlePage.openGoogle();

        // Assertion using POM method
        Assert.assertEquals(googlePage.getPageTitle(), "Google");

        driver.quit();
    }
}