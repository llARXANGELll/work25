package work29;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$;

public class CarChoicePage {

    private HomeAvtoRuPage homeAvtoRuPage = new HomeAvtoRuPage();
    private SelenideElement getSumOffers = $(By.cssSelector(".ButtonWithLoader__content"));
    private SelenideElement getSumOffersModel = $(By.cssSelector(".ButtonWithLoader__content"));
    private String sumValueAutoAllOffers = homeAvtoRuPage.getSumValueAutoAllOffers();
    private String saveValueModelAuto;

    public void checkValueCountBrand() {
        String allSumOffers = getSumOffers.getText().replaceAll("Показать ", "").replaceAll(" предложения| предложений| предложение", "");
        Assert.assertEquals(sumValueAutoAllOffers, allSumOffers);
    }

    public void saveOffersCarModel(String carModel) {
        SelenideElement valueModel = $(By.xpath("//a[text()='" + carModel + "']/following :: div"));
        saveValueModelAuto = valueModel.getText();
    }

    public void goToPageModelAuto(String goToNameCar) {
        $(By.xpath("//a[text()='" + goToNameCar + "']")).click();
    }

    public void checkSumOffers() {
        String allSumOfferModel = getSumOffersModel.getText().replaceAll("Показать ", "").replaceAll(" предложения| предложений| предложение", "");
        Assert.assertEquals(saveValueModelAuto, allSumOfferModel);
    }
}