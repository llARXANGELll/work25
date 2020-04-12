package work28;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$;

public class PageCarChoice {

    HomePageAvto homePageAvto = new HomePageAvto();
    SelenideElement getSumOffers = $(By.cssSelector(".ButtonWithLoader__content"));
    SelenideElement getSumOffersModel = $(By.cssSelector(".ButtonWithLoader__content"));
    String sumValueAutoAllOffers = homePageAvto.sumValueAutoAllOffers;
    static String saveValueModelAuto;

    public void checkValueCountBrand() {
        String allSumOffers = getSumOffers.getText().replaceAll("Показать ", "").replaceAll(" предложений", "");
        sumValueAutoAllOffers.equals(allSumOffers);
    }

    public void saveOffersCarModel(String carModel) {
        SelenideElement valueModel = $(By.xpath("//a[text()='"+carModel+"']/following :: div"));
        saveValueModelAuto = valueModel.getText();
    }

    public void goToPageModelAuto(String goToNameCar) {
        SelenideElement click = $(By.xpath("//a[text()='"+goToNameCar+"']"));
        click.click();
        System.out.println(click);
    }

    public void checkSumOffers() {
        String allSumOfferModel = getSumOffersModel.getText().replaceAll("Показать ", "").replaceAll(" предложений", "");
        allSumOfferModel.equals(saveValueModelAuto);
    }
}
