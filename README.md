# Автоматизация тестирования мобильного приложения Wikipedia 
![135px-Wikipedia-logo-v2-en svg](https://user-images.githubusercontent.com/99273725/168873134-835bf0ca-8ffd-441b-9c55-3173d440b64b.png)


## :bookmark_tabs: Содержание
- [Технологический стек](https://github.com/Kashtos90/mobile-tests/blob/22hw/README.md#hammer_and_wrench-%D1%82%D0%B5%D1%85%D0%BD%D0%BE%D0%BB%D0%BE%D0%B3%D0%B8%D1%87%D0%B5%D1%81%D0%BA%D0%B8%D0%B9-%D1%81%D1%82%D0%B5%D0%BA)
- [Реализованные тесты](https://github.com/Kashtos90/mobile-tests/blob/22hw/README.md#heavy_check_mark-%D1%80%D0%B5%D0%B0%D0%BB%D0%B8%D0%B7%D0%BE%D0%B2%D0%B0%D0%BD%D0%BD%D1%8B%D0%B5-%D1%82%D0%B5%D1%81%D1%82%D1%8B)
- [Сборка в Jenkins](https://github.com/Kashtos90/mobile-tests/edit/22hw/README.md#robot-%D1%81%D0%B1%D0%BE%D1%80%D0%BA%D0%B0-%D0%B2-jenkins)
- [Запуск из терминала](https://github.com/Kashtos90/mobile-tests/edit/22hw/README.md#computer-%D0%B7%D0%B0%D0%BF%D1%83%D1%81%D0%BA-%D0%B8%D0%B7-%D1%82%D0%B5%D1%80%D0%BC%D0%B8%D0%BD%D0%B0%D0%BB%D0%B0)
- [Отчет Allure](https://github.com/Kashtos90/mobile-tests/edit/22hw/README.md#bar_chart-%D0%BE%D1%82%D1%87%D1%91%D1%82-allure)
- [Видео-пример теста](https://github.com/Kashtos90/mobile-tests/edit/22hw/README.md#film_strip-%D0%B2%D0%B8%D0%B4%D0%B5%D0%BE-%D0%BF%D1%80%D0%B8%D0%BC%D0%B5%D1%80-%D1%82%D0%B5%D1%81%D1%82%D0%B0)

## :hammer_and_wrench: Технологический стек
> Для разработки проекта использовался следующий инструментарий:
> 
<p align="center">
<img width="6%" title="IntelliJ IDEA" src="images/logo/Intelij_IDEA.svg">
<img width="6%" title="Java" src="images/logo/Java.svg">
<img width="6%" title="JUnit5" src="images/logo/JUnit5.svg">
<img width="6%" title="Selenide" src="images/logo/Selenide.svg">
<img width="6%" title="Gradle" src="images/logo/Gradle.svg">
<img width="6%" title="GitHub" src="images/logo/GitHub.svg">
<img width="6%" title="Jenkins" src="images/logo/Jenkins.svg">
<img width="6%" title="Appium" src="images/logo/appium.svg">
<img width="6%" title="Browserstack" src="images/logo/browserstack-icon.svg">
<img width="6%" title="Allure Report" src="images/logo/Allure_Report.svg">
</p>

## :heavy_check_mark: Реализованные тесты
В проекте была реализована проверка 4-ёх приветственных экранов при первом запуске мобильного приложения

## :robot: Сборка в Jenkins
Тесты написаны с учётом локального запуска через эмулятор. Поскольку к Jenkins невозможно подключить физическое устройство или эмулятор, в сборке настраивается запуск исключительно через Browserstack. Протестировать код можно [здесь](https://jenkins.autotests.cloud/job/wiki-mobile-test/). 

![jenkins](https://user-images.githubusercontent.com/99273725/169070461-8c53085f-024c-4da1-bcdd-099d1dd1692b.jpg)

## :computer: Запуск из терминала
Тесты можно запустить на Browserstack через терминал командой
```
clean  test -DdeviceHost=browserstack
```

А также через эмулятор командой
```
clean  test -DdeviceHost=emulation
```
Для каждого из стендов заданы кофигурационные параметры в файлах .properties, применение которых реализовано с помощью библиотеки Owner

## :bar_chart: Отчёт Allure
> Благодаря фреймворку Allure собирается подробная информация о прохождении тестов

![allure](https://user-images.githubusercontent.com/99273725/169073828-a6ee5cf6-d54b-404f-8a76-d8ef0696dd39.jpg)

## :film_strip: Видео-пример теста
> К каждому отчету в Allure прикрепляется видео о прохождении

![03996fd3c12ed7424b61b73f93b5b8f0dbc86598 (1)](https://user-images.githubusercontent.com/99273725/169075894-173a978f-6e68-4cd2-9dc2-0d827b24395f.gif)





