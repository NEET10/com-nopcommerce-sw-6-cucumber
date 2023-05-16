package com.softwaretestingboard.magneto.steps;

import com.softwaretestingboard.magneto.pages.HomePage;
import com.softwaretestingboard.magneto.pages.WomenPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class WomenSteps {
    @Given("^User is in homepage$")
    public void userIsInHomepage() {
    }

    @When("^User mouse Hover on Women Menu to Top Menu$")
    public void userMouseHoverOnWomenMenuToTopMenu() {
        new HomePage().mouserHooverToWomenMenuToTopMenu();
    }

   /* @When("^User mouse Hover on Women Menu$")
    public void userMouseHoverOnWomenMenu() {
        new HomePage().mouserHooverToWomenMenuToTopMenu();
    }*/

   /* @And("^Mouse Hover on Tops$")
    public void mouseHoverOnTops() {
        new HomePage().mouseHooverToTopMenu();
    }*/

    @And("^Click on Jackets$")
    public void clickOnJackets() {
        new HomePage().clickOnJacket();
    }

    @And("^Select Sort By filter “Product Name”$")
    public void selectSortByFilterProductName() {
    }

    @Then("^User should see the products name display in alphabetical order$")
    public void userShouldSeeTheProductsNameDisplayInAlphabeticalOrder() {
        Assert.assertEquals(new WomenPage().productListAfterSorting(), new WomenPage().productListBeforeSorting());
    }


    @And("^Select Sort By filter “Price”$")
    public void selectSortByFilterPrice() {
    }

    @Then("^User should see the products price display in Low to High$")
    public void userShouldSeeTheProductsPriceDisplayInLowToHigh() {
        Assert.assertEquals(new WomenPage().priceListAfterSorting(), new WomenPage().priceListBeforeSorting());
    }
}
