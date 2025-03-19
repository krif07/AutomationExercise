import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"classpath:features"},
        glue = {"com.automation.exercise.stepdefinitions", "com.automation.exercise.hooks"},
        tags = "@incorrect_login",
        monochrome = true, dryRun = false,
        plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json"})
public class CucumberTestRunner extends AbstractTestNGCucumberTests {
}
