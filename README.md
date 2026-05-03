# JayJay PR19 Module 21 : Web Automation Framework With Cucumber And Selenium
This sample task for Automation test login in Saucedemo.com.

## Dependencies
* **Selenium** version 4.18.1
* **Cucumber** JUnit version 7.34.3
* **Cucumber** Java version 7.34.3
* **JUnit** API version 6.0.3
* **JUnit** Engine version 6.0.3

## Test Explanation
This test running with Cucumber with Gherkin format as scenario

### User login with valid credential
- User in Login Page at saucedemo.com
- User input valid credential (valid username and password)
- user click login button
- user redirect to Home Page
- User see list of product on Home Page

### User login with invalid credential
- User in Login Page at saucedemo.com
- User input invalid credential (invalid username and password)
- user click Login Button
- user still on Login Page
- User See Error Message

### User login without credential
- User in Login Page at saucedemo.com
- User input empty credential (empty username and password)
- user click Login Button
- user still on Login Page
- User See Error Message