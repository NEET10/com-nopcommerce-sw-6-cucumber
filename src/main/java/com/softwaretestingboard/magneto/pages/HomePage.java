package com.softwaretestingboard.magneto.pages;

import com.softwaretestingboard.magneto.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    //Mouse Hoover on WomenLink
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Women']")
    WebElement womenLink;

    // Mouse Hover on Tops
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-9']//span[contains(text(),'Tops')]")
    WebElement topLink;

    //click on jacket menu
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-11']//span[contains(text(),'Jackets')]")
    WebElement jacketLink;

    //Mouse Hoover on MenLink

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Men']")
    WebElement menLink;

    // Mouse hoover Bottoms
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-18']")
    WebElement bottomLink;

    //click on pants
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-23']//span[contains(text(),'Pants')]")
    WebElement pantsLink;

    // Mouse Hoover on GearLink
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Gear']")
    WebElement gearLink;

    // Click on Bags
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Bags']")
    WebElement bags;


    public void mouserHooverToWomenMenu()  {
        Reporter.log("Mouse Hoover To WomenMenu " + womenLink.toString());
        log.info("Mouse Hoover To WomenMenu " + womenLink.toString());
        mouseHoverToElement(womenLink);
    }

    public void mouseHooverToTopMenu()  {
        Reporter.log("Mouse Hoover To Top Menu " + topLink.toString());
        log.info("Mouse Hoover To Top Menu " + topLink.toString());
        mouseHoverToElement(topLink);
    }
    public void mouserHooverToWomenMenuToTopMenu() {
        Reporter.log("Mouse Hoover To WomenMenu " + womenLink.toString());
        log.info("Mouse Hoover To WomenMenu " + womenLink.toString());
        mouseHoverToElementToAnotherElement(womenLink, topLink);
    }

    public void clickOnJacket()  {

        Reporter.log("Mouse Hoover To Jacket Menu " + jacketLink.toString());
        log.info("Mouse Hoover To Jacket Menu " + jacketLink.toString());
        mouseHoverToElementAndClick(jacketLink);
    }

    public void mouseHooverToMenMenuToBottomMenu()  {

        Reporter.log("Mouse Hoover To Men Menu " + menLink.toString());
        log.info("Mouse Hoover To Men Menu " + menLink.toString());
        mouseHoverToElementToAnotherElement(menLink, bottomLink);
    }

    public void mouseHooverToBottomsMenu()  {

        Reporter.log("Mouse Hoover To Bottom Menu " + bottomLink.toString());
        log.info("Mouse Hoover To Bottom Menu " + bottomLink.toString());
        mouseHoverToElement(bottomLink);
    }

    public void clickOnPants()  {

        Reporter.log("Click On Pants " + pantsLink.toString());
        log.info("Click On Pants " + pantsLink.toString());
        mouseHoverToElementAndClick(pantsLink);
    }

    public void mouseHooverToGearMenu()  {

        Reporter.log("Mouse Hoover To Gear Menu " + gearLink.toString());
        log.info("Mouse Hoover To Gear Menu " + gearLink.toString());
        mouseHoverToElement(gearLink);
    }

    // Click on Bags
    public void mouseHoverOnBagsAndClickOnBags()  {

        Reporter.log("Click On Bags " + bags.toString());
        log.info("Click On Bags " + bags.toString());
        mouseHoverToElementAndClick(bags);
    }
}
