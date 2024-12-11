package com.tricentis.demowebshop.pages;

import com.aventstack.extentreports.Status;
import com.tricentis.demowebshop.customlisteners.CustomListeners;
import com.tricentis.demowebshop.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log in']")
    WebElement loginPage;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log in']")
    WebElement loginText;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Register']")
    WebElement registerTab;

    @CacheLookup
    @FindBy(xpath = "//div[@class='header-menu']/ul[1]/li[2]/a")
    WebElement computerMenu;



    public void clickOnLogin(){
        clickOnElement(loginPage);
        Reporter.log("Get " + loginPage.toString());
        CustomListeners.test.log(Status.PASS, "Get " + loginPage);
    }

    public String getLoginText() {
        Reporter.log("get " + loginText.toString());
        CustomListeners.test.log(Status.PASS, "get " + loginText.toString());
        return getTextFromElement(loginText);
    }
    public void clickOnRegister(){
        clickOnElement(registerTab);
        Reporter.log("Get " + registerTab.toString());
        CustomListeners.test.log(Status.PASS, "Get " + registerTab);
    }

    public void clickOnComputer(){
        clickOnElement(computerMenu);
        Reporter.log("Get " + computerMenu.toString());
        CustomListeners.test.log(Status.PASS, "Get " + computerMenu);
    }

}
