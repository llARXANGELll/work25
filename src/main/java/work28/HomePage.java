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

    public void closeOffer() {
        $(By.className("Button_color_transparentBlue")).waitUntil(Condition.visible, 5000).doubleClick();
    }

    public void saveCountBrand(String countBrand) {
        SelenideElement valueAuto = $(By.xpath("//div[text() = '"+countBrand+"']/following :: div"));
        sumValueAutoAllOffers = valueAuto.getText();

    }

    public void goToThePageAuto(String clickNameAuto) {
        SelenideElement clickAuto = $(By.xpath("//div[text() = '"+clickNameAuto+"']/ancestor::a"));
        clickAuto.click();
    }
}