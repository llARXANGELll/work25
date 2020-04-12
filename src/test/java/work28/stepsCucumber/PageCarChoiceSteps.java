package work28.stepsCucumber;

import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.ru.Допустим;
import org.openqa.selenium.By;
import org.testng.Assert;
import work28.PageCarChoice;

import static com.codeborne.selenide.Selenide.$;

public class PageCarChoiceSteps {

    PageCarChoice pageCarChoice = new PageCarChoice();

    @Допустим("Проверка отображения кнопки с текстом содержащим колличество объявлений")
    public void checkValueCountBrand() {
        pageCarChoice.checkValueCountBrand();
    }

    @Допустим("Сохранить количество объявлений {string} марки автомобиля")
    public void saveOffersCarModel(String carModel) {
        pageCarChoice.saveOffersCarModel(carModel);
    }

    @Допустим("Перейти на страницу {string}")
    public void goToPageModelAuto(String goToNameCar) {
        pageCarChoice.goToPageModelAuto(goToNameCar);
    }

    @Допустим("Отображается кнопка содержаще количество объявлений из предыдущего шага")
    public void checkSumOffers() {
        pageCarChoice.checkSumOffers();
    }
}
