package TestStepDefinitions;

import Pages.TestPage_Login_Logout_Admin;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class TestStepDef_Login_Logout_Admin extends TestPage_Login_Logout_Admin {


    @Given("I open browser and navigate to the website")
    public void openBrowser() {
        startBrowser();
        navigateto();
    }
    @Then("I login into the application As Admin")
    public void LoginAsAdmin(){
        signinbutton();
        String email = "vlatko.trpkovski@polarcape.com";
        enteremail(email);
        clicknext();
        String pass = "Qamajstor333$";
        enterpassword(pass);
        signinbutton2();
        clickNoBtn();

    }

}
