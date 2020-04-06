package work27.stepsCucumber;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.ru.Допустим;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import work27.ContributionPage;
import work27.HomePage;

import java.util.List;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class Work27Steps {

    HomePage homePage = new HomePage();
    ContributionPage contributionPage = new ContributionPage();
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
        contributionPage.goTitleContribution();
    }

    @Допустим("Проверка отображение чек боксов")
    public void checkboxAvailability(List<String> checkboxies) {
        contributionPage.checkboxAvailability(checkboxies);

    }

    @Допустим("Проверка что чек бокс Онлайн установлен")
    public void checkboxAvailabilityCheckboxOnline() {
        contributionPage.checkboxAvailabilityCheckboxOnline();
    }

    @Допустим("Проверка что отображаются")
    public void displayTabs(List<String> tabs) {
        contributionPage.displayTabs(tabs);
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