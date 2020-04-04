package work27.stepsCucumber;

import com.codeborne.selenide.Selenide;
import io.cucumber.java.ru.Допустим;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class Work25Steps {

    @Допустим("пользователь входит на сайт")
    public void opensSite() {
        open("https://www.sberbank.ru");
    }

    @Допустим("Проверяет название страницы на соответствие {string}")
    public void pageTitleCheck(String nameTitile) {
        Assert.assertEquals(getWebDriver().getTitle(), nameTitile);
    }

    @Допустим("Переходит через верхнее меню во вклады")
    public void переходитЧерезВерхнееМенюВоВклады() {

    }

    @Допустим("Проверяет название страницы на соответствие {string}")
    public void проверяетНазваниеСтраницыНаСоответствие(String string) {

    }

    @Допустим("Переходит на вкладку Подобрать вклад")
    public void переходитНаВкладкуПодобратьВклад() {

    }

    @Допустим("Проверка отображение чек боксов Хочу снять, Хочу пополнить, Онлайн и Я-пенсионер")
    public void проверкаОтображениеЧекБоксовХочуСнятьХочуПополнитьОнлайнИЯПенсионер() {

    }

    @Допустим("ПРоверка что чек бокс Онлайн установлен")
    public void проверкаЧтоЧекБоксОнлайнУстановлен() {

    }

    @Допустим("Проверка что вкладки  Сохраняй, Пополняй и Управляй отображаются")
    public void проверкаЧтоВкладкиСохраняйПополняйИУправляйОтображаются() {

    }

    @Допустим("Пользователь проставляе чек бокы Хочу снимать и Хочу пополнять")
    public void пользовательПроставляеЧекБокыХочуСниматьИХочуПополнять() {

    }

    @Допустим("Проверка что вклады Созраняй и Пополняй исчезли")
    public void проверкаЧтоВкладыСозраняйИПополняйИсчезли() {

    }

    @Допустим("Проверка что отображается только вклад Управляй")
    public void проверкаЧтоОтображаетсяТолькоВкладУправляй() {

    }

    @Допустим("Пользователь нажимает на кнопку Подроблее у вклада Управляй")
    public void пользовательНажимаетНаКнопкуПодроблееУВкладаУправляй() {

    }

    @Допустим("Проверка открытия в новом окне  страница с названием {string}")
    public void проверкаОткрытияВНовомОкнеСтраницаСНазванием(String string) {

    }

    @Допустим("Проверка отображение на странице надписи Вклад Управляй")
    public void проверкаОтображениеНаСтраницеНадписиВкладУправляй() {

    }
}