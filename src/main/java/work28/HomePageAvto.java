package work28;

import com.codeborne.selenide.Selenide;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

import com.codeborne.selenide.SelenideElement;
import com.sun.xml.internal.ws.api.ha.StickyFeature;
import io.cucumber.java.ru.Допустим;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.List;

public class HomePageAvto {



    public void openSuite(String nameSuite) {
        Selenide.open(nameSuite);
    }

    public void checkNamePageTitile (String getNameTitile) {
        Assert.assertTrue(title().matches(getNameTitile));
    }

    @Override
    public String toString() {
        return "valueAuto";
    }



    public void saveCountBrand(SelenideElement countBrand) {
        SelenideElement valueAuto = $(By.xpath("//div[text() = '"+countBrand+"']/following :: div"));

    }

    public void goToThePageAuto(String clickNameAuto) {
        SelenideElement clickAuto = $(By.xpath("//div[text() = '"+clickNameAuto+"']/ancestor::a"));
        clickAuto.click();
    }
}
