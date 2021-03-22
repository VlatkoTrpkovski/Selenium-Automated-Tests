package Pages;

import Helpers.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestPage_Login_Logout {
    WebDriver driver = WebDriverFactory.getWebDriver();

    public static final int TIMEOUT = 20;



    @BeforeMethod
    public void startBrowser() {
        driver.manage().window().maximize();

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

    public void navigateto(){
        driver.get("https://www.google.com/");
    }
}

