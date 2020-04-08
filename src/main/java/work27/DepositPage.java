package work27;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.Assert;
import java.util.List;
import static com.codeborne.selenide.Selenide.*;

public class DepositPage {

    SelenideElement goTitleContribution = $(By.xpath("//a[text()='Подобрать вклад']"));
    SelenideElement checkboxOnline = $(By.xpath("//input[@aria-checked='true']"));
    List<SelenideElement> checkboxLabel = $$(By.xpath("//input[@aria-checked]"));
    List<SelenideElement> tabsDeposit = $$(By.cssSelector(".offered-products__header"));
    SelenideElement depositmanageClickDetails = $(By.xpath("//a[@data-test-id='Button-white']"));
    List<SelenideElement> getCheckboxText = $$(By.cssSelector(".kitt-checkbox__text"));


    @Step("Переходит на вкладку Подобрать вклад")
    public void goTitleContribution() {
        goTitleContribution.click();
    }

    @Step("Проверка отображение чек боксов Хочу снять, Хочу пополнить, Онлайн и Я-пенсионер")
    public void checkboxAvailability(List<String> checkboxies) {
        switchTo().frame(0);
        Assert.assertTrue(getCheckboxText.get(0).getText().equals(checkboxies.get(0)));
        Assert.assertTrue(getCheckboxText.get(1).getText().equals(checkboxies.get(1)));
        Assert.assertTrue(getCheckboxText.get(2).getText().equals(checkboxies.get(2)));
        Assert.assertTrue(getCheckboxText.get(3).getText().equals(checkboxies.get(3)));
    }

    @Step("Проверка что чек бокс Онлайн установлен")
    public void checkboxAvailabilityCheckboxOnline() {
        Assert.assertTrue(checkboxLabel.get(2).equals(checkboxOnline));
    }

    @Step("Проверка что отображаются вкладки")
    public void displayTabs(List<String> tabs) {
        Assert.assertTrue(tabsDeposit.get(0).getText().equals(tabs.get(0)));
        Assert.assertTrue(tabsDeposit.get(1).getText().equals(tabs.get(1)));
        Assert.assertTrue(tabsDeposit.get(2).getText().equals(tabs.get(2)));
    }

    @Step("Пользователь проставляе чек бокы Хочу снимать и Хочу пополнять")
    public void settingСheckboxes(List<String> checkboxies) {
        checkboxLabel.get(0).click();
        checkboxLabel.get(1).click();
    }

    @Step("Проверка что вклад Сохраняй и Пополняй пропал ")
    public void tabsAreGone(List<String> tabs) {
        Assert.assertFalse(tabsDeposit.get(0).getText().equals(tabs.get(0)));
        Assert.assertFalse(tabsDeposit.get(0).getText().equals(tabs.get(1)));

    }

    @Step("Проверка что отображается только вклад Управляй")
    public void checkTabsManage(List<String> tabs) {
        Assert.assertTrue(tabsDeposit.get(0).getText().equals(tabs.get(0)));
    }

    @Step("Пользователь нажимает на кнопку Подроблее у вклада Управляй")
    public void clickDetailsTabsManage() {
        depositmanageClickDetails.click();
    }
}