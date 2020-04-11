package work28.stepsCucumber;

import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.ru.Допустим;
import org.openqa.selenium.By;
import org.testng.Assert;
import work28.PageCarChoice;

import static com.codeborne.selenide.Selenide.$;

public class PageCarChoiceSteps {

    PageCarChoice pageCarChoice = new PageCarChoice();

    @Допустим("Проверка отображения кнопки с текстом содержащим колличество объявления {string}")
    public void checkValueCountBrand(String name) {
        pageCarChoice.checkValueCountBrand(name);
    }


}
