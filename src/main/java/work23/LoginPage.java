package work23;

import org.openqa.selenium.By;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class LoginPage {

    public LoginPage loginInput(String setlogin) {
        $(By.name("username")).clear();
        $(By.name("username")).sendKeys(setlogin);
        return this;

    }

    public LoginPage passwordInput(String password) {

        $(By.name("password")).clear();
        $(By.name("password")).setValue(password);
        return this;
    }

    public LoginPage loginButton() {
        $(By.id("login-button")).click();
        return this;
    }

    public LoginPage verificationTitile(String expectedTitle) {
        Assert.assertEquals(getWebDriver().getTitle(),expectedTitle);
        return this;
    }

}
