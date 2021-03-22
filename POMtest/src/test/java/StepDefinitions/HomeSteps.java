package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class HomeSteps extends BaseStep {

    @And("I am logged in")
    public void iAmLoggedIn() {
        homePage.verifyHomePageOpened();
    }

    @And("I click on the menu button")
    public void iClickOnTheMenuButton() {
        homePage.clickOnMenuBtn();
    }

    @Then("I logout")
    public void iLogout() {
        homePage.clickOnLogoutLink();
        loginPage.verifyLoginPageOpened();
    }
}
