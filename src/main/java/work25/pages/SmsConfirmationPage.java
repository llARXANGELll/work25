package work25.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.Assert;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class SmsConfirmationPage {

    private SelenideElement codeEntryField = $(By.name("otpCode"));
    private SelenideElement clickCodeButtonLogin = $(By.xpath("//button[@id='login-otp-button']"));


    @Step("Проверяет название страницы")
    public SmsConfirmationPage  pageTitleCheck() {
        Assert.assertEquals(getWebDriver().getTitle(), "Интернет банк - Банк Санкт-Петербург");
        return this;
    }

    @Step("Очищаем поле пароль и вводим новый")
    public SmsConfirmationPage smsCode (String otpCode) {
        codeEntryField.clear();
        codeEntryField.setValue(otpCode);
        return this;
    }

    @Step("Нажимаем кнопку войти")
    public SmsConfirmationPage inputButtonCodeClick () {
        clickCodeButtonLogin.click();
        return this;
    }
}