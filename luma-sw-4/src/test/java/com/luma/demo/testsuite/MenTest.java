package com.luma.demo.testsuite;

import com.luma.demo.pages.HomePage;
import com.luma.demo.pages.MensPage;
import com.luma.demo.pages.ShoppingCartPage;
import com.luma.demo.utilities.Utility;
import org.testng.annotations.Test;

public class MenTest extends Utility {
    HomePage homePage = new HomePage();
    MensPage mensPage = new MensPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {
        //Mouse Hover on Men Menu
        homePage.mouseHoverToMenMenuList();
        Thread.sleep(2000);

        //Mouse Hover on Bottoms
        homePage.mouseHoverOnMenBottoms();
        Thread.sleep(2000);

        //Click on Pants
        homePage.clickOnPants();
        Thread.sleep(2000);

        //Mouse Hover on product name ‘Cronus Yoga Pant’
        mensPage.mouseHoverCronusYogaPant();
        //and click on size 32.
        mensPage.clickOnSize(32);
        Thread.sleep(2000);

        //Mouse Hover on product name ‘Cronus Yoga Pant’ and click on colour Black.
        mensPage.mouseHoverAndClickOnColour("Black");
        Thread.sleep(2000);

        //Mouse Hover on product name ‘Cronus Yoga Pant’
        mensPage.mouseHoverToCronusYogaPant();
        Thread.sleep(2000);

        // and click on ‘Add To Cart’ Button.
        mensPage.clickOnAddToCartButton();
        Thread.sleep(2000);

        //Verify the text You added Cronus Yoga Pant to your shopping cart.
        mensPage.getTextCronusYogaPantAdded();
        Thread.sleep(2000);

        //Click on ‘shopping cart’ Link into message
        mensPage.clickOnShoppingCartLinkInsideMessage();
        Thread.sleep(2000);

        //Verify the text ‘Shopping Cart.’
        shoppingCartPage.verifyShoppingCartText();
        Thread.sleep(2000);

        //Verify the product name ‘Cronus Yoga Pant’
        shoppingCartPage.verifyProductsNameIsCronusYogaPant();
        Thread.sleep(2000);

        //Verify the product size ‘32’
        shoppingCartPage.verifyProductSizeIs32();
        Thread.sleep(2000);

        //Verify the product colour ‘Black’
        shoppingCartPage.verifyProductColourIsBlack();
        Thread.sleep(2000);
    }
}
