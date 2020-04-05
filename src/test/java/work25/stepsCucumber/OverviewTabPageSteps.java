package work25.stepsCucumber;

import com.codeborne.selenide.Selenide;
import io.cucumber.java.ru.Допустим;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import work25.pages.OverviewTabPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class OverviewTabPageSteps {

    OverviewTabPage overviewTabPage = new OverviewTabPage();

    @Допустим("переходит во вкладку обзор через верхнее меню")
    public void goToTheOverviewTab() {
        overviewTabPage.overviewButton();
    }

    @Допустим("проверить наличие суммы {string}")
    public void checkAmount(String mySum) {
        overviewTabPage.amountMoney(mySum);
    }

    @Допустим("наводит курсор на сумму в блоке Финансовая свобода и проверяется появление суммы {string}")
    public void hoverOverTheAmount(String money) {
        overviewTabPage.myMoney(money);
    }

}
