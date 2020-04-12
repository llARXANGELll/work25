package work28.stepsCucumber;

import io.cucumber.java.ru.Допустим;
import work28.HomePageAvto;

public class HomePageSteps {

    HomePageAvto homePageAvto = new HomePageAvto();

    @Допустим("пользователь входит на сайт {string}")
    public void openSuite(String string) {
        homePageAvto.openSuite(string);
    }

    @Допустим("Название страницы содержит {string}")
    public void checkNamePageTitile(String nameTitle) {
        homePageAvto.checkNamePageTitile(nameTitle);
    }

    @Допустим("Сохранение кол. объявлений отображаемых перед названием производителя {string}")
    public void saveCountBrand(String nameAutoHomePage) {
        homePageAvto.saveCountBrand(nameAutoHomePage);
    }

    @Допустим("Переход на страницу с объявлением прозводителя автомобиля {string}")
    public void goToThePageAuto(String clickNameAuto) {
        homePageAvto.goToThePageAuto(clickNameAuto);
    }
}