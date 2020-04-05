package work25.pages;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class OverviewTabPage {

    @Step("Нажимаем на кнопку Обзор")
    public OverviewTabPage overviewButton() {
        $(By.id("bank-overview")).click();
        return  this;
    }

    @Step("Проверяет отображаемую сумму")
    public OverviewTabPage amountMoney () {
        $(By.xpath("//span[@class='amount']")).shouldHave(text("2 718 764.83 ₽"));
        return this;
    }

    @Step("Проверяет появляющееся сумму при наведении мышки")
    public OverviewTabPage myMoney () {
        WebElement myMoney = $(By.className("my-assets"));
        Selenide.actions().moveToElement(myMoney).perform();
        Assert.assertEquals(myMoney.getText(), "Моих средств 2 936 972.64 ₽");
        return this;
    }
}
