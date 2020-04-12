package work28;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import static com.codeborne.selenide.Selenide.*;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.ex.ElementShould;
import org.openqa.selenium.By;
import org.testng.Assert;

public class HomePage {

    static String sumValueAutoAllOffers;
    SelenideElement offerVisibility = $(".Button_color_transparentBlue");

    public void openSuite(String nameSuite) {
        Selenide.open(nameSuite);
    }

    public void checkNamePageTitile (String getNameTitile) {
        Assert.assertTrue(title().matches(getNameTitile));
    }

    public void closeOffer() {
        try {
            offerVisibility.waitUntil(Condition.visible, 2000);
                    offerVisibility.doubleClick();
            System.out.println("Элемент закрыли");
        } catch (ElementShould ignore) {
            System.out.println("Элемент не найден");
        }

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