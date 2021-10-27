package example;

import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class TestMail extends BasePage {
    StartPageMail startPageMail = new StartPageMail();
    PageMail pageMail = new PageMail();

    @Step("Проверка на колличество писем")
    @Test
    public void openTest(){
        open("https://www.google.com/");
        startPageMail.buttom();
        int getNumberTwo = startPageMail.getNumber();
        pageMail.buttomMail(startPageMail.getNumber());
        Assert.assertTrue(startPageMail.getNumber() > getNumberTwo);
    }
}