package com.darisky.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Home_Page {
    private WebDriver theDriver;
    String homePageURL = "https://www.saucedemo.com/inventory.html";
    By productContainer = By.cssSelector("#inventory_container");

    public Home_Page(WebDriver homePageDriver) {
        this.theDriver = homePageDriver;
    }

    public void atTheHomePage() {
        String sawURL = theDriver.getCurrentUrl();
        assertEquals(homePageURL, sawURL);
    }

    public void checkProductElement() {
        WebElement validateProduct = theDriver.findElement(productContainer);
        assertTrue(validateProduct.isDisplayed());
    }
}
