package com.softwaretestingboard.magneto.pages;

import com.softwaretestingboard.magneto.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ShoppingCartPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public ShoppingCartPage() {
        PageFactory.initElements(driver, this);
    }

    //************ Verify the text ‘Shopping Cart.'
    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement verifyText;

    //************ Verify the product name ‘Cronus Yoga Pant’
    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']")
    WebElement verifyName;

    //************ Verify the product size ‘32’
    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'32')]")
    WebElement verifySize;

    //************ Verify the product colour ‘Black’
    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'Black')]")
    WebElement verifyColour;

    //************ Verify the product name ‘Overnight Duffle’
    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Overnight Duffle']")
    WebElement verifyBagName;

    // ************ Verify the Qty is ‘3’
    @CacheLookup
    @FindBy(xpath = "//input[@title='Qty']")
    WebElement verifyQty;


    // ************ Verify the product price ‘$135.00’
    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-price']//span[@class='price'][normalize-space()='$135.00']")
    WebElement verifyThePrice;

    //************ Change Qty to ‘5’
    @CacheLookup
    @FindBy(xpath = "//input[@title='Qty']")
    WebElement changeQty;
    //************ Click on ‘Update Shopping Cart’ button
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Update Shopping Cart']")
    WebElement clickUpdate;

    // ************ Verify the product price ‘$225.00’
    @CacheLookup
    @FindBy(xpath = "(//span[@class='cart-price']//span)[2]")
    WebElement verifyLastPrice;

    //************ Verify the text ‘Shopping Cart.'
    public String verifyTextMessage()  {

        Reporter.log("Verify Text Message " + verifyText.toString());
        log.info("Verify Text Message " + verifyText.toString());
        return getTextFromElement(verifyText);
    }

    // Verify the product name ‘Cronus Yoga Pant’
    public String verifyProductName()  {

        Reporter.log("Verify Product Name " + verifyName.toString());
        log.info("Verify Product Name " + verifyName.toString());
        return getTextFromElement(verifyName);
    }

    // Verify the product size ‘32’
    public String verifyProductSize()  {

        Reporter.log("Verify Product Size " + verifySize.toString());
        log.info("Verify Product Size " + verifySize.toString());
        return getTextFromElement(verifySize);
    }

    // Verify the product colour ‘Black’
    public String verifyProductColour()  {

        Reporter.log("Verify Product Colour " + verifyColour.toString());
        log.info("Verify Product Colour " + verifyColour.toString());
        return getTextFromElement(verifyColour);
    }

    //Verify the product name ‘Overnight Duffle’
    public String verifyTheBagName()  {

        Reporter.log("Verify Product Bag Name " + verifyBagName.toString());
        log.info("Verify Product Bag Name " + verifyBagName.toString());
        return getTextFromElement(verifyBagName);
    }

    //Verify the Qty is ‘3’
    public String verifyTheQuantityNumber()  {

        Reporter.log("Verify Product Quantity " + verifyQty.toString());
        log.info("Verify Product Quantity " + verifyQty.toString());
        return getAttributeValueFromElement(verifyQty);
    }

    //Verify the product price ‘$135.00’
    public String verifyTheProductPriceInCart()  {

        Reporter.log("Verify Product Price In Cart" + verifyThePrice.toString());
        log.info("Verify Product Price In Cart" + verifyThePrice.toString());
        return getTextFromElement(verifyThePrice);
    }

    // Change Qty to '5'
    public void changeQuantity5()  {

        Reporter.log("Change Quantity" + changeQty.toString());
        log.info("Change Quantity" + changeQty.toString());
        sendTextToElement(changeQty, "5");
    }

    // Click on ‘Update Shopping Cart’ button
    public void clickOnUpdateShoppingCart()  {

        Reporter.log("Click On Update shopping Cart" + clickUpdate.toString());
        log.info("Click On Update shopping Cart" + clickUpdate.toString());
        clickOnElement(clickUpdate);
    }

    // Verify the product price ‘$225.00’
    public String verifyTheUpdateCartPrice()  {

        Reporter.log("Verify The Update CartPrice" + verifyLastPrice.toString());
       log.info("Verify The Update CartPrice" + verifyLastPrice.toString());
        return getTextFromElement(verifyLastPrice);

    }


}
