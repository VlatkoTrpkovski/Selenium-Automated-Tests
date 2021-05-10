package TestStepDefinitions;

import Pages.TestPage_Delete_Fields_AssetType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestStepDef_Delete_Fields_AssetType extends TestPage_Delete_Fields_AssetType {
    @When("I click Delete button for the previously Edited row in the FieldsTable")
    public void IclickDeleteButtonForThePreviouslyEditedrowintheFieldsTable() throws InterruptedException {
        clickDeleteFieldRow();

    }

    @Then("I check if the row is deleted")
    public void iCheckIfTheRowIsDeleted() {
        checkIfRowIsDeleted();
    }

    @Then("I click on Continue")
    public void iClickOnContinue() {
        clickContinue();
    }

    @And("I delete the whole AssetType, if it is not used by an Asset")
    public void iDeleteTheWholeAssetTypeIfItIsNotUsedByAnAsset() throws InterruptedException {
        deleteWholeAsset();
    }

    @Then("I check if the AssetType is deleted")
    public void iCheckIfTheAssetTypeIsDeleted() throws InterruptedException {
        checkIfAssetTypeIsDeleted();
    }
}
