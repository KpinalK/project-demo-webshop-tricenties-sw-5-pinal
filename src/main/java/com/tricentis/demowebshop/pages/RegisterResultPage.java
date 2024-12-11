package com.tricentis.demowebshop.pages;

import com.aventstack.extentreports.Status;
import com.tricentis.demowebshop.customlisteners.CustomListeners;
import com.tricentis.demowebshop.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class RegisterResultPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement registerMessage;


    public String getRegisterMessageRequired() {
        Reporter.log("get " + registerMessage.toString());
        CustomListeners.test.log(Status.PASS, "get " + registerMessage.toString());
        return getTextFromElement(registerMessage);
    }
}
