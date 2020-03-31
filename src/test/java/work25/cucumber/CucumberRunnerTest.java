package work25.cucumber;

import io.cucumber.java.ru.Затем;
import io.cucumber.java.ru.Когда;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import work23.LoginPage;
import work23.SmsConfirmationPage;
import work25.Work25Test;

import static com.codeborne.selenide.Selenide.open;


@CucumberOptions(
        plugin = "json:target/cucumber-report.json",
        features = "src/test/resources/feature",
        glue = "work25.stepsCucumber"
)
public class CucumberRunnerTest extends AbstractTestNGCucumberTests {

}
