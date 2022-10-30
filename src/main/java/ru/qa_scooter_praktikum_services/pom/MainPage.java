package ru.qa_scooter_praktikum_services.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private WebDriver driver;
    private final String url = "https://qa-scooter.praktikum-services.ru/"; //Главная страница

    private final By buttonUpOrder = By.xpath(".//button[@class='Button_Button__ra12g']"); //Кнопка Заказать сверху страницы
    private final By buttonDownOrder = By.xpath(".//button[@class='Button_Button__ra12g Button_UltraBig__UU3Lp']"); //Кнопка заказать снизу страницы

    //Локаторы теста 1
    private final By dropdownList1 = By.id("accordion__heading-0"); //Выпадающий список с ответом на вопрос 1
    private final By textElement1 = By.id("accordion__panel-0"); //Текст вопроса 1
    private final String expectedText1 = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";

    //Локаторы теста 2
    private final By dropdownList2 = By.id("accordion__heading-1"); //Выпадающий список с ответом на вопрос 2
    private final By textElement2 = By.id("accordion__panel-1"); //Выпадающий список с ответом на вопрос 2
    private final String expectedText2 = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";

    //Локаторы теста 3
    private final By dropdownList3 = By.id("accordion__heading-2"); //Выпадающий список с ответом на вопрос 3
    private final By textElement3 = By.id("accordion__panel-2"); //Выпадающий список с ответом на вопрос 3
    private final String expectedText3 = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";

    //Локаторы теста 4
    private final By dropdownList4 = By.id("accordion__heading-3"); //Выпадающий список с ответом на вопрос 4
    private final By textElement4 = By.id("accordion__panel-3"); //Выпадающий список с ответом на вопрос 4
    private final String expectedText4 = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";

    //Локаторы теста 5
    private final By dropdownList5 = By.id("accordion__heading-4"); //Выпадающий список с ответом на вопрос 5
    private final By textElement5 = By.id("accordion__panel-4"); //Выпадающий список с ответом на вопрос 5
    private final String expectedText5 = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";

    //Локаторы теста 6
    private final By dropdownList6 = By.id("accordion__heading-5"); //Выпадающий список с ответом на вопрос 6
    private final By textElement6 = By.id("accordion__panel-5"); //Выпадающий список с ответом на вопрос 6
    private final String expectedText6 = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";

    //Локаторы теста 7
    private final By dropdownList7 = By.id("accordion__heading-6"); //Выпадающий список с ответом на вопрос 7
    private final By textElement7 = By.id("accordion__panel-6"); //Выпадающий список с ответом на вопрос 7
    private final String expectedText7 = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";

    //Локаторы теста 8
    private final By dropdownList8 = By.id("accordion__heading-7"); //Выпадающий список с ответом на вопрос 8
    private final By textElement8 = By.id("accordion__panel-7"); //Выпадающий список с ответом на вопрос 8
    private final String expectedText8 = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";


    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public MainPage clickButtonUpOrder(){
        driver.findElement(buttonUpOrder).click();
        return this;
    }
    public MainPage clickButtonDownOrder() {
        driver.findElement(buttonUpOrder).click();
        return this;
    }
    public MainPage openPage() {
        driver.get(url);
        return this;
    }
    //Методы теста 1

    public String getExpectedText1() {
        return expectedText1;
    }
    public MainPage clickdDopdownList1(){
        driver.findElement(dropdownList1).click();
        return this;
    }

    public String getTextElement1() {
        return driver.findElement(textElement1).getText();
    }

    public MainPage scrollElement1() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(dropdownList1));
        return this;
    }

    //Методы теста 2
    public String getExpectedText2() {
        return expectedText2;
    }
    public MainPage clickdDopdownList2(){
        driver.findElement(dropdownList2).click();
        return this;
    }

    public String getTextElement2() {
        return driver.findElement(textElement2).getText();
    }

    public MainPage scrollElement2() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(dropdownList2));
        return this;
    }
    //Методы теста 3
    public String getExpectedText3() {
        return expectedText3;
    }
    public MainPage clickdDopdownList3(){
        driver.findElement(dropdownList3).click();
        return this;
    }

    public String getTextElement3() {
        return driver.findElement(textElement3).getText();
    }

    public MainPage scrollElement3() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(dropdownList3));
        return this;
    }
    //Методы теста 4
    public String getExpectedText4() {
        return expectedText4;
    }
    public MainPage clickdDopdownList4(){
        driver.findElement(dropdownList4).click();
        return this;
    }

    public String getTextElement4() {
        return driver.findElement(textElement4).getText();
    }

    public MainPage scrollElement4() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(dropdownList4));
        return this;
    }
    //Методы теста 5
    public String getExpectedText5() {
        return expectedText5;
    }
    public MainPage clickdDopdownList5(){
        driver.findElement(dropdownList5).click();
        return this;
    }

    public String getTextElement5() {
        return driver.findElement(textElement5).getText();
    }

    public MainPage scrollElement5() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(dropdownList5));
        return this;
    }
    //Методы теста 6
    public String getExpectedText6() {
        return expectedText6;
    }
    public MainPage clickdDopdownList6(){
        driver.findElement(dropdownList6).click();
        return this;
    }

    public String getTextElement6() {
        return driver.findElement(textElement6).getText();
    }

    public MainPage scrollElement6() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(dropdownList6));
        return this;
    }
    //Методы теста 7
    public String getExpectedText7() {
        return expectedText7;
    }
    public MainPage clickdDopdownList7(){
        driver.findElement(dropdownList7).click();
        return this;
    }

    public String getTextElement7() {
        return driver.findElement(textElement7).getText();
    }

    public MainPage scrollElement7() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(dropdownList7));
        return this;
    }
    //Методы теста 8
    public String getExpectedText8() {
        return expectedText8;
    }
    public MainPage clickdDopdownList8(){
        driver.findElement(dropdownList8).click();
        return this;
    }

    public String getTextElement8() {
        return driver.findElement(textElement8).getText();
    }

    public MainPage scrollElement8() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(dropdownList8));
        return this;
    }
}
