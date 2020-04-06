package work27;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.ru.Допустим;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.List;

import static com.codeborne.selenide.Selenide.*;

public class ContributionPage {

    SelenideElement goTitleContribution = $(By.xpath("//a[text()='Подобрать вклад']"));
    SelenideElement checkboxesCheked = $(By.cssSelector("label.kitt-checkbox-group__checkbox"));

    @Step("Переходит на вкладку Подобрать вклад")
    public void goTitleContribution() {
        goTitleContribution.click();
    }

    @Step("Проверка отображение чек боксов Хочу снять, Хочу пополнить, Онлайн и Я-пенсионер")
    public void checkboxAvailability(List<String> checkboxies) {
        switchTo().frame(0);
        List<SelenideElement> checkboxLabel = $$(By.xpath("//input[@aria-checked]"));

        Assert.assertTrue(checkboxLabel.get(2).equals("true"));


        $(By.cssSelector("dsd")).clear();
    }
}
