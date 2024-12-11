package com.tricentis.demowebshop.pages;

import com.aventstack.extentreports.Status;
import com.tricentis.demowebshop.customlisteners.CustomListeners;
import com.tricentis.demowebshop.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

public class BuildYourOwnComputerPage extends Utility {

    @CacheLookup
    @FindBy(id = "product_attribute_16_5_4")
    WebElement processorDropdown;

    @CacheLookup
    @FindBy(id = "product_attribute_16_6_5")
    WebElement ramDropdown;

    @CacheLookup
    @FindBy(id = "product_attribute_16_3_6_18")
    List<WebElement> hddRadio;

    @CacheLookup
    @FindBy(id = "product_attribute_16_4_7_44")
    List<WebElement> osRadio;

    @CacheLookup
    @FindBy(id = "product_attribute_16_8_8_22")
    List<WebElement> softwareCheckbox;

    @CacheLookup
    @FindBy(xpath = "//input[@id='add-to-cart-button-16']")
    WebElement addToCart;

    public void selectProcessorFromDropdown(String processor) {
        Reporter.log("Select " + processorDropdown.toString());
        CustomListeners.test.log(Status.PASS, "Select " + processorDropdown.toString());
        selectByVisibleTextFromDropDown(processorDropdown, processor);
    }

    public void selectRam(String ram) {
        Reporter.log("Select " + ramDropdown.toString());
        CustomListeners.test.log(Status.PASS, "Select " + ramDropdown.toString());
        selectByVisibleTextFromDropDown(ramDropdown, ram);
    }

    public void selectHddRadio(String radio) {
        List<WebElement> hddRadios = hddRadio;

        String val = "320 GB";
        String val1 = "400 GB [+$100.00]";

        if (val.equalsIgnoreCase(radio)) {
            hddRadios.get(0).click();
        } else if (val1.equalsIgnoreCase(radio)) {
            hddRadios.get(1).click();
        }

        Reporter.log("Select " + hddRadio.toString());
        CustomListeners.test.log(Status.PASS, "Select " + hddRadio.toString());
    }

    public void selectOs(String os) {
        List<WebElement> osOption = getListOfElements(osRadio);
        String val = "Windows 7 [+50.00]";
        String val1 = "Windows 10 [+60.00]";
        if (val.equalsIgnoreCase(os)) {
            osOption.get(0).click();
        } else if (val1.equalsIgnoreCase(os)) {
            osOption.get(1).click();
        }

        CustomListeners.test.log(Status.PASS, "Select " + osRadio.toString());
        Reporter.log("Select " + osRadio.toString());
    }

    public void selectCheckBox(String software) {
        List<WebElement> softwareOption = getListOfElements(softwareCheckbox);
        String val0 = "Microsoft Office [+$50.00]";
        String val1 = "Acrobat Reader [+$10.00]";
        String val2 = "Total Commander [+$5.00]";

        //deselect all before performing next action
        for(WebElement chkbox: softwareOption){
            if(chkbox.isSelected())
                chkbox.click();
        }

        //clicking on checkbox
        if (val0.equalsIgnoreCase(software)) {
            softwareOption.get(0).click();
        } else if (val1.equalsIgnoreCase(software)) {
            softwareOption.get(1).click();
        } else if (val2.equalsIgnoreCase(software)) {
            softwareOption.get(2).click();
        }

        CustomListeners.test.log(Status.PASS, "Select " + softwareCheckbox);
        Reporter.log("Select " + softwareCheckbox.toString());
    }

    public void clickOnAddToCart(){
        clickOnElement(addToCart);
        CustomListeners.test.log(Status.PASS, "Click on " + addToCart);
        Reporter.log("Click on " + addToCart.toString());
    }
}
