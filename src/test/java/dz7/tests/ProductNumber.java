package dz7.tests;

import dz5.BaseTest;
import dz6.pages.ProductPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ProductNumber extends BaseTest {
    private static final String URL = "https://gauss-online.ru/gauss/2854/102802006-lampa-gauss-led-filament-st64-e27-6w-gold-550lm-2400k-1-10-40/";

    @Test
    @DisplayName("Тест отображения в корзине двух товаров одного артикля")
    void filterPriceTest() {

        webDriver.get(URL);

        new ProductPage(webDriver).sumProduct()
                .putInCart()
                .goToCart()
                .checkSumCart();
    }
}

