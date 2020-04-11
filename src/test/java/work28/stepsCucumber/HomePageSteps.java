package work28.stepsCucumber;

import io.cucumber.java.ru.Допустим;
import work28.HomePageAvito;

public class HomePageSteps {

    HomePageAvito homePageAvito = new HomePageAvito();

    @Допустим("пользователь входит на сайт {string}")
    public void openSuite(String string) {
        homePageAvito.openSuite(string);
    }

    @Допустим("Название страницы содержит {string}")
    public void checkNamePageTitile(String nameTitle) {
        homePageAvito.checkNamePageTitile(nameTitle);
    }

    @Допустим("Сохранение кол. объявлений отображаемых перед названием производителя {string}")
    public void saveCountBrand(String nameAutoHomePage) {
        homePageAvito.saveCountBrand(nameAutoHomePage);
    }

    @Допустим("Переход на страницу с объявлением прозводителя автомобиля {string}")
    public void goToThePageAuto(String clickNameAuto) {
        homePageAvito.goToThePageAuto(clickNameAuto);
    }
}
