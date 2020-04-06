package work27;

import io.cucumber.java.ru.Допустим;

import static com.codeborne.selenide.Selenide.open;

public class HomePage {

    @Допустим("пользователь входит на сайт")
    public void opensSite() {
        open("https://www.sberbank.ru");
    }

}
