package work27.stepsCucumber;

import io.cucumber.java.ru.Допустим;
import org.testng.Assert;
import work27.DepositPage;
import work27.HomePage;

import java.util.List;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class Work27Steps {

    HomePage homePage = new HomePage();
    DepositPage depositPage = new DepositPage();
    @Допустим("пользователь входит на сайт {string}")
    public void opensSite(String suite) {
        open(suite);
    }

    @Допустим("Проверяет название главной на соответствие {string}")
    public void pageTitleCheck(String nameTitileHome) {
        Assert.assertEquals(getWebDriver().getTitle(), nameTitileHome);
    }

    @Допустим("Переходит через верхнее меню во вклады")
    public void transitionToDeposits() {
        homePage.transitionToDeposits();
    }

    @Допустим("Проверяет название страницы на Вклады {string}")
    public void pageTitleContributionCheck(String nameTitileContribution) {
        Assert.assertEquals(getWebDriver().getTitle(), nameTitileContribution);
    }

    @Допустим("Переходит на вкладку Подобрать вклад")
    public void goTitleContribution() {
        depositPage.goTitleContribution();
    }

    @Допустим("Проверка отображение чек боксов")
    public void checkboxAvailability(List<String> checkboxies) {
        depositPage.checkboxAvailability(checkboxies);

    }

    @Допустим("Проверка что чек бокс Онлайн установлен")
    public void checkboxAvailabilityCheckboxOnline() {
        depositPage.checkboxAvailabilityCheckboxOnline();
    }

    @Допустим("Проверка что отображаются")
    public void displayTabs(List<String> tabs) {
        depositPage.displayTabs(tabs);
    }

    @Допустим("Пользователь проставляет чек бокы")
    public void settingСheckboxes(List<String> checkboxies) {
        depositPage.settingСheckboxes(checkboxies);
    }

    @Допустим("Проверка что вкладки пропали")
    public void tabsAreGone(List<String> tabs) {
        depositPage.tabsAreGone(tabs);
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