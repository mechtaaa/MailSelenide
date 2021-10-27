package example;

import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class PageMail {
    public void buttomMail(int number){
        $(By.xpath("//textarea[@class='vO']")).sendKeys("azov123azov@gmail.com");
        $(By.xpath("//input[@class='aoT']")).sendKeys("Simbirsoft theme");
        if (number < 6)
        $(By.xpath("//div[@class='Am Al editable LW-avf tS-tW']")).sendKeys(("Найдено " + number + " письма"));
        else $(By.xpath("//div[@class='Am Al editable LW-avf tS-tW']")).sendKeys(("Найдено " + number + " писем"));
        $(By.xpath("//div[contains(text(), 'Написать')]")).click();
    }
}