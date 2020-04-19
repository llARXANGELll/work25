package work29.cucumber;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.Before;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeMethod;

import javax.rmi.CORBA.Util;
import java.io.*;
import java.util.Properties;

@CucumberOptions(
        plugin = "json:target/cucumber-report.json",
        features = "src/test/resources/feature/work29",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        glue ={
                "work28.stepsCucumber",
                "work27.stepsCucumber",
                "work30.hooks"
        },
        tags = "@work28 or @work27"
)

public class CucumberRunnerTest extends AbstractTestNGCucumberTests {

        @Before
        public void selenideConfiguration() {
                FileInputStream fils;
                Properties properties = new Properties();
                try {
                        fils = new FileInputStream("src/test/resources/config/cucumberConfig.properties");
                        properties.load(fils);
                } catch (IOException ignored) {
                }
                Configuration.browser = properties.getProperty("browser");
                Configuration.clickViaJs = true;
        }
}
