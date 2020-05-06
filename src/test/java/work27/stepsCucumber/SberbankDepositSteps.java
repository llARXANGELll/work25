package work27.stepsCucumber;

import io.cucumber.java.ru.Допустим;
import org.testng.Assert;
import work27.DepositManagePage;
import work27.DepositPage;
import work27.HomeBankPage;

import java.util.List;

import static com.codeborne.selenide.Selenide.switchTo;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class SberbankDepositSteps {
    HomeBankPage homeBankPage = new HomeBankPage();
    DepositPage depositPage = new DepositPage();
    DepositManagePage depositManagePage = new DepositManagePage();

    @Допустим("Проверяет название главной на соответствие {string}")
    public void pageTitleCheck(String nameTitileHome) {
        Assert.assertEquals(getWebDriver().getTitle(), nameTitileHome);
    }

    @Допустим("Переходит через верхнее меню во вклады")
    public void transitionToDeposits() {
        homeBankPage.transitionToDeposits();
    }

    @Допустим("Проверяет название страницы на Вклады {string}")
    public void pageTitleContributionCheck(String nameTitileContribution) {
        Assert.assertEquals(getWebDriver().getTitle(), nameTitileContribution);
    }

    @Допустим("Переходит на вкладку Подобрать вклад")
    public void goTitleContribution() {
        depositPage.goTitleContribution();
    }

    @Допустим("Переключает фрейм")
    public void switchFrame() {
        depositPage.switchFrame();
    }

    @Допустим("Проверка отображение чек боксов")
    public void checkboxAvailability(List<String> checkboxies) {
        depositPage.checkboxAvailability(checkboxies);
    }

    @Допустим("Проверка что чек бокс {string} установлен")
    public void checkboxAvailabilityCheckboxOnline(String checkbox) {
        depositPage.checkboxAvailabilityCheckboxOnline(checkbox);
    }

    @Допустим("Проверка что отображаются вклады")
    public void displayTabs(List<String> tabs) {
        depositPage.displayTabs(tabs);
    }

    @Допустим("Пользователь проставляет чек бокы")
    public void settingСheckboxes(List<String> checkboxies) {
        depositPage.settingСheckboxes(checkboxies);
    }

    @Допустим("Проверка что вкладки пропали")
    public void depositAreGone(List<String> tabs) {
        depositPage.tabsAreGone(tabs);
    }

    @Допустим("Проверка что отображается только вклад")
    public void checkDepositManage(List<String> tabs) {
        depositPage.checkTabsManage(tabs);
    }

    @Допустим("Пользователь нажимает на кнопку Подроблее у вклада Управляй")
    public void clickDetailsTabsManage() {
        depositPage.clickDetailsTabsManage();
    }

    @Допустим("Проверка открытия в новом окне  страница с названием {string}")
    public void openWindowDepositManage(String getNameTitileDepositManage) {
        switchTo().window(1);
        Assert.assertEquals(getWebDriver().getTitle(), getNameTitileDepositManage);
    }

    @Допустим("Проверка отображение на странице надписи")
    public void checkDepositManageTitle(List<String> depositManageTitle) {
        depositManagePage.checkDepositManageTitle(depositManageTitle);
    }
}
