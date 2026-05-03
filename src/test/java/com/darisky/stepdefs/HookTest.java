package com.darisky.stepdefs;

import com.darisky.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HookTest extends BaseTest {
    @Before
    public void beforeTest(){
        getDriver();
    }

    @After
    public void afterTest(){
        theDriver.quit();
    }
}
