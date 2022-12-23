package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class LoginPage extends BaseHomePage {
    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void invokeBrowser() {

        String urlFromCurrentPAge = webDriver.getCurrentUrl();
        System.out.println(webDriver.getCurrentUrl());

        if (urlFromCurrentPAge.equals("https://www.facebook.com/")) {
            System.out.println("Valid_Url");
        } else {
            System.out.println("Invalid_Url");
        }
    }

    public void loginFacebook() {

        String email = "";
        String password = "";

        WebElement createAccountElement = webDriver.findElement(By.xpath("//a[text()='Create new account']"));

        if (createAccountElement.isSelected()) {
            System.out.println("There is a “Create an account” section on the page - " + createAccountElement.getText());
        }

        webDriver.findElement(By.xpath("(//button[@data-testid='cookie-policy-manage-dialog-accept-button'])[2]")).click();
        webDriver.findElement(By.id("email")).sendKeys(email);
        webDriver.findElement(By.id("pass")).sendKeys(password);
        webDriver.findElement(By.xpath("//button[text()='Log In']")).click();
        webDriver.manage().deleteAllCookies();

//        webDriver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div[4]/div/span/div/div"));
//        WebElement exitElement = webDriver.findElement(By.xpath("//span[text()='Изход']"));
//        System.out.println(exitElement.getText());
    }
}

