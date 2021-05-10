package TestStepDefinitions;

import Pages.TestPage_Create_Asset;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class TestStepDef_Create_Asset extends TestPage_Create_Asset {
    @Given("I navigate to the AssetType Page and click on Create Asset button")
        public void InavigateToTheAssetTypePageAndClickOnCreateAssetButton(){
        clickAssetPage();
        clickCreateAsset();
    }

    @And("I choose to Create Tablet Asset")
    public void iChooseToCreateAsset() throws InterruptedException {
        chooseAssetType();

    }

    @Then("I fill the necessary Data into the Asset and click on Create")
    public void iFillTheNecessaryDataIntoTheAssetAndClickOnCreate() {
        String name = "Samsung";
        String model = "S20+";
        enterAssetData(name,model);

    }

    @Then("I check if the Asset is Created with the correct input")
    public void iCheckIfTheAssetIsCreatedWithTheCorrectInput() {
    }
}
