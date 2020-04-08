package work25.stepsCucumber;

import io.cucumber.java.ru.Допустим;
import work25.pages.LoginPage;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();

    @Допустим("пользователь входит на сайт")
    public void opensSite() {
        loginPage.openSuite();
    }

    @Допустим("вводит логин {string}")
    public void enterlogin(String loginValue) {
        loginPage.setLogin(loginValue); // ?
    }

    @Допустим("вводит парль {string}")
    public void enterPassword(String passwordValue) {
        loginPage.setPassword(passwordValue);
    }

    @Допустим("нажимает кнопку войти на странице логина")
    public void clicksLoginButton() {
        loginPage.clickLoginButton();
    }
}
