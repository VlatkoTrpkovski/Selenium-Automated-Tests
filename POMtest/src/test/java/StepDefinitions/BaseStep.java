package StepDefinitions;

import Helpers.WebDriverFactory;
import Pages.HomePage;
import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class BaseStep {
    protected WebDriver driver = WebDriverFactory.getWebDriver();
    protected LoginPage loginPage;
    protected HomePage homePage;

    public BaseStep(){

        loginPage = new LoginPage();
        homePage = new HomePage();
    }
}
