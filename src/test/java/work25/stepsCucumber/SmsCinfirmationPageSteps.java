package work25.stepsCucumber;

import io.cucumber.java.ru.Допустим;
import org.openqa.selenium.By;
import org.testng.Assert;
import work25.pages.SmsConfirmationPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class SmsCinfirmationPageSteps {

    SmsConfirmationPage smsConfirmationPage = new SmsConfirmationPage();

    @Допустим("открывается страница подтверждения")
    public void pageTitleCheck() {
        smsConfirmationPage.pageTitleCheck();
    }

    @Допустим("пользователь вводит код из смс {string}")
    public void smsCodeInput(String code) {
        smsConfirmationPage.smsCode(code);
    }

    @Допустим("нажимает кнопку войти на странице подтверждения кода из смс")
    public void clicksButtonAfterEnteringSms() {
        smsConfirmationPage.inputButtonCode();
    }
}
