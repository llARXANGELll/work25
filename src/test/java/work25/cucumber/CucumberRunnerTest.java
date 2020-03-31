package work25.cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import work25.Work25Test;


@CucumberOptions(
        plugin = "json:target/cucumber-report.json",
        features = "src/test/resources/feature",
        glue = "work25"
)
public class CucumberRunnerTest extends AbstractTestNGCucumberTests {
}
