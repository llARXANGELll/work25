package work29.cucumber;

import com.codeborne.selenide.Configuration;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeMethod;

@CucumberOptions(
        plugin = "json:target/cucumber-report.json",
        features = "src/test/resources/feature/work29",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        glue =
                "work28.stepsCucumber"



)
public class CucumberRunnerTest extends AbstractTestNGCucumberTests {

    @BeforeMethod
    public void selenideConfiguration() {
        Configuration.browser = "chrome";
        Configuration.clickViaJs = true;

    }
}