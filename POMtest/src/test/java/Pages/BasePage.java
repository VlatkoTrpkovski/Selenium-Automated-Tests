package Pages;

import Helpers.WebDriverFactory;
import UIMaps.HomePageUIMaps;
import UIMaps.LoginPageUIMaps;
import org.openqa.selenium.WebDriver;

public class BasePage {

    protected WebDriver driver = WebDriverFactory.getWebDriver();
    protected LoginPageUIMaps loginPageUIMaps;
    protected HomePageUIMaps homePageUIMaps;

    public BasePage(){
        loginPageUIMaps = new LoginPageUIMaps();
        homePageUIMaps = new HomePageUIMaps();
    }

}
