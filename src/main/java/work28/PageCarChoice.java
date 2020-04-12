package work28;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$;

public class PageCarChoice {

    HomePageAvto homePageAvto = new HomePageAvto();
    SelenideElement getSumOffers = $(By.xpath("//span[@class='ButtonWithLoader__content']"));
    String sumValueAutoAllOffers = homePageAvto.sumValueAutoAllOffers;

    public void checkValueCountBrand() {
        String allSumOffers = getSumOffers.getText().replaceAll("Показать ", "").replaceAll(" предложений", "");
        sumValueAutoAllOffers.equals(allSumOffers);
    }
}
