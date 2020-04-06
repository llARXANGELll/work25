package work25.stepsCucumber;

import io.cucumber.java.ru.Допустим;
import work25.pages.SmsConfirmationPage;

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
        smsConfirmationPage.inputButtonCodeClick();
    }
}
