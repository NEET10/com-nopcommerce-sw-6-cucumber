package com.softwaretestingboard.magneto.pages;


import com.softwaretestingboard.magneto.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class GearBagsPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public GearBagsPage() {
        PageFactory.initElements(driver, this);
    }

    // Click on Product Name ‘Overnight Duffle’
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Overnight Duffle']")
    WebElement overNightDuffle;


    // Click on Product Name ‘Overnight Duffle’
    public void clickOnProductNameOvernightDuffle()  {
        Reporter.log("Click On OvernightDuffle  " + overNightDuffle.toString());
       log.info("Click On OvernightDuffle  " + overNightDuffle.toString());

        clickOnElement(overNightDuffle);
    }


}
