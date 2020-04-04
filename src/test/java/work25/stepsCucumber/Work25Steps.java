package work25.stepsCucumber;

import com.codeborne.selenide.Selenide;
import io.cucumber.java.ru.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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

    @Допустим("вводит логин")
    public void вводитЛогин() {
        $(By.name("username")).clear();
        $(By.name("username")).sendKeys("demo");
    }

    @Допустим("вводит парль")
    public void вводитПарль() {
        $(By.name("password")).clear();
        $(By.name("password")).setValue("demo");
    }

    @Допустим("нажимает кнопку войти на странице логина")
    public void нажимаетКнопкуВойтиНаСтраницеЛогина() {
        $(By.id("login-button")).click();
    }

    @Допустим("открывается страница подтверждения")
    public void открываетсяСтраницаПодтверждения() {
        Assert.assertEquals(getWebDriver().getTitle(), "Интернет банк - Банк Санкт-Петербург");
    }

    @Допустим("пользователь вводит код из смс")
    public void пользовательВводитКодИзСмс() {
        $(By.name("otpCode")).clear();
        $(By.name("otpCode")).setValue("0000");
    }

    @Допустим("нажимает кнопку войти на странице подтверждения кода из смс")
    public void нажимаетКнопкуВойтиНаСтраницеПодтвержденияКодаИзСмс() {
        $(By.xpath("//button[@id='login-otp-button']")).click();
    }

    @Допустим("переходит во вкладку обзор через верхнее меню")
    public void переходитВоВкладкуЧерезВерхнееМеню() {
        $(By.id("bank-overview")).click();
    }

    @Допустим("проверить наличие суммы {string}")
    public void проверяетЧтоСуммаВБлокеФинансоваяСвободаОтображаетсяВФормате(String mySumm) {
        $((By.xpath("//span[@class='amount']"))).shouldHave(text(mySumm));
    }


    @Допустим("наводит курсор на сумму в блоке Финансовая свобода и проверяется появление суммы")
    public void наводитКурсорНаСуммуВБлокеФинансоваяСвободаИПроверяетсяПоявлениеСуммы() {
        WebElement myMoney = $(By.className("my-assets"));
        Selenide.actions().moveToElement(myMoney).perform();
        Assert.assertEquals(myMoney.getText(), "Моих средств 2 936 972.64 ₽");
    }
}