package work27;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.List;
import java.util.stream.Collectors;

import static com.codeborne.selenide.Selenide.*;

public class DepositPage {
    private SelenideElement goTitleContribution = $(By.xpath("//a[text()='Подобрать вклад']"));
    private List<SelenideElement> tabsDeposit = $$(By.cssSelector(".offered-products__header"));
    private SelenideElement depositmanageClickDetails = $(By.xpath("//a[@data-test-id='Button-white']"));
    private SelenideElement checkboxes = $(By.xpath("//div[@class='kitt-checkbox-group kitt-checkbox-group_orientation_horizontal']"));

    public void goTitleContribution() {
        goTitleContribution.click();
    }

    public void switchFrame () {
        switchTo().frame(0);
    }

    public void checkboxAvailability(List<String> checkboxTexts) {
        checkboxTexts = checkboxTexts.stream().map(String::toLowerCase).collect(Collectors.toList());
        for (SelenideElement checbox : checkboxes.$$(By.xpath("label"))) {
            if (!checkboxTexts.contains(checbox.getText().toLowerCase())) {
                throw new IllegalArgumentException("Нет чекбокса с текстом" + checbox.getText());
            }
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
    }

    public void displayTabs(List<String> nameTabs) {
        nameTabs = nameTabs.stream().map(String::toLowerCase).collect(Collectors.toList());
        for (SelenideElement tabs : tabsDeposit) {
            if (!nameTabs.contains(tabs.getText().toLowerCase())) {
                throw new IllegalArgumentException("Не найдена вкладка с названием " + tabs.getText());
            }
        }
    }

    public void settingСheckboxes(List<String> checkboxies) {
        checkboxies = checkboxies.stream().map(String::toLowerCase).collect(Collectors.toList());
        for (SelenideElement checkboxClicl : checkboxes.$$(By.xpath("label"))) {
            if (checkboxies.contains(checkboxClicl.getText().toLowerCase())) {
                checkboxClicl.click();
            }
        }
    }

    public void tabsAreGone(List<String> tabs) {
        for (SelenideElement nameTabs : tabsDeposit) {
            if (tabs.contains(nameTabs.getText())) {
                throw new IllegalArgumentException("такие вкладки есть " + nameTabs.getText());
            }
        }
    }

    public void checkTabsManage(List<String> tabs) {
        for (SelenideElement tabManageCheck : tabsDeposit) {
            if (!tabs.contains(tabManageCheck.getText())) {
                throw new IllegalArgumentException("этой вкладки нет " + tabManageCheck.getText());
            }
        }
    }

    public void clickDetailsTabsManage() {
        depositmanageClickDetails.click();
    }
}
