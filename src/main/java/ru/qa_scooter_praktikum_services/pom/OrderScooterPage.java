package ru.qa_scooter_praktikum_services.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OrderScooterPage {

    private WebDriver driver;

    public String getExpectedPage() {
        return expectedPage;
    }

    private final String expectedPage = "Заказ оформлен";
    private By name = By.xpath(".//input[@placeholder='* Имя']"); //Поле Имя
    private By surname = By.xpath(".//input[@placeholder='* Фамилия']"); //Поле Фамилия
    private By address = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']"); //Поле Адресс
    private By metroStation = By.xpath(".//input[@placeholder='* Станция метро']"); //Поле ввода Станция метро
    private By metroValue = By.xpath(".//li[@data-index='2']"); // Выбор значения в выпадающем списке станций
    private By telephone = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']"); //Поле Телефон
    private By next = By.cssSelector(".Button_Button__ra12g.Button_Middle__1CSJM"); //Кнопка Далее
    private By date = By.xpath(".//input[@placeholder='* Когда привезти самокат']"); //Поле "Когда привезти самокат"
    private By choiceDate = By.xpath(".//div[@class='react-datepicker__week']/div[@aria-label='Choose вторник, 1-е ноября 2022 г.']"); //Значение выбора даты
    private By rentalPeriod = By.className("Dropdown-control"); //Поле Срок аренды
    private By daySelection = By.xpath(".//div[@class='Dropdown-menu']/div[3]"); //Выбод дней аренды
    private By scooterBlack = By.id("black"); //Чекбокс выбора цвета - чёрный
    private By comment = By.cssSelector(".Input_InputContainer__3NykH .Input_Responsible__1jDKN"); //Поле Комментарии
    private By rent = By.xpath(".//div[@class='Order_Buttons__1xGrp']/button[2]"); //Кнокпка Заказать
    private By approve = By.xpath(".//div[@class='Order_Modal__YZ-d3']/div[2]/button[2]"); //Кнопка "Да" в сплывающем окне заказа
    private By success = By.className("Order_ModalHeader__3FDaJ"); //Надпись Успешного заказа

    public OrderScooterPage(WebDriver driver) {
        this.driver = driver;
    }

    public OrderScooterPage dataOrderScooter(String valueName, String valueSurname, String valueAddress, String valueTelephone, String valueСomment) {
        driver.findElement(name).sendKeys(valueName);
        driver.findElement(surname).sendKeys(valueSurname);
        driver.findElement(address).sendKeys(valueAddress);
        driver.findElement(metroStation).click();
        driver.findElement(metroValue).click();
        driver.findElement(telephone).sendKeys(valueTelephone);
        driver.findElement(next).click();
        driver.findElement(date).click();
        driver.findElement(choiceDate).click();
        driver.findElement(rentalPeriod).click();
        driver.findElement(daySelection).click();
        driver.findElement(scooterBlack).click();
        driver.findElement(comment).sendKeys(valueСomment);
        driver.findElement(rent).click();
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(driver -> driver.findElement(approve)).click();
        return this;
    }

    public OrderScooterPage clickButtonYes() {
        driver.findElement(approve).click();
        return this;
    }


    public String sendTextSuccessOrderScooter() {
        return driver.findElement(success).getText();
    }
}
