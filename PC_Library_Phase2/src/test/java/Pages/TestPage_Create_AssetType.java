package Pages;

import Helpers.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.List;

public class TestPage_Create_AssetType {


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


    By clickCreateAssetTypeBtn = By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[1]/a/span[1]");
    By enterAssetTypeName = By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div/div/div[1]/div/div/input");
    By enterAssetName = By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div/div/div[2]/form/div[1]/div/input");
    By checkRequiredBox = By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div/div/div[2]/form/div[3]/span[1]/span[1]/input");
    By clickAddType = By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div/div/div[2]/form/button");
    By checkAssetName = By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[2]/div/div/table/tbody/tr[2]/td[1]");
    By checkAssetFieldType = By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[2]/div/div/table/tbody/tr/td[2]");
    By checkIfReqBoxIsChecked = By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[2]/div/div/table/tbody/tr[1]/td[3]");
    By clickCreateType = By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[3]/button");
    By navigateToAssetTypePage = By.xpath("/html/body/div[1]/div/div[1]/header/div/div/div/div[1]/div[1]/a[4]");




    public void clickCreateAssetTypeBtn(){
        click(this.clickCreateAssetTypeBtn);
    }
    public void enterAssetTypeName(String AssetTypeName){
       driver.findElement(this.enterAssetTypeName).sendKeys(AssetTypeName);
    }
    public void enterAssetName(String AssetName){
        driver.findElement(this.enterAssetName).sendKeys(AssetName);
    }
    public void checkRequiredBox(){
        click(this.checkRequiredBox);
    }
    public void clickAddType(){
        click(this.clickAddType);
    }

    public void checkFieldName(){
        String expectedAssetTypeName = "Model";
        String checkAssetTypeName =  driver.findElement(this.checkAssetName).getText();
        Assert.assertEquals(expectedAssetTypeName,checkAssetTypeName);
        System.out.println("AssetTypeName is as Expected");
    }
    public void checkAssetFieldType(){
        String expectedAssetFieldTypeName = "text";
        String checkAssetFieldTypeName =  driver.findElement(this.checkAssetFieldType).getText();
        Assert.assertEquals(expectedAssetFieldTypeName,checkAssetFieldTypeName);
        System.out.println("AssetFieldTypeName is as Expected");
    }
    public void checkIfReqBoxIsChecked(){
        String expectedcheckIfRequiredBoxIsChecked = "true";
        String checkIfRequiredBoxIsChecked = driver.findElement(this.checkIfReqBoxIsChecked).getText();
        Assert.assertEquals( expectedcheckIfRequiredBoxIsChecked,checkIfRequiredBoxIsChecked);
        System.out.println("checkIfRequiredBoxIsChecked is as Expected");
    }
    public void clickCreateType(){
        click(this.clickCreateType);
    }


    public void checkAssetTypeName() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[2]/div/table/tbody/tr[last()]/td[2]/div/div[1]/a/span[1]")).click();
        Thread.sleep(2000);
        String checkATName = driver.findElement(By.xpath("//*[@id=\"input__type\"]")).getAttribute("value");
        System.out.println(checkATName);
        String expectedATName = "Tablet";
        Assert.assertEquals(expectedATName,checkATName);
    }
    public void navigateToAssetTypePage(){
       click(navigateToAssetTypePage);
    }






}



