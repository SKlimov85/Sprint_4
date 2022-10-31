package ru.qa_scooter_praktikum_services.checkOrderScooter;

import main.BrowserRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.qa_scooter_praktikum_services.pom.MainPage;
import ru.qa_scooter_praktikum_services.pom.OrderScooterPage;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class OrderScooter {
    private final String button;
    @Rule
    public BrowserRule browserRule = new BrowserRule();


    public OrderScooter(String button) {
        this.button = button;
    }

    @Parameterized.Parameters
    public static Object[][] getButton() {
        return new Object[][]{{".Header_Nav__AGCXC .Button_Button__ra12g"},  //Верхняя кнопка Заказаьб
                {".Home_FinishButton__1_cWm .Button_Button__ra12g"},    //Нижняя кнопка заказать
        };
    }

    @Test
    public void buttonUpOrderScooter() {
        MainPage mainPage = new MainPage(browserRule.getDriver());
        OrderScooterPage orderScooterPage = new OrderScooterPage(browserRule.getDriver());

        mainPage.openPage().clickButton(button);
        orderScooterPage.dataOrderScooter("Петр", "Поликарпов", "Москва", "89688763435", "Двигай быстрее!").clickButtonYes().sendTextSuccessOrderScooter();
        assertEquals("Заказ не был успешно оформлен", orderScooterPage.getExpectedPage(), orderScooterPage.sendTextSuccessOrderScooter());
    }

}

