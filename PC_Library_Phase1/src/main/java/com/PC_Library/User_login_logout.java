package com.PC_Library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class User_login_logout {
    private WebDriver driver;
    private WebDriverWait wait;

    public User_login_logout(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void click(By element) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(element)).click();
    }

   // public void sendkeys(By element) {
        //wait.until(ExpectedConditions.visibilityOfElementLocated(element)).sendKeys();
   // }

    By signinbutton = By.xpath("/html/body/div[1]/div/div/div/form/div/button");
    By enteremail = By.xpath("/html/body/div/form[1]/div/div/div[2]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/input[1]");
    By clicknext = By.id("idSIButton9");
    By enterpassword = By.xpath("/html/body/div/form[1]/div/div/div[2]/div/div/div[1]/div[2]/div[2]/div/div[2]/div/div[2]/div/div[2]/input");
    By signinbutton2 = By.xpath("/html/body/div/form[1]/div/div/div[2]/div/div/div[1]/div[2]/div[2]/div/div[2]/div/div[3]/div[2]/div/div/div/div/input");
    By clicknextsigninuser = By.xpath("/html/body/div/form[1]/div/div/div[1]/div[2]/div[2]/div/div[2]/div/div[5]/div/div/div/div/div/input");
    By clickcancelsigninuser = By.xpath("/html/body/form/div[3]/div[2]/div[1]/div/table/tbody/tr/td/table/tbody/tr/td/div[2]/div/div/div[3]/table/tbody/tr[1]/td[3]/a");
    By clicknosignindialog = By.id("idBtn_Back");
    By logoutbutton = By.xpath("/html/body/div[1]/div/div[1]/header/div/div/div/div[1]/button");
    By logoutbutton1 = By.xpath("/html/body/div/form/div/div/div[1]/div[2]/div/div/div/div[3]/div/div/div/div/div/div/div[2]");

    public void navigateto(String url) {
        driver.get(url);

    }

    public void signinbutton() {
        click(this.signinbutton);

    }

    public void enteremail(String email){
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.enteremail)).sendKeys(email);
    }

    public void clicknext() {

        click(this.clicknext);
    }

    public void enterpassword(String pass) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.enterpassword)).sendKeys(pass);
    }
    public void signinbutton2(){
        click(this.signinbutton2);
    }

    public void clicknextsigninuser() {
        click(this.clicknextsigninuser);
    }

    public void clickcancelsigninuser() {
        click(this.clickcancelsigninuser);
    }

    public void clicknosignindialog() {
        click(this.clicknosignindialog);
    }

    public void logoutbutton() {
        click(this.logoutbutton);
    }

    public void logoutbutton1() {
        click(this.logoutbutton1);
    }
}