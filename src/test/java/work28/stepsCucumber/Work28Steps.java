package work28.stepsCucumber;

import io.cucumber.java.ru.Допустим;
import org.testng.Assert;
import work27.DepositManagePage;
import work27.DepositPage;
import work27.HomePage;

import java.util.List;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.switchTo;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class Work28Steps {

    @Допустим("пользователь входит на сайт {string}")
    public void пользовательВходитНаСайт(String string) {

    }

    @Допустим("Название страницы содержит {string}")
    public void названиеСтраницыСодержит(String string) {

    }

    @Допустим("Сохранение кол. объявлений отображаемых перед названием производителя {string}")
    public void сохранениеКолОбъявленийОтображаемыхПередНазваниемПроизводителя(String string) {

    }

    @Допустим("Переход на страницу с объявлением прозводителя автомобиля {string}")
    public void переходНаСтраницуСОбъявлениемПрозводителяАвтомобиля(String string) {

    }

    @Допустим("ПРоверка отображения кнопки с текстом содержащим колличество объявлений из предыдущего шага")
    public void проверкаОтображенияКнопкиСТекстомСодержащимКолличествоОбъявленийИзПредыдущегоШага() {

    }

    @Допустим("Сохранить количество объявлений {string} марки автомобиля")
    public void сохранитьКоличествоОбъявленийМаркиАвтомобиля(String string) {

    }

    @Допустим("Перейти на страницу {string} из предыдущего шага")
    public void перейтиНаСтраницуИзПредыдущегоШага(String string) {

    }

    @Допустим("Отображается кнопка с {string}, содержащим количество объявлений из предыдущего шага")
    public void отображаетсяКнопкаССодержащимКоличествоОбъявленийИзПредыдущегоШага(String string) {

    }
}