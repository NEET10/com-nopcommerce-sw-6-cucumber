package com.softwaretestingboard.magneto.pages;

import com.softwaretestingboard.magneto.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class OvernightDufflePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public OvernightDufflePage() {PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement verifyName;
    // By verifyName = By.xpath("//span[@class='base']");
    //*******Change Qty 3
    @CacheLookup
    @FindBy(xpath = "//input[@id='qty']")
    WebElement changeNumber;

    //********Click on ‘Add to Cart’ Button.
    @CacheLookup
    @FindBy(xpath = "//button[@id='product-addtocart-button']")
    WebElement clickOnButton;

    //********Verify the text‘You added Overnight Duffle to your shopping cart.’
    @CacheLookup
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement verifyTextOnPage;

    //***** Click on ‘shopping cart’ Link into message
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement cartLink;


    //******* Verify the text ‘Overnight Duffle’
    public String verifyProduceName()  {

        Reporter.log("Verify Product Name " + verifyName.toString());
        log.info("Verify Product Name " + verifyName.toString());
        return getTextFromElement(verifyName);
    }

    //Change Qty 3
   /* public void changeQuantity(String quantity)  {

        Reporter.log("Enter quantity " + quantity + " to quantity field" + changeNumber.toString());
        log.info("Enter quantity " + quantity + " to quantity field" + changeNumber.toString());
        clearTextAndSendKey(changeNumber, quantity);
    }*/
    public void changeQuantityForProduct(String text) {
        changeNumber.clear();
        sendTextToElement(changeNumber, text);
        log.info("Change Quantity " + text + " to quantity field " + changeNumber.toString());
    }

    //Click on ‘Add to Cart’ Button.
    public void clickOnAddCartButton()  {

        Reporter.log("Click On Add On cart " + clickOnButton.toString());
        log.info("Click On Add On cart " + clickOnButton.toString());
        clickOnElement(clickOnButton);
    }

    //Verify the text‘You added Overnight Duffle to your shopping cart.’
    public String verifyTheBagShoppingCartText()  {

        Reporter.log("Verify Shopping Cart Text " + verifyTextOnPage.toString());
       log.info("Verify Shopping Cart Text " + verifyTextOnPage.toString());
        return getTextFromElement(verifyTextOnPage);
    }

    // Click on ‘shopping cart’ Link into message
    public void clickOnBagShoppingCartLink() {
        Reporter.log("Click On Shopping Cart Link " + cartLink.toString());
       log.info("Click On Shopping Cart Link " + cartLink.toString());
        clickOnElement(cartLink);
    }
}
