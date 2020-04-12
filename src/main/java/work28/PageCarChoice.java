package work28;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class PageCarChoice {

    private HomePageAvto homePageAvto = new HomePageAvto();
    private SelenideElement getSumOffers = $(By.cssSelector(".ButtonWithLoader__content"));
    private SelenideElement getSumOffersModel = $(By.cssSelector(".ButtonWithLoader__content"));
    private String sumValueAutoAllOffers = homePageAvto.sumValueAutoAllOffers;
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
        $(By.xpath("//a[text()='"+goToNameCar+"']")).click();
    }

    public void checkSumOffers() {
        String allSumOfferModel = getSumOffersModel.getText().replaceAll("Показать ", "").replaceAll(" предложений", "");
        allSumOfferModel.equals(saveValueModelAuto);
    }
}