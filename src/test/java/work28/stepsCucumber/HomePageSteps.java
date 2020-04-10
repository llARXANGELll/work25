package work28.stepsCucumber;

import io.cucumber.java.ru.Допустим;
import work28.HomePageAvito;

public class HomePageSteps {

    HomePageAvito homePageAvito = new HomePageAvito();

    @Допустим("пользователь входит на сайт {string}")
    public void пользовательВходитНаСайт(String string) {
        homePageAvito.openSuite(string);
    }

    @Допустим("Название страницы содержит {string}")
    public void названиеСтраницыСодержит(String string) {
        homePageAvito.checkNamePageTitile(string);
    }
}
