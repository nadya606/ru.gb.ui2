package dz6.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected WebDriver webDriver;

     public BasePage(WebDriver webDriver) {
        this.webDriver = webDriver;
         PageFactory.initElements(webDriver,this);
    }


}