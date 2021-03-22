package com.PC_Library;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.util.HashMap;

public class Global {
    public WebDriver driver;
    public WebDriverWait wait;
    public static final int TIMEOUT = 20;
    public PC_Library_Elements elementpage;
    private Object ChromeOptions;
    public User_login_logout UserLogin;
    public User_AssetPage_Actions UserAssetPageActions;


    @BeforeMethod
    public void setup() throws InterruptedException, MalformedURLException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\IdeaProjects\\PC_Library_Phase1\\src\\main\\resources\\chromedriver.exe");

        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
        chromePrefs.put("profile.default_content_settings.popups", 0);
        chromePrefs.put("download.default_directory", "C:\\Users\\user\\Desktop\\QA");
      //  ChromeOptions options = new ChromeOptions();
      //  options.setExperimentalOption("prefs", chromePrefs);
      //  DesiredCapabilities cap =  DesiredCapabilities.chrome();
     //   cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
     //   DesiredCapabilities capabilities = new DesiredCapabilities();
       // capabilities.setCapability(ChromeOptions.CAPABILITY, options);

       // cap.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR,
        //        UnexpectedAlertBehaviour.IGNORE);

        //driver = new RemoteWebDriver(new URL("https://demoqa.com/upload-download"),cap);




       driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, TIMEOUT);
        elementpage = new PC_Library_Elements(driver, wait);
        UserLogin = new User_login_logout(driver,wait);
        UserAssetPageActions = new User_AssetPage_Actions(driver,wait);

    }
        @AfterMethod
                public void tearDown() throws InterruptedException {
            Thread.sleep(3000);
            driver.quit();
        }


    private class CAPABILITY {
    }
}


