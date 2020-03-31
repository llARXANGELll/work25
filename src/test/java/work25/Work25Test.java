package work25;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class Work25Test {

    @Test
    public void work22() {

        open("https://idemo.bspb.ru");
        $(By.id("login-button")).click();
        $(By.id("login-otp-button")).click();
        $(By.id("bank-overview")).click();
        $(By.xpath("//div[2]/div/div/span/span[normalize-space(@class='amount')]")).shouldHave(text("2 718 764.83 ₽"));
        $(By.className("my-assets")).waitWhile(text("Моих средств 2 936 972.64 ₽"),50);
    }

}
