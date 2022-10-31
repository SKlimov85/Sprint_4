package ru.qa_scooter_praktikum_services.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
    private WebDriver driver;
    private final String url = "https://qa-scooter.praktikum-services.ru/"; //Главная страница

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public MainPage clickButton(String upperButton) {
        WebElement element = driver.findElement(By.cssSelector(upperButton));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(By.cssSelector(upperButton)).click();
        return this;
    }

    public MainPage openPage() {
        driver.get(url);
        return this;
    }

    public MainPage clickdDopdownList(String locatorHeading) {
        driver.findElement(By.id(locatorHeading)).click();
        return this;
    }

    public String getTextElement(String locatorPanel) {
        return driver.findElement(By.id(locatorPanel)).getText();
    }

    public MainPage scrollElement(String locatorHeading) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(By.id(locatorHeading)));
        return this;
    }

}
