package ru.qa_scooter_praktikum_services.checkOrderScooter;

import main.BrowserRule;
import org.junit.Rule;
import org.junit.Test;
import ru.qa_scooter_praktikum_services.pom.MainPage;
import ru.qa_scooter_praktikum_services.pom.OrderScooterPage;

import static org.junit.Assert.assertEquals;

public class OrderScooter {
    @Rule
    public BrowserRule browserRule = new BrowserRule();

    @Test
    public void buttonUpOrderScooter(){
        MainPage mainPage = new MainPage(browserRule.getDriver());
        OrderScooterPage orderScooterPage = new OrderScooterPage(browserRule.getDriver());

        mainPage
                .openPage()
                .clickButtonUpOrder();
        orderScooterPage
                .dataOrderScooter("Петр", "Поликарпов", "Москва", "89688763435", "Двигай быстрее!")
                .clickButtonYes()
                .sendTextSuccessOrderScooter();
        assertEquals("Заказ не был успешно оформлен", orderScooterPage.getExpectedPage(), orderScooterPage.sendTextSuccessOrderScooter());
    }

    @Test
    public void buttonDownOrderScooter(){
        MainPage mainPage = new MainPage(browserRule.getDriver());
        OrderScooterPage orderScooterPage = new OrderScooterPage(browserRule.getDriver());

        mainPage
                .openPage()
                .clickButtonDownOrder();
        orderScooterPage
                .dataOrderScooter("Петр", "Поликарпов", "Москва", "89688763435", "Двигай быстрее!")
                .clickButtonYes()
                .sendTextSuccessOrderScooter();
        assertEquals("Заказ не был успешно оформлен", orderScooterPage.getExpectedPage(), orderScooterPage.sendTextSuccessOrderScooter());
    }

}

