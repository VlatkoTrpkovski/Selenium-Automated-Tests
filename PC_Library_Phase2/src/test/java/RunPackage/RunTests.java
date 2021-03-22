package RunPackage;


import TestStepDefinitions.TestStepDef_CRUD_AssetType;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.plugin.event.TestStep;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\User\\IdeaProjects\\PC_Library_Phase2\\src\\test\\java\\Features\\CRUD_AssetType.feature", glue = "TestStepDef_CRUD_AssetType",tags = "@SmokeTestsPositiveScenarios1")


public class RunTests {
}



