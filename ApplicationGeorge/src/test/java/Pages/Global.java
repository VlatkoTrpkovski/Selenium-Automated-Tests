package Pages;

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
    private Object ChromeOptions;
 



    @BeforeMethod
    public void setup() throws InterruptedException, MalformedURLException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\IdeaProjects\\PC_Library\\Resources\\chromedriver.exe");

        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
        chromePrefs.put("profile.default_content_settings.popups", 0);
        chromePrefs.put("download.default_directory", "C:\\Users\\user\\Desktop\\QA");
        //  ChromeOptions options = new ChromeOptions();
        //  options.setExperimentalOption("prefs", chromePrefs);
        DesiredCapabilities cap =  DesiredCapabilities.chrome();
        cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        DesiredCapabilities capabilities = new DesiredCapabilities();
        // capabilities.setCapability(ChromeOptions.CAPABILITY, options);

        cap.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR,
                UnexpectedAlertBehaviour.IGNORE);

        //driver = new RemoteWebDriver(new URL("https://demoqa.com/upload-download"),cap);




        driver = new ChromeDriver(cap);
        driver.manage().window().maximize();
      //  wait = new WebDriverWait(driver, TIMEOUT);
      //  testPage = new TestPage(driver, wait);

    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }


    private class CAPABILITY {
    }
}

