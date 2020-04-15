# language: ru

@Test
Функционал:

  Сценарий: Домашнее задание по занятию 27
    * пользователь входит на сайт "https://www.sberbank.ru"
    * Проверяет название главной на соответствие "«Сбербанк» - Частным клиентам"
    * Переходит через верхнее меню во вклады
    * Проверяет название страницы на Вклады "«Сбербанк» - Подбор вкладов"
    * Переходит на вкладку Подобрать вклад
    * Переключает фрейм
    * Проверка отображение чек боксов
      | Хочу снимать   |
      | хочу пополнять |
      | Онлайн         |
      | Я - пенсионер  |
    * Проверка что чек бокс "Онлайн" установлен
    * Проверка что отображаются вклады
      | Вклад Сохраняй |
      | Вклад Пополняй |
      | Вклад Управляй |
    * Пользователь проставляет чек бокы
      | Хочу снимать   |
      | Хочу пополнять |
    * Проверка что вкладки пропали
      | Вклад Сохраняй |
      | Вклад Пополняй |
    * Проверка что отображается только вклад
      | Вклад Управляй |
    * Пользователь нажимает на кнопку Подроблее у вклада Управляй
    * Проверка открытия в новом окне  страница с названием "«Сбербанк» - Вклад Управляй"
    * Проверка отображение на странице надписи
      | Вклад Управляй |


  @TestTwo
  Функционал:
  Структура сценария: Домашнее задание по занятию 28
    * пользователь входит на сайт "https://auto.ru/"
    * Название страницы содержит "(Авто\.ру)(.+)"
    * Закрытие всплывающего предложения
    * Сохранение кол. объявлений отображаемых перед названием производителя "<carFirm>"
    * Переход на страницу с объявлением прозводителя автомобиля "<carFirm>"
    * Проверка отображения кнопки с текстом содержащим колличество объявлений
    * Сохранить количество объявлений марки автомобиля "<carModel>"
    * Перейти на страницу "<carModel>"
    * Отображается кнопка содержаще количество объявлений из предыдущего шага
    Примеры:
      | carFirm | carModel |
      | Chery   | Tiggo 3  |
      | MINI    | Clubman  |
      | ГАЗ     | 69       |