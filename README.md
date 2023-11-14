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

| Java                                                                                                    | IntelliJ Idea                                                                                                                | Allure                                                                                                                    | Allure TestOps                                                                                                      | GitHub                                                                                                    | JUnit 5                                                                                                           | Gradle                                                                                                   | REST Assured                                                                                                   |  Jenkins                                                                                                           | Jira                                                                                                                         |
|:--------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------:|------------------------------------------------------------------------------------------------------------------------------|
| <a href="https://www.java.com/"><img src="media/logo/Java.svg" width="50" height="50"  alt="Java"/></a> | <a id ="tech" href="https://www.jetbrains.com/idea/"><img src="media/logo/Idea.svg" width="50" height="50"  alt="IDEA"/></a> | <a href="https://github.com/allure-framework"><img src="media/logo/Allure.svg" width="50" height="50"  alt="Allure"/></a> | <a href="https://github.com/"><img src="media/logo/GitHub.svg" width="50" height="50"  alt="Github"/></a> | <a href="https://junit.org/junit5/"><img src="media/logo/Junit5.svg" width="50" height="50"  alt="JUnit 5"/></a> | <a href="https://gradle.org/"><img src="media/logo/Gradle.svg" width="50" height="50"  alt="Gradle"/></a> | <a href="https://rest-assured.io/"><img src="media/logo/RestAssured.svg" width="50" height="50"  alt="RestAssured"/></a>  |   <a href="https://www.jenkins.io/"><img src="media/logo/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a> |


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

## Параметры сборки в Jenkins:
- browser (браузер, по умолчанию chrome)
- browserVersion (версия браузера, по умолчанию 100.0)
- browserSize (размер окна браузера, по умолчанию 1920x1080)

## Команда для запуска из терминала
`gradle clean test -Denv=remote`

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

