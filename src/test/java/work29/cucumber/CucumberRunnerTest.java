package work29.cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = "json:target/cucumber-report.json",
        features = "src/test/resources/feature/work29",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        glue ={
                "work28.stepsCucumber",
                "work27.stepsCucumber",
        },
        tags = "@work28 or @work27"
)

public class CucumberRunnerTest extends AbstractTestNGCucumberTests {

}