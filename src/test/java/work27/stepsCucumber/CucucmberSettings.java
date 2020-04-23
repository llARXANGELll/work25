package work27.stepsCucumber;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.Before;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class CucucmberSettings {
    @Before
    public void selenideConfiguration() {

        Properties properties = new Properties();

        try (FileInputStream files = new FileInputStream("src/test/resources/config/cucumberConfig.properties")) {
            properties.load(files);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new IllegalArgumentException("Файл не найден");
        } catch (IOException e) {
            e.printStackTrace();
            throw new IllegalArgumentException("Свойства в файле не заданы");
        }

        Configuration.browser = properties.getProperty("browser");
        Configuration.clickViaJs = true;
    }
}
