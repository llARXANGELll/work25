package work23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class OverviewTabPage {

    WebDriver webDriver;

    public OverviewTabPage overviewButton() {
        $(By.id("bank-overview")).click();
        return  this;
    }

    public OverviewTabPage amountMoney () {
        $((By.xpath("//div[2]/div/div/span/span[normalize-space(@class='amount')]"))).shouldHave(text("2 718 764.83 ₽"));
        return this;
    }

    public OverviewTabPage myMoney () {
        WebElement amount = $(By.xpath("//div[2]/div/div/span/span[normalize-space(@class='amount')]"));
        WebElement myMoney = $(By.className("my-assets"));
        new Actions(webDriver).moveToElement(amount).perform();
        new WebDriverWait(webDriver, 5).until(ExpectedConditions.visibilityOf(myMoney));
        Assert.assertEquals(myMoney.getText(), "Моих средств 2 936 972.64 ₽");
        return this;
    }

}
