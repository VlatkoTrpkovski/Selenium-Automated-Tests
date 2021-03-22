package com.PC_Library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class User_AssetPage_Actions {

    private WebDriver driver;
    private WebDriverWait wait;
    private By enternameorauthor;
    private By clicksearchcatalog;


    public User_AssetPage_Actions(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;

    By enternameorauthor = By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[1]/div/div[1]/div/div/div/input");
    By clicksearchcatalog = By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[1]/div/button[1]");
    }
   public void click(By element) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(element)).click();
    }

    public void sendkeys1(By element) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(element)).sendKeys();
    }
    public void enternameorauthor(String nameorauthor){
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.enternameorauthor)).sendKeys();
    }
    public void clicksearchcatalog(){ click(this.clicksearchcatalog);}





}