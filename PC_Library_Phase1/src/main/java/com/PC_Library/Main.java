package com.PC_Library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Main {

    public static void main(String[] args) {
        System.out.println("Ac MIlan");

        System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\IdeaProjects\\PC_Library\\Resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://bruttonetto.arbeiterkammer.at/");

    }
}
