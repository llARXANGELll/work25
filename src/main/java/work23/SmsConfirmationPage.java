package work23;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SmsConfirmationPage {

    public SmsConfirmationPage otpCode (String otpCode) {
        $(By.name("otp-code")).clear();
        $(By.name("otp-code")).setValue(otpCode);
        return this;
    }

    public SmsConfirmationPage inputButton () {
        $(By.id("login-otp-button")).click();
        return this;
    }
}