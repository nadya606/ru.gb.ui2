package dz7.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends BasePage {

    public MainPage(WebDriver webDriver) {
        super(webDriver);
    }

    @Step("Нажать кнопку вход")
    public LoginPage clickLogin() {
        webDriver.findElement(By.linkText("Вход")).click();
        return new LoginPage(webDriver);
    }

    @Step("Нажать кнопку выход")
    public MainPage logout() {
        webDriver.findElement(By.linkText("Выход")).click();
        return new MainPage(webDriver);
    }

    @Step("Проверка авторизации")
    public MainPage checklogout() {
        new WebDriverWait(webDriver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Вход")));
        return this;
    }

    @Step("Выбор товара")
    public ProductPage chooseProduct() {
        webDriver.findElement(By.xpath("//span[@class='name']//a[text()='Лампа Gauss LED Filament ST64 E27 6W Gold 550lm 2400К 1/10/40']")).click();
        return new ProductPage(webDriver);
    }


}
