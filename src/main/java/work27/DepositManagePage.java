package work27;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import java.util.List;
import java.util.stream.Collectors;

import static com.codeborne.selenide.Selenide.$$;

public class DepositManagePage {

    List<SelenideElement> depositNameTitle = $$(By.xpath("//div[2]/div/div/h2[@class='kit-heading kit-heading_l product-teaser-full-width__header']"));

    public void checkDepositManageTitle(List<String> depositManageTitle) {
        depositManageTitle = depositManageTitle.stream().map(String::toLowerCase).collect(Collectors.toList());
        for (SelenideElement depManageTitleName : depositNameTitle) {
            if (!depositManageTitle.contains(depManageTitleName.getText().toLowerCase())) {
                throw new IllegalArgumentException("вклада с таким названием нет " + depositManageTitle);
            }
        }
    }
}
