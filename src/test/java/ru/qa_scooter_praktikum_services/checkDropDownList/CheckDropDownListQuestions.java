package ru.qa_scooter_praktikum_services.checkDropDownList;


import main.BrowserRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.qa_scooter_praktikum_services.pom.MainPage;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CheckDropDownListQuestions {

    private final String excepted;
    private final String locatorHeading;
    private final String locatorPanel;
    @Rule
    public BrowserRule browserRule = new BrowserRule();

    public CheckDropDownListQuestions(String excepted, String locatorHeading, String locatorPanel) {
        this.excepted = excepted; // Ожидаемый текст ответа на вопрос
        this.locatorHeading = locatorHeading; //Выпадающий список с ответом на вопрос
        this.locatorPanel = locatorPanel; //Текст вопроса
    }

    @Parameterized.Parameters // добавили аннотацию
    public static Object[][] getExceptedAndLocator() {
        return new Object[][]{
                {"Сутки — 400 рублей. Оплата курьеру — наличными или картой.", "accordion__heading-0", "accordion__panel-0"},
                {"Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.", "accordion__heading-1", "accordion__panel-1"},
                {"Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.", "accordion__heading-2", "accordion__panel-2"},
                {"Только начиная с завтрашнего дня. Но скоро станем расторопнее.", "accordion__heading-3", "accordion__panel-3"},
                {"Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.", "accordion__heading-4", "accordion__panel-4"},
                {"Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.", "accordion__heading-5", "accordion__panel-5"},
                {"Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.", "accordion__heading-6", "accordion__panel-6"},
                {"Да, обязательно. Всем самокатов! И Москве, и Московской области.", "accordion__heading-7", "accordion__panel-7"},
        };
    }


    @Test
    public void matchTextToDropdownList1() {
        MainPage mainPage = new MainPage(browserRule.getDriver());

        mainPage
                .openPage()
                .scrollElement(locatorHeading)
                .clickdDopdownList(locatorHeading)
                .getTextElement(locatorPanel);
        assertEquals("Поле 1 выпадающего списка ответов несоответствует", excepted, mainPage.getTextElement(locatorPanel));

    }

}
