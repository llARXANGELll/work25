package work28;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.*;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.ex.ElementNotFound;
import org.openqa.selenium.By;
import org.testng.Assert;

public class HomeAvtoRuPage {

    private static String sumValueAutoAllOffers;
    private SelenideElement offerVisibility = $(".Button_color_transparentBlue");

    public String getSumValueAutoAllOffers() {
        return sumValueAutoAllOffers;
    }

    public void openSuite(String nameSuite) {
        Selenide.open(nameSuite);
    }

    public void checkNamePageTitile(String getNameTitile) {
        Assert.assertTrue(title().matches(getNameTitile));
    }

    public void closeOffer() {
        try {
            offerVisibility.waitUntil(Condition.visible, 2000);
            offerVisibility.doubleClick();
        } catch (ElementNotFound ignore) {
        }
    }

    public void saveCountBrand(String countBrand) {
        SelenideElement valueAuto = $(By.xpath("//div[text() = '" + countBrand + "']/following :: div"));
        sumValueAutoAllOffers = valueAuto.getText();
    }

    public void goToThePageAuto(String clickNameAuto) {
        SelenideElement clickAuto = $(By.xpath("//div[text() = '" + clickNameAuto + "']/ancestor::a"));
        clickAuto.click();
    }
}