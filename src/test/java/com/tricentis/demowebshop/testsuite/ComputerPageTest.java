package com.tricentis.demowebshop.testsuite;

import com.tricentis.demowebshop.customlisteners.CustomListeners;
import com.tricentis.demowebshop.pages.BuildYourOwnComputerPage;
import com.tricentis.demowebshop.pages.ComputerPage;
import com.tricentis.demowebshop.pages.DesktopsPage;
import com.tricentis.demowebshop.pages.HomePage;
import com.tricentis.demowebshop.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import resources.testdata.TestData;

@Listeners(CustomListeners.class)
public class ComputerPageTest extends BaseTest {

    HomePage homePage;
    ComputerPage computerPage;
    DesktopsPage desktopsPage;
    BuildYourOwnComputerPage buildYourOwnComputer;



    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        computerPage = new ComputerPage();
        desktopsPage = new DesktopsPage();
        buildYourOwnComputer = new BuildYourOwnComputerPage();

    }



    @Test(groups = {"sanity"})
    public void verifyUserShouldNavigateToComputerPageSuccessfully(){




        //Click on the COMPUTER tab
        homePage.clickOnComputer();


        //Verify "Computer" text
        Assert.assertEquals(computerPage.getComputerMessageRequired(), "Computers");


    }
    @Test(groups = {"sanity", "smoke"})
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully(){

        //Click on the COMPUTER tab
        homePage.clickOnComputer();

        //Click on the Desktops link
        computerPage.clickOnDesktop();


        //Verify "Desktops" text
        Assert.assertEquals(desktopsPage.getDesktopText(), "Desktops");

    }

    @Test(groups = {"smoke", "regression1"}, dataProvider = "computerData", dataProviderClass = TestData.class)
    public void verifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully(String processor, String ram, String hdd, String os, String software){


        //Click on the COMPUTER tab
        homePage.clickOnComputer();

        //Click on the Desktops link
        computerPage.clickOnDesktop();


        //Click on the product name "Build your own computer"
        desktopsPage.clickOnBuildComputerButton();

        //Select processor "processor"
        buildYourOwnComputer.selectProcessorFromDropdown(processor);

        //Select RAM "ram"
        buildYourOwnComputer.selectRam(ram);

        //Select HDD "hdd"
        buildYourOwnComputer.selectHddRadio(hdd);

        //Select OS "os"
        buildYourOwnComputer.selectOs(os);

        //Select Software "software"
        buildYourOwnComputer.selectCheckBox(software);


        //Click on "ADD TO CART" Button
        buildYourOwnComputer.clickOnAddToCart();


//        //Verify the message "The product has been added to your shopping cart"
//      Assert.assertEquals(buildYourOwnComputer.getDesktopText(), "The product has been added to your shopping cart");


    }
}
