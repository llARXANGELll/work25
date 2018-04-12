package work28;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import static com.codeborne.selenide.Selenide.*;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.Assert;



public class HomePage {

    static String sumValueAutoAllOffers;

    public void openSuite(String nameSuite) {
        Selenide.open(nameSuite);
    }

    public void checkNamePageTitile (String getNameTitile) {
        Assert.assertTrue(title().matches(getNameTitile));
    }

    public void closeCookie() {
        $("a.cookie-warning__close").waitUntil(Condition.visible, 10000).click();
    }

    public void saveCountBrand(String countBrand) {
        SelenideElement valueAuto = $(By.xpath("//div[text() = '"+countBrand+"']/following :: div"));

//        $(".Button_color_transparentBlue").click();

        $("a.cookie-warning__close").waitUntil(Condition.visible, 10000).click();
    }

    public void goToThePageAuto(String clickNameAuto) {
        SelenideElement clickAuto = $(By.xpath("//div[text() = '"+clickNameAuto+"']/ancestor::a"));
        clickAuto.click();
    }
}