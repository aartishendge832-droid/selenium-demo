import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.GoogleHomePage;   // import the POM class

public class GoogelTestAssert {
    @Test
    public void checkGoogleTitleWithAssert() {
        // Setup WebDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Use POM class
        GoogleHomePage googlePage = new GoogleHomePage(driver);
        googlePage.openGoogle();

        // Assertion
        String actualTitle = googlePage.getPageTitle();
        Assert.assertEquals(actualTitle, "Google", "Title did not match!");

        driver.quit();
    }
    
}