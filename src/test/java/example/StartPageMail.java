package example;

import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;

public class StartPageMail {
    public void buttom(){
//элементы нажимающие на кнопки
        $(By.xpath("//a[contains(text(), 'Войти')]")).click();
        $(By.xpath("//input[@type='email']")).sendKeys("azov123azov@gmail.com");
        $(By.xpath("//span[@jsname='V67aGc']")).click();
        $(By.xpath("//input[@name='password']")).sendKeys("azov123321azov");
        $(By.xpath("//span[contains(text(), 'Далее')]")).click();
        $(By.xpath("//a[@class='gb_f']")).click();
        $(By.xpath("//div[contains(text(), 'Написать')]")).click();
    }
    public int getNumber(){
        int number = elements(By.xpath("//span[contains(text(), 'Simbirsoft theme')]")).size();
        return number;
    }
}