package work27;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import javafx.scene.control.CheckBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.IFactoryAnnotation;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static com.codeborne.selenide.Selenide.*;

public class DepositPage {

    SelenideElement goTitleContribution = $(By.xpath("//a[text()='Подобрать вклад']"));
    List<SelenideElement> tabsDeposit = $$(By.cssSelector(".offered-products__header"));
    SelenideElement depositmanageClickDetails = $(By.xpath("//a[@data-test-id='Button-white']"));
    SelenideElement checkboxes = $(By.xpath("//div[@class='kitt-checkbox-group kitt-checkbox-group_orientation_horizontal']"));

    @Step("Переходит на вкладку Подобрать вклад")
    public void goTitleContribution() {
        goTitleContribution.click();
    }

    public void checkboxAvailability(List<String> checkboxTexts) {
        switchTo().frame(0);
        checkboxes = checkboxTexts.stream().map(String::toLowerCase).collect(Collectors.toList());
        for (SelenideElement checbox : checkboxes) {
            if (!checkboxTexts.contains(checbox.getText().toLowerCase())) {

            }
        }
        checkboxTexts = checkboxTexts.stream().map(String::toLowerCase).collect(Collectors.toList());
//        for (int i = 0; i < checkboxTexts.size(); i++) {
//            checkboxTexts.set(i, checkboxTexts.get(i).toLowerCase());
//        }
//        new CheckBox();
//        for (SelenideElement checkbox : checkboxes.$$(By.xpath("label"))) {
//                if (!checkboxTexts.contains(checkbox.getText().toLowerCase())) {
//                    throw new IllegalArgumentException("Нет чексбокса с текстом " + checkbox.getText());
//                }
        }
    }

    public void checkboxAvailabilityCheckboxOnline(String checkboxText) {
        boolean checkboxFound = false;
        for (SelenideElement checkbox : checkboxes.$$(By.xpath("label"))) {
            if (checkbox.getText().toLowerCase().equals(checkboxText.toLowerCase())) {
                checkboxFound = true;
                Assert.assertEquals(checkbox.$("input").getAttribute("aria-checked"), "true", "Ожидаемый чексбокс отключен!");
            }
        }
        if (!checkboxFound) {
            throw new IllegalArgumentException("Не найден искомый чексбокс по тексту!");
        }
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