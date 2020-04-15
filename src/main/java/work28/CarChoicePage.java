package work28;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$;

public class CarChoicePage {

    private SelenideElement getSumOffers = $(By.cssSelector(".ButtonWithLoader__content"));
    private SelenideElement getSumOffersModel = $(By.cssSelector(".ButtonWithLoader__content"));

    public void checkValueCountBrand() {
        String sumOffers = getSumOffers.getText().replaceAll("Показать ", "").replaceAll(" предложения| предложений| предложение", "");
        Assert.assertEquals(AvtoRuData.getInstance().getSumValueAutoAllOffers(), sumOffers);
    }

    public void saveOffersCarModel(String carModel) {
        String valueModel = $(By.xpath("//a[text()='"+carModel+"']/following :: div")).getText();
        AvtoRuData.getInstance().setSumValueAutoAllOffers(valueModel);
    }

    public void goToPageModelAuto(String goToNameCar) {
        $(By.xpath("//a[text()='" + goToNameCar + "']")).click();
    }

    public void checkSumOffers() {
        String allSumOfferModel = getSumOffersModel.getText().replaceAll("Показать ", "").replaceAll(" предложения| предложений| предложение", "");
        Assert.assertEquals(AvtoRuData.getInstance().getSumValueAutoAllOffers(), allSumOfferModel);
    }
}