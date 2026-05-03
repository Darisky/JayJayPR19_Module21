package com.darisky;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {
    protected static WebDriver theDriver;

    protected void getDriver(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        theDriver = new ChromeDriver(options);
    }
}
