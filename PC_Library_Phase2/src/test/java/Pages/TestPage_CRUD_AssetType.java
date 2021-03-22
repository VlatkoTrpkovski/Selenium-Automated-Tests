package Pages;

import Helpers.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestPage_CRUD_AssetType {


    WebDriver driver = WebDriverFactory.getWebDriver();
    private WebDriverWait wait;
        public static final int TIMEOUT = 20;

        public void click(By element) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(element)).click();
        }
    @BeforeMethod
    public void startBrowser() {
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, TIMEOUT);
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }


    }



