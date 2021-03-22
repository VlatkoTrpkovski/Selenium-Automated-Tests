package Pages;

import Helpers.WebDriverFactory;
import com.sun.source.tree.AssertTree;
import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.regex.*;
import java.util.List;

import static org.testng.Assert.assertTrue;

public class TestPage {

    WebDriver driver = WebDriverFactory.getWebDriver();
    public WebDriverWait wait;
    public static final int TIMEOUT = 20;
    JavascriptExecutor js = (JavascriptExecutor) driver;

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


    By signInButton = By.xpath("/html/body/app-root/div/div[2]/div[1]/div[1]/div[3]/scenarios/div/div/div/div[1]/div/div/app-action-buttons[1]/button");
    By clickZpravaPractena = By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div/div/div[3]/a[2]");
    By clickImage = By.xpath("/html/body/div[2]/div[2]/div[1]/div/div/header/div/div/div[2]/nav/div[2]/span/span/img");
    By clickRadioButtonEnglish = By.cssSelector("#maincontainer > div > div.side-menu-container--1gjcB.spacing-desktop--3tyJv > div.content-with-scrollbar.contentWithScrollbar--17l6R > div > div:nth-child(2) > div > div.card-group.g-card-group-vertical.mt-0 > div:nth-child(3) > div > fieldset > div > div:nth-child(2) > label > div > span");
    By clickMessageRead = By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div/div/div[3]/a[2]");
    By clickOverview = By.xpath("/html/body/div[2]/div[2]/div[1]/div/div/header/div/div/div[2]/nav/div[1]/a[1]/div/span[1]");
    By enterTextSearchBar = By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div[2]/div[1]/div[4]/div[2]/div/div[1]/div/div/div/div/form/div/input");
    By checktext = By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div/div/div[2]/div/div/div/div/div[6]/div[3]/div/div/div[10]/div/div/div[2]/div/div/div/div/div/div/div[2]/table/tbody/tr[1]/td[2]/div/span");
    By clickCloseItemFromSearch = By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div/div/div[2]/div/div/div/div/div[6]/div[3]/div/div/div[10]/div/div/div[2]/div/div/div/div/div/div/div[2]/table/tbody/tr[1]/td[11]/div/div[1]/button/span");
    By itemImageExists = By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div/div/div[2]/div/div/div/div/div[6]/div[3]/div/div/div[10]/div/div/div[2]/div/div/div/div/div/div/div[2]/table/tbody/tr[1]/td[5]/span/span/img");
    By clickXSearchBar = By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div/div/div[2]/div/div/div/div/div[1]/div[1]/div[1]/div/form/div/span/a[2]");
    By msgXisdisplayed = By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div/div/div[2]/div/div/div/div/div[6]/div[3]/div/div/div[10]/div/div/div[2]/div/div/div/div/h4");
    By checkNonExistingItemMsg = By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div/div/div[2]/div/div/div/div/div[6]/div[3]/div/div/div[10]/div/div/div[2]/div/div/div/div/h2");
    By enterTextSearchBar1 = By.cssSelector("#transactions-searchtb");
    By clickPrintButton = By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div/div/div[2]/div/div/div/div/div[1]/div[2]/div/div[5]/div/div/div/button[1]");
    By clickCancelPrint = By.xpath("/html/body/div[13]/div/div/div[1]/div/div[2]/div[2]/div/a[1]");
    By clickLogOut = By.xpath("/html/body/div[2]/div[2]/div[1]/div/div/header/div/div/div[2]/nav/div[2]/div[4]/div/button");


    public void openGeorgeApp() {
        driver.get("https://george.csas.cz/?login_hint=7777777777");
    }

    public void signInButton() {
        click(this.signInButton);
    }

    public void clickZpravapractena() {
        click((this.clickZpravaPractena));
    }

    public void clickImage() {
        click((this.clickImage));
    }

    public void clickRadioButtonEnglish() throws InterruptedException {
        click((this.clickRadioButtonEnglish));
    }

    public void clickMessageRead() {
        click((this.clickMessageRead));
    }

    public void clickOverview() throws InterruptedException {
        Thread.sleep(7000);
        click((this.clickOverview));
    }

    public void enterTextSearchBar(String enterText) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.enterTextSearchBar)).sendKeys(enterText);

    }

    public void checkInput() {
        String actualString = wait.until(ExpectedConditions.visibilityOfElementLocated(this.checktext)).getText();
        assertTrue(actualString.contains("Liftago"));
        System.out.println("Aseert checktext has passed, search contains Liftago");
        System.out.println("Assert ignore case has passed, transactions are displayed when searched with IgnoreCase");


    }

    public void openAndCloseItemFromSearchBar() {
        click((this.checktext));
        click((this.clickCloseItemFromSearch));
    }

    public void itemImageExists() {
        WebElement image = wait.until(ExpectedConditions.visibilityOfElementLocated(this.itemImageExists));
        Boolean ImageExists = (Boolean) ((JavascriptExecutor) driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", image);
        if (ImageExists) {
            System.out.println("Image of the company is displayed");
        } else {
            System.out.println("Image of the company is NOT displayed");

        }
    }

    public void clickPrintButton() throws InterruptedException {
        click((this.clickPrintButton));
        Thread.sleep(5000);
        js.executeScript("window.scrollBy(0,410)");
    }


    public void getPriceElement() {

        //Table Feb.
        List<WebElement> rows = driver.findElements(By.xpath("/html/body/div[13]/div/div/div[2]/div/div[2]/div[1]/div/div/div[1]/div/table/tbody/tr"));
        //   System.out.println(rows.size());
        int expectedSum = 0;
        for (int i = 2; i <= rows.size(); i++) {
            String rowElement = String.format("/html/body/div[13]/div/div/div[2]/div/div[2]/div[1]/div/div/div[1]/div/table/tbody/tr[%d]/td[4]/div/span", i);
            String getprice = driver.findElement(By.xpath(rowElement)).getText();
            getprice = getprice.replaceAll("\\D+", "");
            String actual = getprice.substring(0, getprice.length() - 2);
            // System.out.println(actual);
            expectedSum = expectedSum + Integer.parseInt(actual);
        }

        System.out.println(expectedSum + " This is the sum of Outgoing transaction for February");
        String getactualSum = driver.findElement(By.xpath("/html/body/div[13]/div/div/div[2]/div/div[2]/div[1]/div/div/div[1]/div/table/thead/tr/th/div/div[2]/div/div/span")).getText();
        getactualSum = getactualSum.replaceAll("\\D+", "");
        String actualSum = getactualSum.substring(0, getactualSum.length() - 2);
        // System.out.println(actualSum);

        //Table Jan.
        List<WebElement> rows1 = driver.findElements(By.xpath("/html/body/div[13]/div/div/div[2]/div/div[2]/div[1]/div/div/div[2]/div/table/tbody/tr"));
        // System.out.println(rows1.size());
        int expectedSum1 = 0;
        for (int j = 2; j <= rows1.size(); j++) {
            String rowElement1 = String.format("/html/body/div[13]/div/div/div[2]/div/div[2]/div[1]/div/div/div[2]/div/table/tbody/tr[%d]/td[4]/div/span", j);
            String getprice1 = driver.findElement(By.xpath(rowElement1)).getText();
            getprice1 = getprice1.replaceAll("\\D+", "");
            String actual1 = getprice1.substring(0, getprice1.length() - 2);
            //  System.out.println(actual1);
            expectedSum1 = expectedSum1 + Integer.parseInt(actual1);
        }
        System.out.println(expectedSum1 + " This is the sum of Outgoing transactions for January");
        String getactualSum1 = driver.findElement(By.xpath("/html/body/div[13]/div/div/div[2]/div/div[2]/div[1]/div/div/div[2]/div/table/thead/tr/th/div/div[2]/div/div/span")).getText();
        getactualSum1 = getactualSum1.replaceAll("\\D+", "");
        String actualSum1 = getactualSum1.substring(0, getactualSum1.length() - 2);
        //  System.out.println(actualSum1);

        //Aggregate Sum
        String getactualSumAgg = driver.findElement(By.xpath("/html/body/div[13]/div/div/div[2]/div/div[2]/div[2]/div[2]/div[2]/span")).getText();
        getactualSumAgg = getactualSumAgg.replaceAll("\\D+", "");
        String actualSumAgg = getactualSumAgg.substring(0, getactualSumAgg.length() - 2);
        System.out.println(actualSumAgg + " This is actualSumAgg");
        int actualSumAgg1 = Integer.parseInt(actualSumAgg);

        expectedSum = expectedSum + expectedSum1;
        int expectedSumAgg = expectedSum;
        System.out.println(expectedSumAgg + " This is expectedSumAgg");
        Assert.assertEquals(actualSumAgg1, expectedSumAgg);
        System.out.println("Aggregate Outgoing transactions Sum is OK.");

    }

    public void clickXsearchBar() {
        js.executeScript("window.scrollBy(0,-410)");
        click((this.clickXSearchBar));

    }

    public void clickCancelPrint() {
        click(this.clickCancelPrint);
    }

    public void msgXisDisplayed() throws InterruptedException {
        Thread.sleep(5000);
        String checkXmsg = wait.until(ExpectedConditions.visibilityOfElementLocated(this.msgXisdisplayed)).getText();
        Assert.assertEquals((checkXmsg), "I'm sorry, I couldn't find any transactions.");
        System.out.println(checkXmsg + " Message is Displayed");
    }

    public void enterNonExistingItem(String enterNonExistingItem) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.enterTextSearchBar1)).sendKeys(enterNonExistingItem);
    }

    public void checkResponseIteatDoesNotExisT() throws InterruptedException {
        Thread.sleep(5000);
        String checkNEitemMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(this.checkNonExistingItemMsg)).getText();
        Assert.assertEquals((checkNEitemMsg), "I'm sorry, I could not find what you were searching for. Could you please specify your search criteria?");
        System.out.println(checkNEitemMsg + " Message is Displayed");
    }

    public void clickLogOut() {
        click(this.clickLogOut);
    }


}
