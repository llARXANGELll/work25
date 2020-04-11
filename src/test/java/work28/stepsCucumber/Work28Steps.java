package work28.stepsCucumber;

import io.cucumber.java.ru.Допустим;
import org.testng.Assert;
import work27.DepositManagePage;
import work27.DepositPage;
import work27.HomePage;

import java.util.List;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.switchTo;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class Work28Steps {









    @Допустим("Сохранить количество объявлений {string} марки автомобиля")
    public void сохранитьКоличествоОбъявленийМаркиАвтомобиля(String string) {

    }

    @Допустим("Перейти на страницу {string} из предыдущего шага")
    public void перейтиНаСтраницуИзПредыдущегоШага(String string) {

    }

    @Допустим("Отображается кнопка с {string}, содержащим количество объявлений из предыдущего шага")
    public void отображаетсяКнопкаССодержащимКоличествоОбъявленийИзПредыдущегоШага(String string) {

    }
}