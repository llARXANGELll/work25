package work27;

import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.ru.Допустим;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Selenide.*;

public class ContributionPage {

    SelenideElement goTitleContribution = $(By.xpath("//a[text()='Подобрать вклад']"));
//    SelenideElement checkboxes = $(By.cssSelector("label.kitt-checkbox-group__checkbox"));

    @Step("Переходит на вкладку Подобрать вклад")
    public void goTitleContribution() {
        goTitleContribution.click();
    }

    @Step("Проверка отображение чек боксов Хочу снять, Хочу пополнить, Онлайн и Я-пенсионер")
    public void checkboxAvailability() {
        switchTo().frame(0);
        List<SelenideElement> checkboxDiv = $$(By.cssSelector("label.kitt-checkbox-group__checkbox"));

        $(By.cssSelector("dsd")).clear();
    }
}
