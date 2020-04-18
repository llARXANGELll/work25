package work28.stepsCucumber;

import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.ru.Допустим;
import org.openqa.selenium.By;
import work28.HomeAvtoRuPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

public class HomePageSteps {

    HomeAvtoRuPage homeAvtoRuPage = new HomeAvtoRuPage();

    @Допустим("пользователь входит на сайт {string}")
    public void openSuite(String string) {
        homeAvtoRuPage.openSuite(string);
        switchTo().frame(0);
        clickSlider(50);
        System.out.println("`");
    }
    private void clickSlider(int percent) {
        if (percent < 0 || percent > 100) {
            throw new IllegalArgumentException("Percent must be in range [0:100]!");
        }

        SelenideElement slider = $(By.className("kitt-slide-picker"));
        int width = slider.getSize().width;
        int direction = 1;

        if (percent < 50) {
            direction = -1;
            percent = 50 - percent;
        } else {
            percent -= 50;
        }

        int pixel = direction * width * percent / 100;
        slider.click(pixel, 0);
    }

    @Допустим("Название страницы содержит {string}")
    public void checkNamePageTitile(String nameTitle) {
        homeAvtoRuPage.checkNamePageTitile(nameTitle);
    }

    @Допустим("Закрытие всплывающего предложения")
    public void closeOffer() {
        homeAvtoRuPage.closeOffer();
    }

    @Допустим("Сохранение кол. объявлений отображаемых перед названием производителя {string}")
    public void saveCountBrand(String nameAutoHomePage) {
        homeAvtoRuPage.saveCountBrand(nameAutoHomePage);
    }

    @Допустим("Переход на страницу с объявлением прозводителя автомобиля {string}")
    public void goToThePageAuto(String clickNameAuto) {
        homeAvtoRuPage.goToThePageAuto(clickNameAuto);
    }
}