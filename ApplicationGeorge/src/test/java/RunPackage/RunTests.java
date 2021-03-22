package RunPackage;


import TestStepDefinitions.TestStepDefinitions;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.plugin.event.TestStep;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\User\\IdeaProjects\\ApplicationGeorge\\src\\test\\java\\Features", glue = "TestStepDefinitions",tags = "@GeneralFunctionalityTest",plugin = {"json:target/cucumber.json" })


public class RunTests {
}
