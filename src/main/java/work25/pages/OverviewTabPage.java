package work25.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.Assert;
import static com.codeborne.selenide.Selenide.$;

public class OverviewTabPage {

    SelenideElement buttonOverview = $(By.id("bank-overview"));
    SelenideElement totalMoney = $(By.xpath("//span[@class='amount']"));
    SelenideElement myMoney = $(By.className("my-assets"));

    @Step("Нажимаем на кнопку Обзор")
    public OverviewTabPage overviewButton() {
        buttonOverview.click();
        return this;
    }

    @Step("Проверяет отображаемую сумму")
    public OverviewTabPage totalAmountOfMoney(String mySum) {
        String sum = totalMoney.getText();
        Assert.assertTrue(sum.matches(mySum));
        return this;
    }

    @Step("Проверяет появляющееся сумму при наведении мышки")
    public OverviewTabPage amountFinancialFreedom (String setFormat) {
        Selenide.actions().moveToElement(myMoney).perform();
        String currentMoney = myMoney.getText();
        Assert.assertTrue(currentMoney.matches(setFormat));
        return this;
    }
}