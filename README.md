# JBehave_practice

## 1. [Установка](#1)
## 2. [Описание](#2)
## 3. [Зависимости](#3)
## 4. [Начало тестирования](#4)
## 5. [Просмотр результатов тестирования](#5)
## 6. [Техническая информация](#6)
## 7. [Об авторе](#7)

## 1. Установка <a id=1></a>
Перед запуском необходимо склонировать проект:
```bash
git clone git@github.com:juliana-str/jbehave_practice.git
```
```
cd jbehave_practice/
``` 
## 2. Описание <a id=2></a>
JBehave - это платформа разработки, ориентированная на поведение. 
Она призвана обеспечить интуитивно понятный и доступный способ автоматизированного приемочного тестирования.
Подобно другим фреймворкам BDD, JBehave использует следующие концепции:
Story – представляет собой автоматически выполняемое увеличение бизнес-функциональности, включает в себя один или несколько сценариев.
Scenario – представляют конкретные примеры поведения системы
Steps – представляют реальное поведение, 
используя классические ключевые слова BDD: Given, When and Then

Каждый шаг в сценарии соответствует аннотации в JBehave:

@Given: initiate the context
@When: do the action
@Then: test the expected outcome

## 3. Зависимости <a id=3></a>
Чтобы использовать JBehave в проекте maven, в pom должна быть включена зависимость jbehave-core:

<dependency>
    <groupId>org.jbehave</groupId>
    <artifactId>jbehave-core</artifactId>
    <version>4.1</version>
    <scope>test</scope>
</dependency>

## 4. Начало тестирования <a id=4></a>
Чтобы использовать JBehave, нужно выполнить следующие шаги:

Написать историю пользователя
Сопоставить шаги из истории пользователя с кодом Java
Настроить пользовательские истории
Запустить тесты JBehave
Просмотреть результаты

## 5. Просмотр результатов тестирования <a id=5></a>

Мы можем просмотреть результаты нашего тестирования в консоли. 
Если тесты прошли успешно, результат будет таким же, как и в нашей story.
```
Scenario: when a user increases a counter, its value is increased by 1
Given a counter
And the counter has any integral value
When the user increases the counter
Then the value of the counter must be 1 greater than previous value
```
В отчете будет указано  @When, когда шаг находится в ожидании, и из-за этого шаг @Then не будет выполнен.

Что делать, если наш шаг @Then завершится ошибкой? Мы можем сразу обнаружить ошибку из отчета:

```
Scenario: when a user increases a counter, its value is increased by 1
Given a counter
And the counter has any integral value
When the user increases the counter
Then the value of the counter must be 1 greater than previous value (FAILED)
(java.lang.AssertionError)
```

## 6. Техническая информация <a id=6></a>
Стек технологий: Java, Junit, JBehave, Apache Maven

## 7. Об авторе <a id=7></a>
Стрельникова Юлиана Сергеевна  
Java-разработчик (Backend)  
Россия, г. Санкт-Петербург                                                                                                                                                   
E-mail: julianka.str@yandex.ru  
Telegram: @JulianaStr