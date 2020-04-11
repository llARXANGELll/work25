package work28;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$;

public class PageCarChoice {

    HomePageAvto homePageAvto = new HomePageAvto();
    SelenideElement closeBanner = $(By.xpath("//span[text()= 'Понятно, спасибо']"));
    SelenideElement valueON = $(By.xpath("//span[@class='ButtonWithLoader__content']"));

    public void checkValueCountBrand(SelenideElement name) {
        closeBanner.click();
//        String asa = valueON.getText();
//        String.valueOf(valueON);
//        Assert.assertEquals(valueON, homePageAvto.saveCountBrand(name));
//        System.out.println(name);
    }
}
