package work25.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class SmsConfirmationPage {

    @Step("Проверяет название страницы")
    public SmsConfirmationPage  pageTitleCheck() {
        Assert.assertEquals(getWebDriver().getTitle(), "Интернет банк - Банк Санкт-Петербург");
        return this;
    }

    @Step("Очищаем поле пароль и вводим новый")
    public SmsConfirmationPage smsCode (String otpCode) {
        $(By.name("otpCode")).clear();
        $(By.name("otpCode")).setValue(otpCode);
        return this;
    }

    @Step("Нажимаем кнопку войти")
    public SmsConfirmationPage inputButtonCode () {
        $(By.xpath("//button[@id='login-otp-button']")).click();
        return this;
    }
}