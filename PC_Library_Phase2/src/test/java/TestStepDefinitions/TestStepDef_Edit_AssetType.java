package TestStepDefinitions;

import Helpers.WebDriverFactory;
import Pages.TestPage_Edit_AssetType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestStepDef_Edit_AssetType extends TestPage_Edit_AssetType {
    @Given("I click on edit for the previously created AssetType")
    public void iClickOnEditForThePreviouslyCreatedAssetType() throws InterruptedException {
        clickEditAsset();
    }


    @Then("I click edit button for the previously entered row in the FieldsTable")
    public void iClickEditButtonForThePreviouslyEnteredRowInTheFieldsTable() throws InterruptedException {
        clickEditField();
    }

    @And("I change the input for FieldName  and check the unchecked boxes and click updateType")
    public void iChangeTheInputForFieldNameAndCheckTheUncheckedBoxesAndClickUpdateType() {
        editAssetField();

    }

    @And("Check if changes are saved properly in the FieldsTable, asserts")
    public void checkIfChangesAreSavedProperlyInTheFieldsTableAsserts() throws InterruptedException {
        checkIfUpdated();
    }

    @Then("Navigate back to AssetType Page")
    public void navigateBackToAssetTypePage() {
        //navigateToAssetTypePage();
    }
}
