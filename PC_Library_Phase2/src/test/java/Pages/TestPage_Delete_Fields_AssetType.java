package Pages;

import Helpers.WebDriverFactory;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.List;

public class TestPage_Delete_Fields_AssetType {

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


        By clickDeleteFieldRow = By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[2]/div/div/table/tbody/tr[2]/td[7]/div/div[2]/button");
        By clickContinue = By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[3]/button");
        By deleteWholeAsset = By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[2]/div/table/tbody/tr[last()]/td[2]/div/div[2]/button");
        By confirmDeleteWholeAsset = By.xpath("/html/body/div[4]/div[2]/div/div/div[2]/div[2]/div/button/span[1]");
        public void clickDeleteFieldRow() throws InterruptedException {
            click(clickDeleteFieldRow);
            Thread.sleep(2000);
        }
        public void checkIfRowIsDeleted() {
            List<WebElement> fieldTable = driver.findElements(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[2]/div/div/table/tbody/tr"));
            System.out.println(fieldTable.size());
            for(int i =1;i<=fieldTable.size();i++){
                String TableElement = String.format("/html/body/div[1]/div/div[2]/div/div[2]/div/div[2]/div/div/table/tbody/tr[%d]/td[1]", i);
                String getText = driver.findElement(By.xpath(TableElement)).getText();
                System.out.println(getText);
                if(getText.contains("Model1")){
                    System.out.println("Field Row is not Deleted");
                    }else {
                    System.out.println("Field Row Model1 is Deleted");
                }
            }
        }
        public void clickContinue(){
            click(clickContinue);
        }
        public void deleteWholeAsset() throws InterruptedException {
            Thread.sleep(2000);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,200)");
            click(deleteWholeAsset);
            Thread.sleep(2000);
            click(confirmDeleteWholeAsset);
        }
        public void checkIfAssetTypeIsDeleted() throws InterruptedException {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,150)");
            Thread.sleep(2000);
            List<WebElement> fieldTable = driver.findElements(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[2]/div/table/tbody/tr"));
            System.out.println(fieldTable.size());
            for(int i =1;i<=fieldTable.size();i++) {
                String TableElement = String.format("/html/body/div[1]/div/div[2]/div/div[2]/div/div[2]/div/table/tbody/tr[%d]/td[1]", i);
                String getText = driver.findElement(By.xpath(TableElement)).getText();
                if (getText.contains("Tablet")) {
                    System.out.println("Asset Type Tablet is Deleted");
                }




            }}
}
