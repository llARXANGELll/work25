package work25.stepsCucumber;

import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;
import work23.LoginPage;
import work23.SmsConfirmationPage;

import static com.codeborne.selenide.Selenide.open;

public class GoogleSteps {


    @Дано("пользователь входит на сайт")
    public void пользователь_входит_на_сайт() {
        open("https://idemo.bspb.ru/");
        LoginPage login = new LoginPage();
        login.verificationTitile("Интернет банк - Банк Санкт-Петербург")
                .loginInput("demo")
                .passwordInput("demo")
                .loginButton();
        throw new io.cucumber.java.PendingException();
    }

    @Дано("вводит логин и пароль")
    public void вводит_логин_и_пароль() {
        SmsConfirmationPage smsConfirmationPage = new SmsConfirmationPage();
        smsConfirmationPage.otpCode("0000")
                .inputButton();
        throw new io.cucumber.java.PendingException();
    }

    @Когда("бла бла бла")
    public void бла_бла_бла() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Тогда("ололо")
    public void ололо() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
