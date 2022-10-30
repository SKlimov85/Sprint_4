package ru.qa_scooter_praktikum_services.checkDropDownList;


import main.BrowserRule;
import org.junit.Rule;
import org.junit.Test;
import ru.qa_scooter_praktikum_services.pom.MainPage;

import static org.junit.Assert.assertEquals;

public class CheckDropDownListQuestions {

    @Rule
    public BrowserRule browserRule = new BrowserRule();


    @Test
    public void matchTextToDropdownList1() {
        MainPage mainPage = new MainPage(browserRule.getDriver());

        mainPage
                .openPage()
                .scrollElement1()
                .clickdDopdownList1()
                .getTextElement1();
        assertEquals("Поле 1 выпадающего списка ответов несоответствует", mainPage.getExpectedText1(), mainPage.getTextElement1());

    }

    @Test
    public void matchTextToDropdownList2() {
        MainPage mainPage = new MainPage(browserRule.getDriver());

        mainPage
                .openPage()
                .scrollElement2()
                .clickdDopdownList2()
                .getTextElement2();
        assertEquals("Поле 2 выпадающего списка ответов несоответствует", mainPage.getExpectedText2(), mainPage.getTextElement2());

    }

    @Test
    public void matchTextToDropdownList3() {
        MainPage mainPage = new MainPage(browserRule.getDriver());

        mainPage
                .openPage()
                .scrollElement3()
                .clickdDopdownList3()
                .getTextElement3();
        assertEquals("Поле 3 выпадающего списка ответов несоответствует", mainPage.getExpectedText3(), mainPage.getTextElement3());

    }

    @Test
    public void matchTextToDropdownList4() {
        MainPage mainPage = new MainPage(browserRule.getDriver());

        mainPage
                .openPage()
                .scrollElement4()
                .clickdDopdownList4()
                .getTextElement4();
        assertEquals("Поле 4 выпадающего списка ответов несоответствует", mainPage.getExpectedText4(), mainPage.getTextElement4());

    }

    @Test
    public void matchTextToDropdownList5() {
        MainPage mainPage = new MainPage(browserRule.getDriver());

        mainPage
                .openPage()
                .scrollElement5()
                .clickdDopdownList5()
                .getTextElement5();
        assertEquals("Поле 5 выпадающего списка ответов несоответствует", mainPage.getExpectedText5(), mainPage.getTextElement5());

    }

    @Test
    public void matchTextToDropdownList6() {
        MainPage mainPage = new MainPage(browserRule.getDriver());

        mainPage
                .openPage()
                .scrollElement6()
                .clickdDopdownList6()
                .getTextElement6();
        assertEquals("Поле 6 выпадающего списка ответов несоответствует", mainPage.getExpectedText6(), mainPage.getTextElement6());

    }

    @Test
    public void matchTextToDropdownList7() {
        MainPage mainPage = new MainPage(browserRule.getDriver());

        mainPage
                .openPage()
                .scrollElement7()
                .clickdDopdownList7()
                .getTextElement7();
        assertEquals("Поле 7 выпадающего списка ответов несоответствует", mainPage.getExpectedText7(), mainPage.getTextElement7());

    }

    @Test
    public void matchTextToDropdownList8() {
        MainPage mainPage = new MainPage(browserRule.getDriver());

        mainPage
                .openPage()
                .scrollElement8()
                .clickdDopdownList8()
                .getTextElement8();
        assertEquals("Поле 8 выпадающего списка ответов несоответствует", mainPage.getExpectedText8(), mainPage.getTextElement8());
    }

}
