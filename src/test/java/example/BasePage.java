package example;

import org.testng.annotations.BeforeTest;
import static com.codeborne.selenide.Configuration.*;

public class BasePage {
    @BeforeTest
    public static void settings() {
        timeout = 10000;
        browser = "chrome";
        startMaximized = true; // на весь экран
    }
}