package TestStepDefinitions;

import Helpers.WebDriverFactory;
import Pages.TestPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestStepDefinitions extends TestPage {


    @Given("I open the web browser")
    public void openBrowser() {
        startBrowser();
    }

    @Then("I navigate to GeorgeApp site")
    public void navigatetosite() throws InterruptedException {

        openGeorgeApp();
    }

    @Then("I click on the signIn button")
    public void clicksigninbutton() throws InterruptedException {
        signInButton();
    }

    @Then("I click on Zprava prectena")
    public void clickOnZpravapractena() {
        clickZpravapractena();
    }
    @Then("I click on image")
    public void clickOnimage() {
        clickImage();
    }

    @Then("I click on radiobutton for english language")
    public void clickOnRadioButtonEnglish() throws InterruptedException {
        clickRadioButtonEnglish();
    }
    @Then("I click on MessageRead")
    public void clickOnMesseageRead() {
        clickMessageRead();
    }
    @Then("I click on Overview")
    public void clickOnOverview() throws InterruptedException {
        clickOverview();
    }
    @When("I enter text in the search bar")
    public void enterTextInSearchBar() throws InterruptedException {
        String enterText = "LIFTAGO";
        enterTextSearchBar(enterText);
    }
    @Then("I check if the input is correct")
    public void checkInputText() throws InterruptedException {
        checkInput();
    }
    @Then("I check if i can open and close searched item")
    public void openAndCloseSearchedItem() throws InterruptedException {
        openAndCloseItemFromSearchBar();
    }
    @Then("I check if image from the searched item exists")
    public void imageExists() throws InterruptedException {
        itemImageExists();
    }

    @Then("I check if the sum of the outgoing transactions is correct on monthly and annual level")
    public void checkOutgoingTransactionSum() throws InterruptedException {
        clickPrintButton();
        getPriceElement();
    }

    @When("I click X on the search bar")
    public void clickXonTheSearchBar() throws InterruptedException {
        clickCancelPrint();
        clickXsearchBar();
    }
    @Then("Message \"I'm sorry, I couldn't find any transactions.\" is displayed")
        public void messageXisDisplayed() throws InterruptedException {
        msgXisDisplayed();
        }
    @When("I enter Non Existing item in the searchBar")
    public void enterNoNExistingItem() throws InterruptedException {
        String enterNoExistingitem = "Vienna";
        enterNonExistingItem(enterNoExistingitem);
    }
    @Then("I get approriate message")
    public void checkResponseIteatDoesNotExisT1() throws InterruptedException {
        checkResponseIteatDoesNotExisT();
    }

    @And("I logOut")
    public void IlogOut() throws InterruptedException {
        clickLogOut();
    }

    @Then("I close the browser")
    public void closeTheBrowser() throws InterruptedException {
        tearDown();
    }
}





