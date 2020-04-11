package work28;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class PageCarChoice {

    HomePageAvto homePageAvto = new HomePageAvto();
    SelenideElement closeBanner = $(By.xpath("//span[text()= 'Понятно, спасибо']"));

    public void checkValueCountBrand() {
        homePageAvto.saveCountBrand();
    }

}
