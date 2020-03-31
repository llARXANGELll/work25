package work25;

import io.qameta.allure.Step;
import org.testng.annotations.Test;
import work23.LoginPage;
import work23.OverviewTabPage;
import work23.SmsConfirmationPage;

import static com.codeborne.selenide.Selenide.open;

@Test
public class Work23Test {

    OverviewTabPage overviewTabPage = new OverviewTabPage();

    @Step("Вход в систему под учетной записью demo/demo")
    public void Login() {
        open("https://idemo.bspb.ru/");
        LoginPage login = new LoginPage();
        login.verificationTitile("Интернет банк - Банк Санкт-Петербург")
                .loginInput("demo")
                .passwordInput("demo")
                .loginButton();
    }

    @Step("Ввод в поле ввода кода подвтержения и нажатие на кнопку, и нажатие на кнопку войти")
    public void SmsConfirmation() {
       SmsConfirmationPage smsConfirmationPage = new SmsConfirmationPage();
       smsConfirmationPage.otpCode("0000")
               .inputButton();
    }

    @Step("Переход через верхнее меню в раздел Обзор")
    public void OverviewTab() {
        overviewTabPage.overviewButton()
                .amountMoney();
    }

    @Step("Наведение курсора на сумму в блоке Финансовая свобода")
    public void MoveMouse() {
        overviewTabPage.myMoney();
    }
}
