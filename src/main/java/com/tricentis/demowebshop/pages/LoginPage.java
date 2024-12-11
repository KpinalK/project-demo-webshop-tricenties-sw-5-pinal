package com.tricentis.demowebshop.pages;

import com.aventstack.extentreports.Status;
import com.tricentis.demowebshop.customlisteners.CustomListeners;
import com.tricentis.demowebshop.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Welcome, Please Sign In!']")
    WebElement welcomeText;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(name = "Password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//input[@value = 'Log in']")
    WebElement loginButton;


    @CacheLookup
    @FindBy(xpath = "//div[@class = 'validation-summary-errors']")
    WebElement errorMessage;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log out']")
    WebElement logoutText;





    public String getWelcomeText() {
        Reporter.log("get " + welcomeText.toString());
        CustomListeners.test.log(Status.PASS, "get " + welcomeText.toString());
        return getTextFromElement(welcomeText);
    }

    public void enterEmailId(String email) {
        sendTextToElement(emailField, email);
        CustomListeners.test.log(Status.PASS, "Enter EmailId " + email);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
        CustomListeners.test.log(Status.PASS, "Enter Password " + password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
        CustomListeners.test.log(Status.PASS, "Click on loginButton");
    }

    public String getErrorMessage() {
        String message = getTextFromElement(errorMessage);
        CustomListeners.test.log(Status.PASS, "Get errorMessage");
        return message;
    }
    public String getLogoutText() {
        Reporter.log("get " + logoutText.toString());
        CustomListeners.test.log(Status.PASS, "get " + logoutText.toString());
        return getTextFromElement(logoutText);
    }

}
