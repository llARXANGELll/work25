package work25.pages;

import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.ru.Допустим;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {

    SelenideElement loginInput = $(By.name("username"));
    SelenideElement passwordInput = $(By.name("password"));

    @Step("Открывает сайт")
    public LoginPage openSuite() {
        open("https://idemo.bspb.ru/");
        return this;
    }

    @Step("Вводит логин")
    public LoginPage setLogin(String login) {
        loginInput.clear();
        loginInput.sendKeys(login);
        return this;
    }

    @Step("Вводит пароль")
    public LoginPage setPassword(String password) {
        passwordInput.clear();
        passwordInput.sendKeys(password);
        return this;
    }

    @Step("Нажимает кнопку Войти")
    public LoginPage buttonLogin() {
        $(By.id("login-button")).click();
        return this;
    }
}
