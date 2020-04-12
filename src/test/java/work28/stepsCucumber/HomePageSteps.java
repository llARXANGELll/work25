package work28.stepsCucumber;

import io.cucumber.java.ru.Допустим;
import work28.HomePage;

public class HomePageSteps {

    HomePage homePage = new HomePage();

    @Допустим("пользователь входит на сайт {string}")
    public void openSuite(String string) {
        homePage.openSuite(string);
    }

    @Допустим("Название страницы содержит {string}")
    public void checkNamePageTitile(String nameTitle) {
        homePage.checkNamePageTitile(nameTitle);
    }

    @Допустим("Сохранение кол. объявлений отображаемых перед названием производителя {string}")
    public void saveCountBrand(String nameAutoHomePage) {
        homePage.saveCountBrand(nameAutoHomePage);
    }

    @Допустим("Переход на страницу с объявлением прозводителя автомобиля {string}")
    public void goToThePageAuto(String clickNameAuto) {
        homePage.goToThePageAuto(clickNameAuto);
    }
}