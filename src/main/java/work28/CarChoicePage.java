package work28;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$;

public class CarChoicePage {

    private HomePage homePage = new HomePage();
    private SelenideElement getSumOffers = $(By.cssSelector(".ButtonWithLoader__content"));
    private SelenideElement getSumOffersModel = $(By.cssSelector(".ButtonWithLoader__content"));
    private String sumValueAutoAllOffers = homePage.sumValueAutoAllOffers;
    private String saveValueModelAuto;

    public void checkValueCountBrand() {
        String allSumOffers = getSumOffers.getText().replaceAll("Показать ", "").replaceAll(" предложения| предложений| предложение", "");
        Assert.assertTrue(sumValueAutoAllOffers.equals(allSumOffers));
    }

    public void saveOffersCarModel(String carModel) {
        SelenideElement valueModel = $(By.xpath("//a[text()='"+carModel+"']/following :: div"));
        saveValueModelAuto = valueModel.getText();
    }

    public void goToPageModelAuto(String goToNameCar) {
        $(By.xpath("//a[text()='"+goToNameCar+"']")).click();
    }

    public void checkSumOffers() {
        String allSumOfferModel = getSumOffersModel.getText().replaceAll("Показать ", "").replaceAll(" предложения| предложений| предложение", "");
        Assert.assertTrue(saveValueModelAuto.equals(allSumOfferModel));
    }
}