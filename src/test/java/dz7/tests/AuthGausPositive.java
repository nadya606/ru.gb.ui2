package dz7.tests;

import dz5.BaseTest;
import dz6.pages.MainPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AuthGausPositive extends BaseTest {
        String login = "inv";
        String password = "123456";
        private static final String URL = "https://gauss-online.ru/";

    @Test
    @DisplayName("Позитивный тест - верный логин и пароль")
    void successfulAuthTest() throws InterruptedException {

        webDriver.get(URL);

        new MainPage(webDriver).clickLogin()
        .login(login,password)
        .logout()
        .checklogout();
     }

}
