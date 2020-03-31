package work25.stepsCucumber;

import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.Затем;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;
import work23.LoginPage;
import work23.SmsConfirmationPage;

import static com.codeborne.selenide.Selenide.open;

public class GoogleSteps {
    @Когда("пользователь входит на сайт")
    public void пользователь_входит_на_сайт() {
        open("https://idemo.bspb.ru/");
        LoginPage login = new LoginPage();
        login.verificationTitile("Интернет банк - Банк Санкт-Петербург")
                .loginInput("demo")
                .passwordInput("demo")
                .loginButton();
    }

    @Затем("вводит логин")
    public void вводит_логин() {
        SmsConfirmationPage smsConfirmationPage = new SmsConfirmationPage();
        smsConfirmationPage.otpCode("0000")
                .inputButton();

    }

    @Затем("вводит парль")
    public void вводит_парль() {
        System.out.println("1");
    }

    @Затем("нажимает кнопку войти")
    public void нажимает_кнопку_войти() {

        System.out.println("2");
    }

    @Затем("открывается страница подтверждения")
    public void открывается_страница_подтверждения() {
        System.out.println("3");
    }
}
