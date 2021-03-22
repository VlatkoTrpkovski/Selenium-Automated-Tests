package com.PC_Library;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class PC_Library_Elements {
    private WebDriver   driver;
    private WebDriverWait wait;


    By clickassetpage = By.xpath("/html/body/div[1]/div/div[1]/header/div/div/div[1]/button[2]");
    By clickcreateasset = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/a");
    By uploadimagebook = By.cssSelector("#root > div > div.layout > div > div > div > div > form > div:nth-child(3) > div > label > span > span.MuiFab-label > svg");
    By uploadimagevideo = By.id("contained-button-file");
    By entername = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/form/div[4]/div/input");
    By enterauthor = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/form/div[5]/div/input");
    By enterquanity = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/form/div[6]/div/input");
    By clickcreateassetbook = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/form/div[8]/div[2]/button");
    By cancelcreatebook = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/form/div[8]/div[1]/a");
    By entertagbook = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/form/div[7]/div/div/input");
    By clickcreatevideo = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/form/div[1]/select");
    By signinbutton = By.xpath("/html/body/div[1]/div/div/div/form/div/button");
    By signinbutton1= By.xpath("/html/body/div/form[1]/div/div/div[2]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div[1]/div/div/div/div[2]");
    By enteremail = By.xpath("/html/body/div/form[1]/div/div/div[2]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/input[1]");
    By clicknext = By.id("idSIButton9");
    By enterpassword = By.xpath("/html/body/div/form[1]/div/div/div[2]/div/div/div[1]/div[2]/div[2]/div/div[2]/div/div[2]/div/div[2]/input");
    By signinbutton2 = By.xpath("/html/body/div/form[1]/div/div/div[2]/div/div/div[1]/div[2]/div[2]/div/div[2]/div/div[3]/div[2]/div/div/div/div/input");
    By clicknosignindialog = By.id("idBtn_Back");
    By enterurl = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/form/div[6]/div/input");
    By enterusernamevideo = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/form/div[7]/div/input");
    By enterpasswordvideo = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/form/div[8]/div/input");
    By entertagvideo = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/form/div[11]/div/div/input");
    By checkunlimitedvideo = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/form/div[10]/span/span[1]/input");
    By cancelcreatevideo = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/form/div[10]/div[1]/a");
    By clickeditbuttonbook = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[3]/div/table/tbody/tr[1]/td[6]/div/div[2]/a");
    By checkifbook = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[3]/div/table/tbody/tr[1]/td[3]");
    By clickcanceleditbook = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/form/div[8]/div[1]");
    By clickcreatebookbutton = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/form/div[8]/div[2]/button");
    By searchbynameoratuhor = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[1]/div/div[1]/div/div/div/input");
    By clicksearchcatalog = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[1]/div/button[1]");
    By editnamebook = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/form/div[4]/div/input");
    By editauthorbook = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/form/div[5]/div/input");
    By editquantitybook = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/form/div[6]/div/input");
    By edittagsbook = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/form/div[7]/div/div/input");
    By clickupdateassetvideo = By.xpath("//html/body/div[1]/div/div[2]/div/div/div/div/form/div[12]/div[2]/button");
    By clickupdateasset= By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/form/div[8]/div[2]/button");
    By searchbytags = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[1]/div/div[2]/div/div");
    By searchbytags1 = By.xpath("/html/body/div[5]/div[3]/ul/li[last()-3]");
    By searchbytags2 = By.xpath("/html/body/div[5]/div[3]/ul/li[last()-1]");

    By clickdeletebook = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[3]/div/table/tbody/tr/td[6]/div/div[3]");
    By clickdeletebook1= By.xpath("/html/body/div[4]/div[2]/div/div/div[3]/div[2]/div/button");
    By logoutbutton = By.xpath("/html/body/div[1]/div/div[1]/header/div/div/div/div[1]/button");
    By logoutbutton1 = By.xpath("/html/body/div/form/div/div/div[1]/div[2]/div/div/div/div[3]/div/div/div/div/div/div/div[2]");
    By clickoncreatevideo = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/form/div[12]/div[2]/button");

    By clickeditvideobutton = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[3]/div/table/tbody/tr[1]/td[6]/div/div[2]/a");
    By clicknextsigninuser = By.xpath("/html/body/div/form[1]/div/div/div[1]/div[2]/div[2]/div/div[2]/div/div[5]/div/div/div/div/div/input");
    By clickcancelsigninuser = By.xpath("/html/body/form/div[3]/div[2]/div[1]/div/table/tbody/tr/td/table/tbody/tr/td/div[2]/div/div/div[3]/table/tbody/tr[1]/td[3]/a");

    public PC_Library_Elements(WebDriver driver, WebDriverWait wait) {
        this.driver=driver;
        this.wait=wait;

    }


    public void navigateto(String url){
        driver.get(url);


    }

    public void signinbutton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.signinbutton)).click();

    }
    public void signinbuttton1(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.signinbutton1)).click();
    }
    public void enteremail(String email){
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.enteremail)).sendKeys(email);
    }
    public void clicknext(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.clicknext)).click();
    }
    public void enterpassword(String pass){
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.enterpassword)).sendKeys(pass);
    }
    public void signinbutton2(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.signinbutton2)).click();
    }
    public void clicknextsigninuser(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.clicknextsigninuser)).click();
    }
    public void clickcancelsigninuser(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.clickcancelsigninuser)).click();
    }
    public void clicknosignindialog(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.clicknosignindialog)).click();
    }
    public void clickassetpage(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.clickassetpage)).click();
    }
    public void clickcreateasset(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickcreateasset)).click();
    }
    public void uploadimagebook() throws InterruptedException, AWTException {
     /*   wait.until(ExpectedConditions.visibilityOfElementLocated(this.uploadimagebook))
        //  driver.findElement(By.cssSelector("#root > div > div.layout > div > div > div > div > form > div:nth-child(3) > div > label > span > span.MuiFab-label > svg")).sendKeys("C:\\Users\\User\\Desktop\\Book.jfif");
        driver.switchTo()
            .activeElement()
              .sendKeys("C:\\Users\\User\\Desktop\\Book.jfif");

      */


       // driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

       // wait.until(ExpectedConditions.visibilityOfElementLocated(this.uploadimage)).sendKeys("C:\\Users\\User\\Desktop\\Razno\\Book.jfif");/driver.findElement(By.cssSelector("#root > div > div.layout > div > div > div > div > form > div:nth-child(3) > div > label")).click();
        //driver.findElement(By.cssSelector("#root > div > div.layout > div > div > div > div > form > div:nth-child(3) > div > label")).sendKeys("C:\\Users\\User\\Desktop\\Book.jfif");

      //  driver.switchTo().
       // System.out.println("File is Uploaded Successfully");

        StringSelection s = new StringSelection("C:\\Users\\User\\Desktop\\Book.jfif");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
        Robot robot = new Robot();
        robot.keyPress(java.awt.event.KeyEvent.VK_ENTER);
        robot.keyRelease(java.awt.event.KeyEvent.VK_ENTER);
        robot.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
        robot.keyPress(java.awt.event.KeyEvent.VK_V);
        robot.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
        Thread.sleep(3000);
        robot.keyPress(java.awt.event.KeyEvent.VK_ENTER);


        /*
        driver.get("http://www.freepdfconvert.com/pdf-word");
        driver.findElement(By.id("clientUpload")).click();
        driver.switchTo()
                .activeElement()
                .sendKeys(
                        "/home/likewise-open/GLOBAL/123/Documents/filename.txt");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.id("convertButton"));

         */
    }


    public void entername(String name){
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.entername)).sendKeys(name);
    }

    public void enterauthor(String author){
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.enterauthor)).sendKeys(author);
    }
    public void enterurl(String urlvideo){
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.enterurl)).sendKeys(urlvideo);
    }
    public void enterusernamevideo(String usernamevideo){
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.enterusernamevideo)).sendKeys(usernamevideo);
    }
    public void enterpasswordvideo(String passwordvideo){
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.enterpasswordvideo)).sendKeys(passwordvideo);
    }
    public void enterquantity(String brojka){
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.enterquanity)).clear();
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.enterquanity)).sendKeys("2");
    }
    public void clickcreateassetbook(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.clickcreateassetbook)).click();
    }

    public void entertagbook(String tag){
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.entertagbook)).sendKeys(tag);
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.entertagbook)).sendKeys(Keys.ENTER);
    }
    public void entertagvideo(String tagvideo){
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.entertagvideo)).sendKeys(tagvideo);
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.entertagvideo)).sendKeys(Keys.ENTER);
    }

    public void clickcreatebookbutton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.clickcreatebookbutton)).click();
    }
    public void cancelcreatebook(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.cancelcreatebook)).click();
    }
    public void cancelcreatevideo(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.cancelcreatevideo)).click();
    }


    public void clickcreatevideo(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.clickcreatevideo)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.clickcreatevideo)).sendKeys(Keys.ARROW_DOWN);
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.clickcreatevideo)).sendKeys(Keys.ENTER);
    }
    public void uploadimagevideo(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.uploadimagevideo)).sendKeys("C:\\Users\\User\\Desktop\\Book.jfif");
    }

    public void clickeditbuttonbook(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.clickeditbuttonbook)).click();

       }
      // public void clickcanceleditbook(){
       //    wait.until(ExpectedConditions.visibilityOfElementLocated(this.clickcanceleditbook)).click();


    public void searchbynameorauthor(String nameorauthor){
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.searchbynameoratuhor)).sendKeys(nameorauthor);
    }
    public void clicksearchcatalog(){
        Actions actions = new Actions(driver);
        WebElement elementLocator = driver.findElement(clicksearchcatalog);
        actions.doubleClick(elementLocator).perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.clicksearchcatalog)).click();
    }

    public void editnamebook(String editname){
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.editnamebook)).clear();
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.editnamebook)).sendKeys(editname);
    }
    public void editauthorbook(String editauthor){
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.editauthorbook)).clear();
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.editauthorbook)).sendKeys(editauthor);
    }
    public void editquantitybook(String editqty){
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.editquantitybook)).clear();
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.editquantitybook)).sendKeys(editqty);
    }
    public void edittagsbook(String edittags){
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.edittagsbook)).clear();
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.edittagsbook)).sendKeys(edittags);
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.edittagsbook)).sendKeys(Keys.ENTER);
    }
    public void clickupdateasset(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.clickupdateasset)).click();
    }
    public void searchbytags(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.searchbytags)).click();
    }
    public void searchbytags2(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.searchbytags2)).click();
    }
    public void searchbytags1(){
       wait.until(ExpectedConditions.visibilityOfElementLocated(this.searchbytags1)).click();
    }
    public void clickcanceleditbook(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.clickcanceleditbook)).click();
    }
    public void clickdeletebook(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.clickdeletebook)).click();
    }
    public void clickdeletebook1(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.clickdeletebook1)).click();
    }
    public void logoutbutton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.logoutbutton)).click();
    }
    public void logoutbutton1(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.logoutbutton1)).click();
    }
    public void clickoncreatevideo(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.clickoncreatevideo)).click();
    }
    public void clickeditvideobutton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.clickeditvideobutton)).click();
    }
    public void clickupdateassetvideo(){
        click(this.clickupdateassetvideo);
    }

    public void click(By element) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(element)).click();
    }

       }




