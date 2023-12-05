package com.luma.demo.pages;

import com.luma.demo.utilities.Utility;
import org.openqa.selenium.By;

public class BagsPage extends Utility {
    // * Click on Product Name ‘Overnight Duffle’
    By overnightDuffle = By.xpath("//a[normalize-space()='Overnight Duffle']");

    public void mouseHoverOnOverNightDuffleProductName() {
        mouseHoverToElementAndClick(overnightDuffle);
    }

}
