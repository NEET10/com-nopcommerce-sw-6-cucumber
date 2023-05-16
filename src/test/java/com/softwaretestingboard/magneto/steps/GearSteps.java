package com.softwaretestingboard.magneto.steps;

import com.softwaretestingboard.magneto.pages.GearBagsPage;
import com.softwaretestingboard.magneto.pages.HomePage;
import com.softwaretestingboard.magneto.pages.OvernightDufflePage;
import com.softwaretestingboard.magneto.pages.ShoppingCartPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class GearSteps {
    /*@When("^Mouse Hover on Gear Menu to Bags and click on Bags$")
    public void mouseHoverOnGearMenuToBagsAndClickOnBags() {
        new HomePage().mouseHooverToGearMenuToBagsAndClickOnBags();
    }*/
    /*@When("^Mouse Hover on Gear Menu$")
    public void mouseHoverOnGearMenu() {
        new HomePage().mouseHooverToGearMenu();
    }*/
    @When("^Mouse Hover on Gear Menu$")
    public void mouseHoverOnGearMenu() {
        new HomePage().mouseHooverToGearMenu(); }

       @And("^Mouse Hover on Bags and click on Bags$")
        public void mouseHoverOnBagsAndClickOnBags() {
        new HomePage().mouseHoverOnBagsAndClickOnBags();

    }

   /* @And("^Click on Bags$")
    public void clickOnBags() {
        new HomePage().clickOnBags();

    }*/

    @And("^Click on Product Name ‘Overnight Duffle’$")
    public void clickOnProductNameOvernightDuffle() {
        new GearBagsPage().clickOnProductNameOvernightDuffle();
    }

    @And("^Verify the text ‘Overnight Duffle’$")
    public void verifyTheTextOvernightDuffle() {
        Assert.assertEquals("Overnight Duffle", new OvernightDufflePage().verifyProduceName());
    }

    @And("^Change Qty (\\d+)$")
    public void changeQty(int Quantity) {
        new OvernightDufflePage().changeQuantityForProduct("3");
    }

    @And("^Click on ‘Add to Cart’ Button\\.$")
    public void clickOnAddToCartButton() {
        new OvernightDufflePage().clickOnAddCartButton();
    }

    @And("^Verify the text$")
    public void verifyTheText() {
        Assert.assertEquals("You added Overnight Duffle to your shopping cart.",new OvernightDufflePage().verifyTheBagShoppingCartText());
    }

    @And("^‘You added Overnight Duffle to your shopping cart\\.’Click on ‘shopping cart’ Link into message$")
    public void youAddedOvernightDuffleToYourShoppingCartClickOnShoppingCartLinkIntoMessage() {
        new OvernightDufflePage().clickOnBagShoppingCartLink();
    }

    @And("^Verify the Qty is ‘(\\d+)’$")
    public void verifyTheQtyIs(String Quantity) {
        Assert.assertEquals("3",new ShoppingCartPage().verifyTheQuantityNumber());

    }

    @And("^Verify the product price ‘\\$(\\d+)\\.(\\d+)’$")
    public void verifyTheProductPrice$(char $, String price) {
        Assert.assertEquals("$135.00", new ShoppingCartPage().verifyTheProductPriceInCart());
    }

    @And("^Change Qty to ‘(\\d+)’$")
    public void changeQtyTo(int Quantity) {
        new ShoppingCartPage().changeQuantity5();
    }

    @And("^Click on ‘Update Shopping Cart’ button$")
    public void clickOnUpdateShoppingCartButton() {
        new ShoppingCartPage().clickOnUpdateShoppingCart();
    }



}
