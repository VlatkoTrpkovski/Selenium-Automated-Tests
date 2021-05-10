package Pages;

import Helpers.WebDriverFactory;
import TestStepDefinitions.TestStepDef_Create_Asset;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestPage_Create_Asset {
    WebDriver driver = WebDriverFactory.getWebDriver();
    private WebDriverWait wait;
    public static final int TIMEOUT = 20;


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

    public void click(By element) {
        driver.findElement(element).click();
    }

    By clickAssetPage = By.xpath("/html/body/div[1]/div/div[1]/header/div/div/div/div[1]/div[1]/a[2]");
    By clickCreateAsset = By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[2]/div[2]/a");
    By chooseAssetType = By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div/form/div[1]");
    By enterAssetName = By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div/form/div[2]/div/input");
    By enterAssetModel = By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div/form/div[3]/div/input");
    By clickCreateAssetButton = By.className("MuiButtonBase-root MuiButton-root MuiButton-contained makeStyles-button-39 MuiButton-containedPrimary MuiButton-containedSizeSmall MuiButton-sizeSmall");
    public void clickAssetPage() {
        click(clickAssetPage);

    }

    public void clickCreateAsset() {
        click(clickCreateAsset);
    }

    public void chooseAssetType() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(chooseAssetType).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div/form/div[1]/select/option[last()]")).click();

       // driver.findElement(chooseAssetType).sendKeys(Keys.ENTER);
        Thread.sleep(5000);
    }

   public void enterAssetData(String name, String model) {
        driver.findElement(enterAssetName).sendKeys(name);
        driver.findElement(enterAssetModel).sendKeys(model);
        click(clickCreateAssetButton);

   }
}