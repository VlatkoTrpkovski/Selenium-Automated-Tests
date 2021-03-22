package TestStepDefinitions;

import Pages.TestPage_Login_Logout;
import io.cucumber.java.en.Given;

public class TestStepDef_Login_Logout extends TestPage_Login_Logout {

    @Given("I open browser and navigate to the website")
    public void openBrowser() {
        startBrowser();
        navigateto();
    }
}
