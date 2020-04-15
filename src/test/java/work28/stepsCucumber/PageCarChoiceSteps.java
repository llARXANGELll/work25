package work28.stepsCucumber;

import io.cucumber.java.ru.Допустим;
import work28.CarChoicePage;

public class PageCarChoiceSteps {

    CarChoicePage carChoicePage = new CarChoicePage();

    @Допустим("Проверка отображения кнопки с текстом содержащим колличество объявлений")
    public void checkValueCountBrand() {
        carChoicePage.checkValueCountBrand();
    }

    @Допустим("Сохранить количество объявлений марки автомобиля {string}")
    public void saveOffersCarModel(String carModel) {
        carChoicePage.saveOffersCarModel(carModel);
    }

    @Допустим("Перейти на страницу автомобиля марки {string}")
    public void goToPageModelAuto(String goToNameCar) {
        carChoicePage.goToPageModelAuto(goToNameCar);
    }

    @Допустим("Отображается кнопка содержаще количество объявлений из предыдущего шага")
    public void checkSumOffers() {
        carChoicePage.checkSumOffers();
    }
}