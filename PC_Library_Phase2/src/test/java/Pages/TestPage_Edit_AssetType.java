package Pages;

import Helpers.WebDriverFactory;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.Keys;

public class TestPage_Edit_AssetType {
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


    By clickEditAsset = By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[2]/div/table/tbody/tr[last()]/td[2]/div/div[1]/a/span[1]");
    By clickEditField = By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[2]/div/div/table/tbody/tr[2]/td[7]/div/div[1]/button");
    By editFieldName = By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[1]/div/div[2]/form/div[1]/div/input");
    By clickSearchable = By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[1]/div/div[2]/form/div[4]/span[1]/span[1]/input");
    By clickUnique = By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[1]/div/div[2]/form/div[5]/span[1]/span[1]/input");
    By clickCountable = By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[1]/div/div[2]/form/div[6]/span[1]/span[1]/input");
    By clickUpdateTypeField = By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[1]/div/div[2]/form/button");
    By clickFieldType = By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[1]/div/div[2]/form/div[2]/div/select");
    By clickUpdateType = By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[3]/button/span[1]");
    By navigateToAssetTypePage = By.xpath("/html/body/div[1]/div/div[1]/header/div/div/div/div[1]/div[1]/a[4]");

    public void clickEditAsset() throws InterruptedException {
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");
        Thread.sleep(3000);
        click(clickEditAsset);
    }
    public void clickEditField() throws InterruptedException {
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,70)");
            click(clickEditField);
    }
    public void editAssetField(){
        driver.findElement(editFieldName).sendKeys("1");
        click(clickSearchable);
        click(clickCountable);
        click(clickUnique);
        click(clickUpdateTypeField);
        click(clickUpdateType);
    }

    public void checkIfUpdated() throws InterruptedException {
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");

        click(clickEditAsset);
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,50)");
        String expectedFieldName = "Model1";
        String actualFieldName = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[2]/div/div/table/tbody/tr[2]/td[1]")).getText();
        System.out.println(actualFieldName + "This is actual Field Name");
        Assert.assertEquals(expectedFieldName,actualFieldName);
        String expectedFieldSearchable = "true";
        String actualFieldSearchable = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[2]/div/div/table/tbody/tr[2]/td[4]")).getText();
        Assert.assertEquals(expectedFieldSearchable,actualFieldSearchable);
        String expectedFieldUnique = "true";
        String actualFieldUnique = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[2]/div/div/table/tbody/tr[2]/td[5]")).getText();
        Assert.assertEquals(expectedFieldUnique,actualFieldUnique);
        String expectedFieldCountable = "true";
        String actualFieldCountable = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[2]/div/div/table/tbody/tr[2]/td[6]")).getText();
        Assert.assertEquals(expectedFieldCountable,actualFieldCountable);
    }
    public void navigateToAssetTypePage(){
        click(navigateToAssetTypePage);

    }





}
