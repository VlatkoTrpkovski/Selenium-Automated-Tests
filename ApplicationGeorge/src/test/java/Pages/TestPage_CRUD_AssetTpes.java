package Pages;

import Helpers.WebDriverFactory;
import org.apache.commons.lang3.ObjectUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestPage_CRUD_AssetTpes {
    WebDriver driver = WebDriverFactory.getWebDriver();
    private WebDriverWait wait;
    public static final int TIMEOUT = 15;


    public void click(By element) {
        driver.findElement(element).click();
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
    By enterAcMilan = By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input");
    By googlesearchbtn = By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/center/input[1]");
    public void enterAcMilan(String tim){
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys(tim);
        wait.until(ExpectedConditions.elementToBeClickable(this.googlesearchbtn)).click();

    }
}


