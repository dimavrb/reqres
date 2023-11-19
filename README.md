<h1 >Демопроект автоматизации тестирования API на <a href="https://reqres.in/">reqres.in</a></h1>

## :page_with_curl: Содержание 

* <a href="#tools">Технологии и инструменты</a>

* <a href="#cases">Реализованные проверки</a>

* <a href="#console">Запуск тестов из терминала</a>

* <a href="#jenkins">Запуск тестов в Jenkins</a>

* <a href="#telegram">Уведомления в Telegram</a>

* <a href="#allure">Allure Report отчеты</a>

<a id="tools"></a>
## Технологии и инструменты

| Java  | IDEA | Github | JUnit 5 | Gradle | RestAssured | Allure | Jenkins |
| ----- | ---- | ------ | ------- | ------ | -------- | ------ | ------- |
|[![](https://github.com/dimavrb/tochka/blob/main/media/logo/Java.svg)](java.com) | ![](https://github.com/dimavrb/tochka/blob/main/media/logo/Idea.svg) | ![](https://github.com/dimavrb/tochka/blob/main/media/logo/GitHub.svg) | ![](https://github.com/dimavrb/tochka/blob/main/media/logo/Junit5.svg)  | ![](https://github.com/dimavrb/tochka/blob/main/media/logo/Gradle.svg)  | ![](https://github.com/dimavrb/reqres/blob/main/media/logo/RestAssured.svg)  | ![](https://github.com/dimavrb/tochka/blob/main/media/logo/Allure.svg) | ![](https://github.com/dimavrb/tochka/blob/main/media/logo/Jenkins.svg)  |

<a id="cases"></a>
## :heavy_check_mark: Реализованные проверки

-  Успешная/неуспешная авторизация пользователя 
-  Успешная/неуспешная регистрация пользователя
-  Получение данных пользователя по id
-  Удаление пользователя по id

<a id="console"></a>
##  Запуск тестов из терминала
### Локальный запуск тестов

```
gradle clean test  
```
<a id="jenkins"></a>
## Сборка в Jenkins

![](https://github.com/dimavrb/tochka/blob/main/media/screenshots/Jenkins.png)

## Команда для запуска из терминала
`gradle clean test`

<a id="allure"></a>
## Allure Report 

### Главная страница отчета
![](https://github.com/dimavrb/reqres/blob/main/media/screenshots/AllureMainPage.png)

### Страница с тест-кейсами

![](https://github.com/dimavrb/reqres/blob/main/media/screenshots/ChecksList.png)

### Информация о кейсах

![](https://github.com/dimavrb/reqres/blob/main/media/screenshots/InfoAboutCase.png)


<a id="telegram"></a>
## Уведомление в Telegram

![](https://github.com/dimavrb/reqres/blob/main/media/screenshots/Telegram.png)

