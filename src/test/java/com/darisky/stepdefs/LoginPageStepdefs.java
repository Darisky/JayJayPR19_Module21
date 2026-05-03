package com.darisky.stepdefs;

import com.darisky.BaseTest;
import com.darisky.pages.Login_Page;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class LoginPageStepdefs extends BaseTest {
    Login_Page loginPage;
    @Given("user at login page")
    public void userAtLoginPage() {
        loginPage = new Login_Page(theDriver);
        loginPage.goToLoginPage();
    }

    @And("user input username and password with {string} and {string}")
    public void userInputUsernameAndPasswordWithAnd(String userName, String password) {
        loginPage.inputCredential(userName, password);
    }

    @When("user click login button")
    public void userClickLoginButton() {
        loginPage.clickingLoginButton();
    }
}
