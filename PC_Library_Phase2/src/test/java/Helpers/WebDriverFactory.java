package Helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverFactory {

    private static WebDriver driver;

    public static WebDriver getWebDriver() {
        if (driver != null){
            if(!driver.toString().contains("null") || driver == null)
                return driver;
        }
        if(driver == null) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\IdeaProjects\\PC_Library_Phase2\\src\\test\\java\\Helpers\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if(driver.toString().contains("null") || driver == null)
        {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\IdeaProjects\\PC_Library_Phase2\\src\\test\\java\\Helpers\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        return driver;

    }

}



