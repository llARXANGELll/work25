package work25.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {

    private SelenideElement loginInput = $(By.name("username"));
    private SelenideElement passwordInput = $(By.name("password"));
    private SelenideElement buttonLogin = $(By.id("login-button"));

    public LoginPage openSuite() {
        open("https://idemo.bspb.ru/");
        return this;
    }

    public LoginPage setLogin(String login) {
        loginInput.clear();
        loginInput.sendKeys(login);
        return this;
    }

    public LoginPage setPassword(String password) {
        passwordInput.clear();
        passwordInput.sendKeys(password);
        return this;
    }

    public LoginPage clickLoginButton() {
        buttonLogin.click();
        return this;
    }
}