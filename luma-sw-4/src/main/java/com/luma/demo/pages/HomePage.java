package com.luma.demo.pages;

import com.luma.demo.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    //****************************************  Women Menu  ************************************************************
    //Mouse Hover on Women Menu
    By mouseHoverToWomenMenu = By.xpath("//span[normalize-space()='Women']");
    public void mouseHoverToWomenMenuList() {
        mouseHoverToElement(mouseHoverToWomenMenu);
    }

    //Mouse Hover on Tops
    By mouseHoverOnTop = By.xpath("//a[@id='ui-id-9']//span[contains(text(),'Tops')]");
    public void mouseHoverOnWomenTops() {
        mouseHoverToElement(mouseHoverOnTop);
    }

    //Click on Jackets
    By jackets = By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]");
    public void clickOnJackets() {
        mouseHoverToElementAndClick(jackets);
    }


    //************************************************  Men Menu  *****************************************************

    //Mouse Hover on Men Menu
    By mouseHoverToMenMenu = By.xpath("//span[normalize-space()='Men']");
    public void mouseHoverToMenMenuList() {
        mouseHoverToElement(mouseHoverToMenMenu);
    }

    //Mouse Hover on Bottoms
    By mouseHoverOnBottoms = By.xpath("//a[@id='ui-id-18']");
    public void mouseHoverOnMenBottoms() {
        mouseHoverToElement(mouseHoverOnBottoms);
    }

    //Click on Pants
    By pants = By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");
    public void clickOnPants() {
        mouseHoverToElementAndClick(pants);
    }

    //*****************************************  Gear Menu  *****************************************************************

    // Mouse Hover on Gear Menu
    By mouseHoverToGearMenu = By.xpath("//a[@id='ui-id-6']//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e']");
    public void mouseHoverToGearMenuList() {
        mouseHoverToElement(mouseHoverToGearMenu);
    }

    //Click on Bags
    By bags = By.xpath("//span[normalize-space()='Bags']");
    public void clickOnBags() {
        mouseHoverToElementAndClick(bags);
    }
}