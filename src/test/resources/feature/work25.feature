# language: ru

  Функционал:

  Сценарий: Домашнее задание по занятию 25
    * пользователь входит на сайт
    * вводит логин "demo"
    * вводит парль "demo"
    * нажимает кнопку войти на странице логина
    * открывается страница подтверждения
    * пользователь вводит код из смс "0000"
    * нажимает кнопку войти на странице подтверждения кода из смс
    * переходит во вкладку обзор через верхнее меню
    * проверить наличие суммы "\d{1,3}\s\d{3}\s\d{3}\.\d{2}\s\₽"
#  \d{1,3}\s\d{3}\s\d{3}\.\d{2}\s\₽
    * наводит курсор на сумму в блоке Финансовая свобода и проверяется появление суммы "[а-АЯ-я]+\s[а-АЯ-я]+\s\d{1,3}\s\d{3}\s\d{3}\.\d{2}\s\₽"