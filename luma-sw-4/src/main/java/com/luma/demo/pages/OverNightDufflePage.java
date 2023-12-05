package com.luma.demo.pages;

import com.luma.demo.utilities.Utility;
import org.openqa.selenium.By;

public class OverNightDufflePage extends Utility {
    //Verify the text ‘Overnight Duffle’
    By overnightDuffleText = By.xpath("//span[@class='base']");
    public String verifyOvernightDuffleTextOnPage() {
        return gettextFromElement(overnightDuffleText);
    }

    //Clear the amount first
    By clearQuantity = By.id("qty");
    public void clearQuantityField() {
        clearTextField(clearQuantity);
    }

    //Change Qty 3
    By changeQuantity = By.id("qty");
    public void changeQuantityNumber(String quantity) {
        sendTextToElement(changeQuantity, quantity);
    }

    //Click on ‘Add to Cart’ Button.
    By addToCart = By.xpath("//button[@id='product-addtocart-button']");
    public void clickOnAddToCart() {
        clickOnElement(addToCart);
    }

    //Verify the text ‘You added Overnight Duffle to your shopping cart.’
    By itemsAdded = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    public String verifyItemsAddedToShoppingCart() {
        return gettextFromElement(itemsAdded);
    }

    //Click on ‘shopping cart’ Link into message
    By shoppingCartLink = By.xpath("//a[normalize-space()='shopping cart']");
    public void clickOnShoppingCartLinkInsideTheMessage() {
        clickOnElement(shoppingCartLink);
    }
}