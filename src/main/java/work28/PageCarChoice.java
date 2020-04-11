package work28;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class PageCarChoice {

    SelenideElement closeBanner = $(By.xpath("//span[text()= 'Понятно, спасибо']"));

}
