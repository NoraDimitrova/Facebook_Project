package org.example;

import org.openqa.selenium.WebDriver;

public abstract class BaseHomePage {

    WebDriver webDriver;

    public BaseHomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
}
