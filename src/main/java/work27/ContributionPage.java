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
    SelenideElement checkboxOnline = $(By.xpath("//input[@aria-checked='true']"));
    List<SelenideElement> checkboxLabel = $$(By.xpath("//input[@aria-checked]"));
    List<SelenideElement> tab = $$(By.className("offered-products__item"));

    @Step("Переходит на вкладку Подобрать вклад")
    public void goTitleContribution() {
        goTitleContribution.click();
    }

    @Step("Проверка отображение чек боксов Хочу снять, Хочу пополнить, Онлайн и Я-пенсионер")
    public void checkboxAvailability(List<String> checkboxies) {
        switchTo().frame(0);
    }

    @Step("Проверка что чек бокс Онлайн установлен")
    public void checkboxAvailabilityCheckboxOnline() {
        checkboxLabel.get(2).equals(checkboxOnline);
    }

    @Step("Проверка что отображаются вкладки")
    public void displayTabs(List<String> tabs) {
        tab.get(0).equals(tabs.get(0));
        tab.get(1).equals(tabs.get(1));
        tab.get(2).equals(tabs.get(2));
    }
}
