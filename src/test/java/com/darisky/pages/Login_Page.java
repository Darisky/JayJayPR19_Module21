package com.darisky.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import static org.junit.jupiter.api.Assertions.assertTrue;

public class Login_Page {
    WebDriver theDriver;
    WebDriverWait wait;

    By inputUserNameField = By.id("user-name");
    By inputPasswordField = By.id("password");
    By clickLoginButton = By.id("login-button");
    By errorMessageField = By.xpath(".//*[@id=\"login_button_container\"]/div/form/div[3]");

    public Login_Page(WebDriver loginPageDriver, WebDriverWait loginWait){
        this.theDriver = loginPageDriver;
        this.wait = loginWait;
    }

    public void goToLoginPage(){
        theDriver.get("https://saucedemo.com/");
    }

    public void inputCredential(String inputUserName, String inputPassword){
        theDriver.findElement(inputUserNameField).sendKeys(inputUserName);
        theDriver.findElement(inputPasswordField).sendKeys(inputPassword);
    }

    public void clickingLoginButton(){
        theDriver.findElement(clickLoginButton).click();
    }

    public void validateErrorMessage(String errorMessage){
        assertTrue(theDriver.getPageSource().contains(errorMessage));
        String errorMessages = wait.until(ExpectedConditions.presenceOfElementLocated(errorMessageField)).getText();

        System.out.println("=======================================");
        System.out.println("Can't Login: " + errorMessages);
        System.out.println("=======================================");
    }
}
