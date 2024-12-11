package com.tricentis.demowebshop.testsuite;

import com.tricentis.demowebshop.customlisteners.CustomListeners;
import com.tricentis.demowebshop.pages.HomePage;
import com.tricentis.demowebshop.pages.RegisterPage;
import com.tricentis.demowebshop.pages.RegisterResultPage;
import com.tricentis.demowebshop.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class RegisterPageTest extends BaseTest {

    HomePage homePage;
    RegisterPage registerPage;
    RegisterResultPage registerResultPage;


    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        registerPage = new RegisterPage();
        registerResultPage = new RegisterResultPage();
    }


    @Test(groups = {"sanity"})
    public void verifyUserShouldNavigateToRegisterPageSuccessfully(){


        //Click on the Register Link
        homePage.clickOnRegister();


        //Verify "Register" text
        Assert.assertEquals(registerPage.getRegisterText(), "Register");
    }


    @Test(groups = {"sanity", "smoke"})
    public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory(){


        //Click on the Register Link
        homePage.clickOnRegister();


        //Click on the "Register" button
        registerPage.clickOnRegisterButton();


        //Verify the error message "First name is required."
        Assert.assertEquals(registerPage.getFirstNameRequired(), "First name is required.");


        //Verify the error message "Last name is required."
        Assert.assertEquals(registerPage.getLastNameRequired(), "Last name is required.");


        //Verify the error message "Email is required."
        Assert.assertEquals(registerPage.getEmailRequired(), "Email is required.");


        //Verify the error message "Password is required."
        Assert.assertEquals(registerPage.getPasswordRequires(), "Password is required.");


        //Verify the error message "Password is required."
        Assert.assertEquals(registerPage.getPasswordRequires2(), "Password is required.");
    }

    @Test(groups = {"smoke", "regression1"})
    public void verifyThatUserShouldCreateAccountSuccessfully() {


        //Click on the Register Link
        homePage.clickOnRegister();


        //Select gender "Female"
        registerPage.clickOnGender();

        //Enter the first name
        registerPage.enterFirstNameField("meena");

        //Enter the last name
        registerPage.enterLastNameField("patel");

        //Enter email
        registerPage.enterEmailField("meena4412@gmail.com");

        //Enter password
        registerPage.enterPasswordField("meena125");

        //Enter Confirm Password
        registerPage.enterConfirmPasswordField("meena125");


        //Click on the "Register" button
        registerPage.clickOnRegisterButton();

        //Verify the message "Your registration completed"
        Assert.assertEquals(registerResultPage.getRegisterMessageRequired(), "Your registration completed");
    }
}
