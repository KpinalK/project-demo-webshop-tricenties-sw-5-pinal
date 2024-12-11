package com.tricentis.demowebshop.pages;

import com.aventstack.extentreports.Status;
import com.tricentis.demowebshop.customlisteners.CustomListeners;
import com.tricentis.demowebshop.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class RegisterPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Register']")
    WebElement registerText;

    @CacheLookup
    @FindBy(id = "register-button")
    WebElement registerTab;

    @CacheLookup
    @FindBy(xpath = "//span[@for='FirstName']")
    WebElement firstNameRequired;


    @CacheLookup
    @FindBy(xpath = "//span[@for='LastName']")
    WebElement lastNameRequired;


    @CacheLookup
    @FindBy(xpath = "//span[@for='Email']")
    WebElement emailRequired;


    @CacheLookup
    @FindBy(xpath = "//span[@for='Password']")
    WebElement passwordRequires;

    @CacheLookup
    @FindBy(xpath = "//span[@for='ConfirmPassword']")
    WebElement passwordRequires2;


    @CacheLookup
    @FindBy(xpath = "//input[@value='F']")
    WebElement selectGender;


    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement enterFirstName;


    @CacheLookup
    @FindBy(id  = "LastName")
    WebElement enterLastName;



    @CacheLookup
    @FindBy(id = "Email")
    WebElement enterEmail;



    @CacheLookup
    @FindBy(id = "Password")
    WebElement enterPassword;



    @CacheLookup
    @FindBy(id  = "ConfirmPassword")
    WebElement enterConfirmPassword;



    public String getRegisterText() {
        Reporter.log("get " + registerText.toString());
        CustomListeners.test.log(Status.PASS, "get " + registerText.toString());
        return getTextFromElement(registerText);
    }
    public void clickOnRegisterButton(){
        clickOnElement(registerTab);
        CustomListeners.test.log(Status.PASS, "Click on Register Button");

    }
    public String getFirstNameRequired() {
        Reporter.log("get " + firstNameRequired.toString());
        CustomListeners.test.log(Status.PASS, "get " + firstNameRequired.toString());
        return getTextFromElement(firstNameRequired);
    }

    public String getLastNameRequired() {
        Reporter.log("get " + lastNameRequired.toString());
        CustomListeners.test.log(Status.PASS, "get " + lastNameRequired.toString());
        return getTextFromElement(lastNameRequired);
    }

    public String getEmailRequired() {
        Reporter.log("get " + emailRequired.toString());
        CustomListeners.test.log(Status.PASS, "get " + emailRequired.toString());
        return getTextFromElement(emailRequired);
    }
    public String getPasswordRequires() {
        Reporter.log("get " + passwordRequires.toString());
        CustomListeners.test.log(Status.PASS, "get " + passwordRequires.toString());
        return getTextFromElement(passwordRequires);
    }

    public String getPasswordRequires2() {
        Reporter.log("get " + passwordRequires2.toString());
        CustomListeners.test.log(Status.PASS, "get " + passwordRequires2.toString());
        return getTextFromElement(passwordRequires2);
    }


    public void clickOnGender(){
        clickOnElement(selectGender);
        CustomListeners.test.log(Status.PASS, "Click on Male");

    }


    public void enterFirstNameField(String name) {
        sendTextToElement(enterFirstName, name);
        CustomListeners.test.log(Status.PASS, "Enter name " + name);
    }

    public void enterLastNameField(String last) {
        sendTextToElement(enterLastName, last);
        CustomListeners.test.log(Status.PASS, "Enter last name " + last);
    }


    public void enterEmailField(String email) {
        sendTextToElement(enterEmail, email);
        CustomListeners.test.log(Status.PASS, "Enter EmailId " + email);
    }

    public void enterPasswordField(String password) {
        sendTextToElement(enterPassword, password);
        CustomListeners.test.log(Status.PASS, "Enter Password " + password);
    }


    public void enterConfirmPasswordField(String password) {
        sendTextToElement(enterConfirmPassword, password);
        CustomListeners.test.log(Status.PASS, "Enter Password " + password);
    }
}
