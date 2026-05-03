package com.darisky.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Login_Page {
    WebDriver theDriver;

    By inputUserNameField = By.id("user-name");
    By inputPasswordField = By.id("password");
    By clickLoginButton = By.id("login-button");

    public Login_Page(WebDriver loginPageDriver){
        this.theDriver = loginPageDriver;
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
    }
}
