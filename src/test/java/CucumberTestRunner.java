import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = {"classpath:features"},
        glue = {"com.automation.exercise.stepdefinitions", "com.automation.exercise.hooks"},
        tags = "",
        monochrome = true, dryRun = false,
        plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json"})
public class CucumberTestRunner extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
