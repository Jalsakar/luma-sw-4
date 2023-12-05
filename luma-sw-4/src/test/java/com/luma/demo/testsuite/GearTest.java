package com.luma.demo.testsuite;

import com.luma.demo.pages.BagsPage;
import com.luma.demo.pages.HomePage;
import com.luma.demo.pages.OverNightDufflePage;
import com.luma.demo.pages.ShoppingCartPage;
import com.luma.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GearTest extends BaseTest {

    HomePage homePage = new HomePage();
    BagsPage bagsPage = new BagsPage();
    OverNightDufflePage overnightDufflePage = new OverNightDufflePage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    //1. userShouldAddProductSuccessFullyToShoppingCart()
    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {
        //Mouse Hover on Gear Menu
        Thread.sleep(2000);
        homePage.mouseHoverToGearMenuList();


        //Click on Bags
        Thread.sleep(2000);
        homePage.clickOnBags();


        //Click on Product Name ‘Overnight Duffle’
        Thread.sleep(2000);
        bagsPage.mouseHoverOnOverNightDuffleProductName();


        //Verify the text ‘Overnight Duffle’
        String actualProductName = overnightDufflePage.verifyOvernightDuffleTextOnPage();
        String expectedProductName = "Overnight Duffle";
        Assert.assertEquals(actualProductName, expectedProductName, "Incorrect Product Name displayed!");
        Thread.sleep(2000);

        //Change Qty 3
        overnightDufflePage.clearQuantityField();
        Thread.sleep(2000);
        overnightDufflePage.changeQuantityNumber("3");
        Thread.sleep(2000);

        //Click on ‘Add to Cart’ Button.
        overnightDufflePage.clickOnAddToCart();
        Thread.sleep(2000);

        //Verify the text ‘You added Overnight Duffle to your shopping cart.’
        String actualText = overnightDufflePage.verifyItemsAddedToShoppingCart();
        String expectedText = "You added Overnight Duffle to your shopping cart.";
        Assert.assertEquals(actualText, expectedText, "Incorrect Message Displayed!");
        Thread.sleep(2000);

        //Click on ‘shopping cart’ Link into message
        overnightDufflePage.clickOnShoppingCartLinkInsideTheMessage();
        Thread.sleep(2000);

        //Verify the product name ‘Overnight Duffle’
        String actualProductItemName = shoppingCartPage.verifyProductNameCronusYogaPant();
        String expectedProductItemName = "Overnight Duffle";
        Assert.assertEquals(actualProductItemName, expectedProductItemName, "Incorrect Product Name Displayed!");
        Thread.sleep(2000);

        //Verify the Qty is ‘3’
        String actualProductQuantity= shoppingCartPage.verifyTheQuantityIsThree();
        String expectedProductQuantity = "3";
        Assert.assertEquals(actualProductQuantity, expectedProductQuantity, "Incorrect Quantity Displayed!");
        Thread.sleep(2000);

        //Verify the product price ‘$135.00’
        String actualProductPrice= shoppingCartPage.verifyProductPrice();
        String expectedProductPrice = "$135.00";
        Assert.assertEquals(actualProductPrice, expectedProductPrice, "Incorrect Price Displayed!");
        Thread.sleep(2000);

        //Change Qty to ‘5’
        shoppingCartPage.clearQuantityField();
        Thread.sleep(2000);
        shoppingCartPage.changeQuantityNumber("5");
        Thread.sleep(2000);

        //Click on ‘Update Shopping Cart’ button
        shoppingCartPage.clickOnUpdateShoppingCart();
        Thread.sleep(2000);

        //Verify the product price ‘$225.00’
        String actualProductTotalPrice= shoppingCartPage.verifyTheProductTotalPrice();
        String expectedProductTotalPrice = "$225.00";
        Assert.assertEquals(actualProductTotalPrice, expectedProductTotalPrice, "Incorrect total price displayed!");
        Thread.sleep(2000);
    }
}
