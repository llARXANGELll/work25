package work25.cucumber;

import com.codeborne.selenide.Configuration;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.open;


@CucumberOptions(
        plugin = "json:target/cucumber-report.json",
        features = "src/test/resources/feature",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        glue = "work25.stepsCucumber"
)
public class CucumberRunnerTest extends AbstractTestNGCucumberTests {

    @BeforeMethod
    public void selenideConfiguration() {
        Configuration.browser = "chrome";
        Configuration.clickViaJs = true;
    }
}
