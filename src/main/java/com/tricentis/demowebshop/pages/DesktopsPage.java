package com.tricentis.demowebshop.pages;

import com.aventstack.extentreports.Status;
import com.tricentis.demowebshop.customlisteners.CustomListeners;
import com.tricentis.demowebshop.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class DesktopsPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Desktops']")
    WebElement desktopText;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Build your own computer']")
    WebElement buildComputer;


    public String getDesktopText() {
        Reporter.log("get " + desktopText.toString());
        CustomListeners.test.log(Status.PASS, "get " + desktopText.toString());
        return getTextFromElement(desktopText);
    }

    public void clickOnBuildComputerButton(){
        clickOnElement(buildComputer);
        CustomListeners.test.log(Status.PASS, "Click on Register Button");

    }
}
