package StepDefinitions;

import com.fasterxml.jackson.databind.ser.Serializers;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginSteps extends BaseStep {

    @Given("I navigate to '(.*)'$")
    public void iNavigateToUrl(String url) {
        driver.navigate().to(url);
        this.driver.manage().window().maximize();
        String currentUrl = this.driver.getCurrentUrl();
        Assert.assertEquals(url, currentUrl);
    }

    @When("I add username '(.*)' and password '(.*)'$")
    public void iAddUsernameAndPassword(String username, String password) {
        loginPage.addUsernameAndPass(username, password);
    }

    @And("Click on login button")
    public void clickOnLoginButton() {
        loginPage.clickLoginBtn();
    }
}
