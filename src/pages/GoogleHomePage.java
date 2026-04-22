package pages;


import org.openqa.selenium.WebDriver;

public class GoogleHomePage {
    WebDriver driver;
    public GoogleHomePage(WebDriver driver) {
        this.driver = driver;
    }
    public void openGoogle() {
        driver.get("https://www.google.com");
    }
    public String getPageTitle() {
        return driver.getTitle();
    }
}
