# language: ru

@Work28Regress
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