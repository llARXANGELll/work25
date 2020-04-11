package work28;

import com.codeborne.selenide.Selenide;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.ru.Допустим;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.List;

public class HomePageAvito {



    public void openSuite(String nameSuite) {
        Selenide.open(nameSuite);
    }

    public void checkNamePageTitile (String getNameTitile) {
        Assert.assertTrue(title().matches(getNameTitile));
    }

    public void saveCountBrand(String countBrand) {
        SelenideElement valueAuto = $(By.xpath("//div[text() = '"+countBrand+"']/following :: div"));
    }
    public void goToThePageAuto(String clickNameAuto) {
        SelenideElement clickAuto = $(By.xpath("//div[text() = '"+clickNameAuto+"']/ancestor::a"));
        System.out.println(clickAuto);
        clickAuto.click();
        System.out.println("d");

    }
}
