package TestStepDefinitions;

import Pages.TestPage_Create_AssetType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestStepDef_Create_AssetType extends TestPage_Create_AssetType {




    @And("I click on Create AssetType")
    public void iClickOnCreateAssetType() {
        clickCreateAssetTypeBtn();
    }



    @When("I enter values for Static and Dynamic Fields and click on add type")
    public void enterAssetType(){
        String AssetTypeName = "Tablet";
        enterAssetTypeName(AssetTypeName);
        String AssetName = "Model";
        enterAssetName(AssetName);
        checkRequiredBox();
        clickAddType();
    }


    @Then("Values are entered into the FieldsTable - asserts")
    public void valuesAreEnteredIntoTheFieldsTableAsserts() throws InterruptedException {
        checkFieldName();
        checkAssetFieldType();
        checkIfReqBoxIsChecked();
        Thread.sleep(3000);
    }

    @And("I click on CreateType")
    public void iClickOnCreateType() {
        clickCreateType();
    }



    @And("I can see the new AssetType into the AssetType Table in AssetTypePage - check if it exits")
    public void iCanSeeTheNewAssetTypeIntoTheAssetTypeTableInAssetTypePage() throws InterruptedException {
        checkAssetTypeName();
    }

    @Then("Navigate back to AssetTypePage")
    public void navigateBackToAssetTypePage() {
        navigateToAssetTypePage();
    }


}


