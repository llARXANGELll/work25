package work28;

import com.codeborne.selenide.Selenide;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import org.testng.Assert;

public class HomePageAvito {

    public void openSuite(String nameSuite) {
        Selenide.open(nameSuite);
    }
    public void checkNamePageTitile (String getNameTitile) {
        Assert.assertEquals(getWebDriver().getTitle(), getNameTitile);
        System.out.println("");
    }
}
