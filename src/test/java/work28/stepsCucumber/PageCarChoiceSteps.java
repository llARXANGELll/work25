package work28.stepsCucumber;

import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.ru.Допустим;
import org.openqa.selenium.By;
import work28.PageCarChoice;

import static com.codeborne.selenide.Selenide.$;

public class PageCarChoiceSteps {

    PageCarChoice pageCarChoice = new PageCarChoice();

    @Допустим("Проверка отображения кнопки с текстом содержащим колличество объявлений из предыдущего шага")
    public void checkValueCountBrand() {
        pageCarChoice
    }

}
