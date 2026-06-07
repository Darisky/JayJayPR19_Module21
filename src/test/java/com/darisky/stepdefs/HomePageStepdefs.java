package com.darisky.stepdefs;

import com.darisky.BaseTest;
import com.darisky.pages.Home_Page;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class HomePageStepdefs extends BaseTest {
    Home_Page homePage = new Home_Page(theDriver);
    @And("user redirect to home page")
    public void userRedirectToHomePage() {
        homePage.atTheHomePage();
    }

    @Then("user see product list")
    public void userSeeProductList() {
        homePage.checkProductElement();
    }
}
