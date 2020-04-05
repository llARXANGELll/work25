package work25.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SmsConfirmationPage {
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