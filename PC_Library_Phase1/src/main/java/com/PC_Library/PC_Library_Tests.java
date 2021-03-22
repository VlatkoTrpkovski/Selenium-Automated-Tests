package com.PC_Library;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import javax.xml.namespace.QName;
import java.awt.*;

public class PC_Library_Tests extends Global {

    String url = "http://localhost:3000/";
    String urlassets = "http://localhost:3000/assets";
    String name = "cekajki go godo1@";
    String author = "Onore de Balzak2#";

    int brojka = 2;
    String tagbook = "Agile";
    String email = "vlatko.trpkovski@polarcape.com";
    String pass = "Qamajstor333$";
    String urlvideo = "https://www.videolecture.com";
    String usernamevideo = "Arsene Lupin 1@";
    String passwordvideo = "123qwe!@#";
    String tagivideo = "AgileVideo!@3";
    String editname = "Python Extension";
    String editauthor = "Python GMBH";
    String editqty = "3";
    String edittags = "Developing";
    String namevideo = "Video Python";
    String editnamevideo = "Video Java";
    String editauthorvideo = "Java GMBH";
    String editurlvideo = "www.javagmbh.com";
    String editusernamevideo = "user1@";
    String editpasswordvideo = "Pass2#";
    String edittagsvideo = "AgileJava";
    String emailuser = "clyde@polarcape.com";
    String passuser = "Bangbang<3";
    String nameOrAuthorBookUser= "Kniga";

    @Test
    public void CRUD_BOOK_VIDEO_SPRINT1_ADMIN() throws InterruptedException, AWTException {
        elementpage.navigateto(url);
        elementpage.signinbutton();
        elementpage.enteremail(email);
        elementpage.clicknext();
        elementpage.enterpassword(pass);
        elementpage.signinbutton2();
        elementpage.clicknosignindialog();
        Thread.sleep(10000);
        elementpage.navigateto(urlassets);
        elementpage.clickcreateasset();
        Thread.sleep(5000);
        elementpage.entername(name);
        Thread.sleep(5000);
        elementpage.enterauthor(author);
        elementpage.enterquantity("2");
        elementpage.entertagbook(tagbook);
        Thread.sleep(5000);
        elementpage.clickcreatebookbutton();
        Thread.sleep(5000);
        elementpage.searchbynameorauthor(name);
        Thread.sleep(2000);
        elementpage.clicksearchcatalog();
        Thread.sleep(2000);
        elementpage.clickeditbuttonbook();
        elementpage.editnamebook(editname);
        elementpage.editauthorbook(editauthor);
        elementpage.editquantitybook(editqty);
        Thread.sleep(2000);
        elementpage.edittagsbook(edittags);
        elementpage.clickupdateasset();
        Thread.sleep(2000);
        elementpage.searchbytags();
        elementpage.searchbytags1();
        Thread.sleep(2000);
        elementpage.clicksearchcatalog();
        Thread.sleep(2000);
        elementpage.clickdeletebook();
        Thread.sleep(2000);
        elementpage.clickdeletebook1();
        Thread.sleep(2000);
        elementpage.clickcreateasset();
        Thread.sleep(2000);
        elementpage.clickcreatevideo();
        Thread.sleep(2000);
        // elementpage.uploadimagevideo();
        elementpage.entername(namevideo);
        Thread.sleep(2000);
        elementpage.enterauthor(author);
        Thread.sleep(2000);
        elementpage.enterurl(urlvideo);
        Thread.sleep(2000);
        elementpage.enterusernamevideo(usernamevideo);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)");
        elementpage.enterpasswordvideo(passwordvideo);
        Thread.sleep(2000);
        elementpage.entertagvideo(tagivideo);
        elementpage.clickoncreatevideo();
        elementpage.searchbynameorauthor(namevideo);
        elementpage.clicksearchcatalog();
        elementpage.clickeditvideobutton();
        elementpage.editnamebook(editnamevideo);
        Thread.sleep(2000);
        elementpage.editauthorbook(editauthorvideo);
        elementpage.enterurl(editurlvideo);
        Thread.sleep(2000);
        elementpage.enterusernamevideo(editusernamevideo);
        Thread.sleep(2000);
        elementpage.enterpasswordvideo(editpasswordvideo);
        Thread.sleep(2000);
        elementpage.entertagvideo(edittagsvideo);
        Thread.sleep(2000);
        elementpage.clickupdateassetvideo();
        elementpage.searchbytags();
        elementpage.searchbytags2();
        Thread.sleep(2000);
        elementpage.clicksearchcatalog();
        Thread.sleep(2000);
        elementpage.clickdeletebook();
        Thread.sleep(2000);
        elementpage.clickdeletebook1();
        Thread.sleep(2000);
        elementpage.logoutbutton();
        Thread.sleep(2000);
        elementpage.logoutbutton1();
    }

        @Test
        public void READ_ACTIONS_USER_SPRINT2() throws InterruptedException {

            UserLogin.navigateto(url);
            UserLogin.signinbutton();
            UserLogin.enteremail(emailuser);
            Thread.sleep(5000);
            UserLogin.clicknext();
            UserLogin.enterpassword(passuser);
            UserLogin.signinbutton2();
            UserLogin.clicknextsigninuser();
            UserLogin.clickcancelsigninuser();
            UserLogin.clicknosignindialog();
            Thread.sleep(5000);
            driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/header/div/div/div/div[1]/div/a[2]"));
            UserAssetPageActions.enternameorauthor(nameOrAuthorBookUser);
            UserAssetPageActions.clicksearchcatalog();
            Thread.sleep(5000);
            UserLogin.logoutbutton();
            UserLogin.logoutbutton1();


        }





    }

