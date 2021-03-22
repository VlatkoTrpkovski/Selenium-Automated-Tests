package TestStepDefinitions;

import Pages.TestPage_CRUD_AssetTpes;
import io.cucumber.java.en.Then;

public class TestStepDef_CRUD_AssetTpe extends TestPage_CRUD_AssetTpes {
    @Then("I login into the application")
    public void enterTeam() {
    String tim = "AcMilan";
    enterAcMilan(tim);
}

}

