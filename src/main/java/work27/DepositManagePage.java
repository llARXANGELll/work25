package work27;

import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.ru.Допустим;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.List;

import static com.codeborne.selenide.Selenide.$$;

public class DepositManagePage {

    List<SelenideElement> depositManagTitle = $$(By.xpath("//h2[@class='kit-heading kit-heading_l product-teaser-full-width__header']"));

    @Step("Проверка отображение на странице надписи Вклад Управляй")
    public void checkDepositManageTitle(List<String> depositManageTitle) {
        Assert.assertTrue(depositManagTitle.get(1).getText().equals(depositManageTitle.get(0)));
    }
}
