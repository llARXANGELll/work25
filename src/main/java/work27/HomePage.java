package work27;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.ru.Допустим;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;


public class HomePage {

    SelenideElement contriburions = $(By.xpath("//span[text()='Вклады']"));
    SelenideElement transitionToDeposits = $(By.xpath("//li[@class='lg-menu__sub-item']/a[text()='Вклады']"));



    @Step("Переходит через верхнее меню во вклады")
    public void transitionToDeposits() {
        Selenide.actions().moveToElement(contriburions).perform();
        transitionToDeposits.click();
    }
}
