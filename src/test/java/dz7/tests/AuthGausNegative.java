package dz7.tests;

import dz5.BaseTest;
import dz6.pages.LoginPage;
import dz6.pages.MainPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AuthGausNegative extends BaseTest {
    String login = "inv";
    String password = "invalid_password";
    private static final String URL = "https://gauss-online.ru/";

    @Test
    @DisplayName("Негативный тест - некорректный логин или пароль")
    void failedAuthTest() throws InterruptedException {

        webDriver.get(URL);

        new MainPage(webDriver).clickLogin()
                .login(login,password);
        new LoginPage(webDriver)
                .checkError("//font[@class='errortext']");
    }
}
