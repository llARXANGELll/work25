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
        open("https://idemo.bspb.ru/");
    }

    @Допустим("вводит логин {string}")
    public void enterlogin(String loginValue) {
        $(By.name("username")).clear();
        $(By.name("username")).sendKeys(loginValue);
    }

    @Допустим("вводит парль {string}")
    public void enterPassword(String passwordValue) {
        $(By.name("password")).clear();
        $(By.name("password")).setValue(passwordValue);
    }

    @Допустим("нажимает кнопку войти на странице логина")
    public void clicksLoginButton() {
        $(By.id("login-button")).click();
    }

    @Допустим("открывается страница подтверждения")
    public void pageTitleCheck() {
        Assert.assertEquals(getWebDriver().getTitle(), "Интернет банк - Банк Санкт-Петербург");
    }

    @Допустим("пользователь вводит код из смс {string}")
    public void smsCodeInput(String code) {
        $(By.name("otpCode")).clear();
        $(By.name("otpCode")).setValue(code);
    }

    @Допустим("нажимает кнопку войти на странице подтверждения кода из смс")
    public void clicksButtonAfterEnteringSms() {
        $(By.xpath("//button[@id='login-otp-button']")).click();
    }

    @Допустим("переходит во вкладку обзор через верхнее меню")
    public void goToTheOverviewTab() {
        $(By.id("bank-overview")).click();
    }

    @Допустим("проверить наличие суммы {string}")
    public void checkAmount(String mySumm) {
        $(By.xpath("//span[@class='amount']")).shouldHave(text(mySumm));
    }
    
    @Допустим("наводит курсор на сумму в блоке Финансовая свобода и проверяется появление суммы {string}")
    public void hoverOverTheAmount(String money) {
        WebElement myMoney = $(By.className("my-assets"));
        Selenide.actions().moveToElement(myMoney).perform();
        Assert.assertEquals(myMoney.getText(), money);
    }
}