package work28.stepsCucumber;

import io.cucumber.java.ru.Допустим;
import work28.HomeAvtoRuPage;

public class HomePageSteps {

    HomeAvtoRuPage homeAvtoRuPage = new HomeAvtoRuPage();

    @Допустим("пользователь входит на сайт {string}")
    public void openSuite(String string) {
        homeAvtoRuPage.openSuite(string);
    }

    @Допустим("Название страницы содержит {string}")
    public void checkNamePageTitile(String nameTitle) {
        homeAvtoRuPage.checkNamePageTitile(nameTitle);
    }

    @Допустим("Закрытие всплывающего предложения")
    public void closeOffer() {
        homeAvtoRuPage.closeOffer();
    }

    @Допустим("Сохранение кол. объявлений отображаемых перед названием производителя {string}")
    public void saveCountBrand(String nameAutoHomePage) {
        homeAvtoRuPage.saveCountBrand(nameAutoHomePage);
    }

    @Допустим("Переход на страницу с объявлением прозводителя автомобиля {string}")
    public void goToThePageAuto(String clickNameAuto) {
        homeAvtoRuPage.goToThePageAuto(clickNameAuto);
    }
}