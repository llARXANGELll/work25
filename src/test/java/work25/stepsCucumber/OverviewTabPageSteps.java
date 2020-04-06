package work25.stepsCucumber;

import io.cucumber.java.ru.Допустим;
import work25.pages.OverviewTabPage;


public class OverviewTabPageSteps {

    OverviewTabPage overviewTabPage = new OverviewTabPage();

    @Допустим("переходит во вкладку обзор через верхнее меню")
    public void goToTheOverviewTab() {
        overviewTabPage.overviewButton();
    }

    @Допустим("проверить наличие суммы {string}")
    public void checkAmount(String mySum) {
        overviewTabPage.totalAmountOfMoney(mySum);
    }

    @Допустим("наводит курсор на сумму в блоке Финансовая свобода и проверяется появление суммы {string}")
    public void hoverOverTheAmount(String money) {
        overviewTabPage.amountFinancialFreedom(money);
    }
}
