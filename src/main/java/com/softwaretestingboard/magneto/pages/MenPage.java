package com.softwaretestingboard.magneto.pages;

import com.softwaretestingboard.magneto.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class MenPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public MenPage() {
        PageFactory.initElements(driver, this);
    }


    //********* Mouse Hover on product name Cronus Yoga Pant and click on size 32.
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Cronus Yoga Pant']")
    WebElement hooverPantSize;
    @CacheLookup
    @FindBy(xpath = "//div[@id='option-label-size-143-item-175']")
    WebElement pantSize;

    //******** Mouse Hover on product name Cronus Yoga Pant and click on colour Black.
    @CacheLookup
    @FindBy(xpath = "(//div[@class='swatch-option color'])[1]")
    WebElement hooverPantColour;
    @CacheLookup
    @FindBy(xpath = "//div[@id='option-label-color-93-item-49']")
    WebElement pantColour;

    //******** Mouse Hover on product name Cronus Yoga Pant and click on ‘Add To Cart’ Button.
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Cronus Yoga Pant']")
    WebElement mouseHooverToBoth;
    // By mouseHooverToBoth = By.xpath("//a[normalize-space()='Cronus Yoga Pant']");
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Add to Cart']")
    WebElement addToCart;

    //******** Verify the text You added Cronus Yoga Pant to your shopping cart.
    @CacheLookup
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement verifyShoppingCart;

    //********** Click on ‘shopping cart’ Link into message
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shoppingCart;


    public void clickOnPantSize()  {

        Reporter.log("Click on Pant Size " + pantSize.toString());
       log.info("Click on Pant Size " + pantSize.toString());
        mouseHoverToElement(hooverPantSize);
        mouseHoverToElementAndClick(pantSize);
    }

    public void clickOnPantColour()  {

        Reporter.log("Click on Pant Colour " + pantColour.toString());
        log.info("Click on Pant Colour " + pantColour.toString());
        mouseHoverToElement(hooverPantColour);
        mouseHoverToElementAndClick(pantColour);
    }

    public void clickOnAddToCart()  {

        Reporter.log("Click On Add To Cart " + addToCart.toString());
        log.info("Click On Add To Cart " + addToCart.toString());
        mouseHoverToElement(mouseHooverToBoth);
        mouseHoverToElementAndClick(addToCart);
    }

    public String verifyAddedItemToTheShoppingCart()  {

        Reporter.log("Verify Add Items " + verifyShoppingCart.toString());
        log.info("Verify Add Items " + verifyShoppingCart.toString());
        return getTextFromElement(verifyShoppingCart);
    }

    public void shoppingCartLink()  {

        Reporter.log("Shopping Cart Link " + shoppingCart.toString());
        log.info("Shopping Cart Link " + shoppingCart.toString());
        clickOnElement(shoppingCart);
    }

}


