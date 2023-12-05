package com.luma.demo.testsuite;

import com.luma.demo.pages.HomePage;
import com.luma.demo.pages.WomenPage;
import com.luma.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class WomenTest extends BaseTest {
    HomePage homePage = new HomePage();
    WomenPage womenPage = new WomenPage();
    @Test
    public void verifyTheSortByProductNameFilter() throws InterruptedException {
        //Mouse Hover on Women Menu
        homePage.mouseHoverToWomenMenuList();
        Thread.sleep(2000);

        //Mouse Hover on Tops
        homePage.mouseHoverOnWomenTops();
        Thread.sleep(2000);

        //Click on Jackets
        homePage.clickOnJackets();
        Thread.sleep(2000);

        //Select Sort By filter “Product Name”
        womenPage.sortByFilterProductName("Product Name ");
        Thread.sleep(2000);

        //Verify the products name display in alphabetical order
        ArrayList<String> actualList = getArrayListFromWebElements(womenPage.sortingJacketsList());
        System.out.println("Actual Jackets List : " + actualList);
        ArrayList<String> expectedList = getArrayListFromWebElements(womenPage.sortingJacketsList());
        System.out.println("Expected Jackets List : " + expectedList);
        actualList.sort(String.CASE_INSENSITIVE_ORDER);//Ascending order
        Assert.assertEquals(actualList, expectedList, "Products name not sorted!");
        Thread.sleep(2000);
    }
    @Test
    public void verifyTheSortByPriceFilter() throws InterruptedException {
        //Mouse Hover on Women Menu
        homePage.mouseHoverToWomenMenuList();
        Thread.sleep(2000);

        //Mouse Hover on Tops
        homePage.mouseHoverOnWomenTops();
        Thread.sleep(2000);

        //Click on Jackets
        homePage.clickOnJackets();
        Thread.sleep(2000);

        //Select Sort By filter “Price”
        womenPage.sortByPriceFilter("Price");
        Thread.sleep(2000);

        //Verify the products price display in Low to High
        ArrayList<String> actualList = getArrayListFromWebElements(womenPage.sortingInPriceList());
        System.out.println("Actual Price List : " + actualList);
        ArrayList<String> expectedList = getArrayListFromWebElements(womenPage.sortingInPriceList());
        System.out.println("Expected Price List : " + expectedList);
        actualList.sort(String.CASE_INSENSITIVE_ORDER);//Ascending order
        Assert.assertEquals(actualList, expectedList, "Price not sorted in list!");
        Thread.sleep(2000);
    }
}
