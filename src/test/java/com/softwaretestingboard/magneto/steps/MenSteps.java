package com.softwaretestingboard.magneto.steps;

import com.softwaretestingboard.magneto.pages.HomePage;
import com.softwaretestingboard.magneto.pages.MenPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class MenSteps {
    @When("^Mouse Hover on Men Menu and On Bottom$")
    public void mouseHoverOnMenMenuAndOnBottom() {
        new HomePage().mouseHooverToMenMenuToBottomMenu();
    }
   /* @When("^Mouse Hover on Men Menu$")
    public void mouseHoverOnMenMenu() {
        new HomePage().mouseHooverToMenMenu();
    }

    @And("^Mouse Hover on Bottoms$")
    public void mouseHoverOnBottoms() {
        new HomePage().mouseHooverToBottomsMenu();
    }*/

    @And("^Click on Pants$")
    public void clickOnPants() {
        new HomePage().clickOnPants();
    }

    @And("^Mouse Hover on product name‘Cronus Yoga Pant’ and click on size(\\d+)\\.$")
    public void mouseHoverOnProductNameCronusYogaPantAndClickOnSize(int size) {
        new MenPage().clickOnPantSize();
    }

    @And("^Mouse Hover on product name‘Cronus Yoga Pant’ and click on colourBlack\\.$")
    public void mouseHoverOnProductNameCronusYogaPantAndClickOnColourBlack() {
        new MenPage().clickOnPantColour();
    }

    @And("^Mouse Hover on product name‘Cronus Yoga Pant’ and click on‘Add To Cart’ Button\\.$")
    public void mouseHoverOnProductNameCronusYogaPantAndClickOnAddToCartButton() {
        new MenPage().clickOnAddToCart();
    }

    @And("^Verify the text‘You added Cronus Yoga Pant to your shopping cart\\.’$")
    public void verifyTheTextYouAddedCronusYogaPantToYourShoppingCart() {
        Assert.assertEquals( "You added Cronus Yoga Pant to your shopping cart.", new MenPage().verifyAddedItemToTheShoppingCart());

    }

    @And("^Click on ‘shopping cart’ Link into message$")
    public void clickOnShoppingCartLinkIntoMessage() {
    }

    @And("^Verify the text ‘Shopping Cart\\.’$")
    public void verifyTheTextShoppingCart() {
    }

    @And("^Verify the product name ‘Cronus Yoga Pant’$")
    public void verifyTheProductNameCronusYogaPant() {
    }

    @And("^Verify the product size ‘(\\d+)’$")
    public void verifyTheProductSize(int arg0) {
    }

    @Then("^Verify the product colour ‘Black’$")
    public void verifyTheProductColourBlack() {
    }


}
