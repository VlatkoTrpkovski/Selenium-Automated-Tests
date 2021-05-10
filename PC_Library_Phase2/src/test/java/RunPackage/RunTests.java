package RunPackage;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\User\\IdeaProjects\\PC_Library_Phase2\\src\\test\\java\\Features\\CRUD_AssetType.feature", glue = "TestStepDef_Create_AssetType,TestStepDef_Edit_AssetType,TestStepDef_Login_Logout_Admin,TestStepDef_Delete_Fields_AssetType",tags = "@SmokeTestsPositiveScenarios")


public class RunTests {
}



