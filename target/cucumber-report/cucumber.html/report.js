$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("gear.feature");
formatter.feature({
  "line": 2,
  "name": "Gear Test",
  "description": "",
  "id": "gear-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@sanity"
    },
    {
      "line": 1,
      "name": "@smoke"
    },
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.before({
  "duration": 6031989900,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User Should Add Product SuccessFully To Shopping Cart",
  "description": "",
  "id": "gear-test;user-should-add-product-successfully-to-shopping-cart",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is in homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Mouse Hover on Gear Menu to Bags",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Mouse Hover on Bags and click on Bags",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 8,
      "value": "#    And Click on Bags"
    }
  ],
  "line": 9,
  "name": "Click on Product Name ‘Overnight Duffle’",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Verify the text ‘Overnight Duffle’",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Change Qty 3",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Click on ‘Add to Cart’ Button.",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Verify the text",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "‘You added Overnight Duffle to your shopping cart.’Click on ‘shopping cart’ Link into message",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Verify the product name ‘Cronus Yoga Pant’",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Verify the Qty is ‘3’",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Verify the product price ‘$135.00’",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Change Qty to ‘5’",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Click on ‘Update Shopping Cart’ button",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Verify the product price ‘$225.00’",
  "keyword": "And "
});
formatter.match({
  "location": "WomenSteps.userIsInHomepage()"
});
formatter.result({
  "duration": 92398800,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "GearSteps.mouseHoverOnBagsAndClickOnBags()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GearSteps.clickOnProductNameOvernightDuffle()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GearSteps.verifyTheTextOvernightDuffle()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 11
    }
  ],
  "location": "GearSteps.changeQty(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GearSteps.clickOnAddToCartButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GearSteps.verifyTheText()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GearSteps.youAddedOvernightDuffleToYourShoppingCartClickOnShoppingCartLinkIntoMessage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MenSteps.verifyTheProductNameCronusYogaPant()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 19
    }
  ],
  "location": "GearSteps.verifyTheQtyIs(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "135",
      "offset": 27
    },
    {
      "val": "00",
      "offset": 31
    }
  ],
  "location": "GearSteps.verifyTheProductPrice$(char,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 15
    }
  ],
  "location": "GearSteps.changeQtyTo(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GearSteps.clickOnUpdateShoppingCartButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "225",
      "offset": 27
    },
    {
      "val": "00",
      "offset": 31
    }
  ],
  "location": "GearSteps.verifyTheProductPrice$(char,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 813642600,
  "status": "passed"
});
formatter.uri("men.feature");
formatter.feature({
  "line": 2,
  "name": "Men Page",
  "description": "",
  "id": "men-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@sanity"
    },
    {
      "line": 1,
      "name": "@smoke"
    },
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.before({
  "duration": 4130412300,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "User Should Add Product SuccessFully To Shopping Cart",
  "description": "",
  "id": "men-page;user-should-add-product-successfully-to-shopping-cart",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is in homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Mouse Hover on Men Menu and On Bottom",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 6,
      "value": "#    And Mouse Hover on Bottoms"
    }
  ],
  "line": 7,
  "name": "Click on Pants",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Mouse Hover on product name‘Cronus Yoga Pant’ and click on size32.",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Mouse Hover on product name‘Cronus Yoga Pant’ and click on colourBlack.",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Mouse Hover on product name‘Cronus Yoga Pant’ and click on‘Add To Cart’ Button.",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Verify the text‘You added Cronus Yoga Pant to your shopping cart.’",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Click on ‘shopping cart’ Link into message",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Verify the text ‘Shopping Cart.’",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Verify the product name ‘Cronus Yoga Pant’",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Verify the product size ‘32’",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Verify the product colour ‘Black’",
  "keyword": "Then "
});
formatter.match({
  "location": "WomenSteps.userIsInHomepage()"
});
formatter.result({
  "duration": 19000,
  "status": "passed"
});
formatter.match({
  "location": "MenSteps.mouseHoverOnMenMenuAndOnBottom()"
});
formatter.result({
  "duration": 780220300,
  "status": "passed"
});
formatter.match({
  "location": "MenSteps.clickOnPants()"
});
formatter.result({
  "duration": 1454636600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "32",
      "offset": 63
    }
  ],
  "location": "MenSteps.mouseHoverOnProductNameCronusYogaPantAndClickOnSize(int)"
});
formatter.result({
  "duration": 387177000,
  "status": "passed"
});
formatter.match({
  "location": "MenSteps.mouseHoverOnProductNameCronusYogaPantAndClickOnColourBlack()"
});
formatter.result({
  "duration": 363002300,
  "status": "passed"
});
formatter.match({
  "location": "MenSteps.mouseHoverOnProductNameCronusYogaPantAndClickOnAddToCartButton()"
});
formatter.result({
  "duration": 340087100,
  "status": "passed"
});
formatter.match({
  "location": "MenSteps.verifyTheTextYouAddedCronusYogaPantToYourShoppingCart()"
});
formatter.result({
  "duration": 1827719800,
  "status": "passed"
});
formatter.match({
  "location": "MenSteps.clickOnShoppingCartLinkIntoMessage()"
});
formatter.result({
  "duration": 21800,
  "status": "passed"
});
formatter.match({
  "location": "MenSteps.verifyTheTextShoppingCart()"
});
formatter.result({
  "duration": 52500,
  "status": "passed"
});
formatter.match({
  "location": "MenSteps.verifyTheProductNameCronusYogaPant()"
});
formatter.result({
  "duration": 15800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "32",
      "offset": 25
    }
  ],
  "location": "MenSteps.verifyTheProductSize(int)"
});
formatter.result({
  "duration": 68600,
  "status": "passed"
});
formatter.match({
  "location": "MenSteps.verifyTheProductColourBlack()"
});
formatter.result({
  "duration": 14300,
  "status": "passed"
});
formatter.after({
  "duration": 1018009500,
  "status": "passed"
});
formatter.uri("women.feature");
formatter.feature({
  "line": 1,
  "name": "Women Page",
  "description": "",
  "id": "women-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4151061300,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "User wants to verify the \"Sort By Product Name Filter\" on Women Page in to magento.softwaretestingboard website",
  "description": "",
  "id": "women-page;user-wants-to-verify-the-\"sort-by-product-name-filter\"-on-women-page-in-to-magento.softwaretestingboard-website",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@sanity"
    },
    {
      "line": 2,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "User is in homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User mouse Hover on Women Menu to Top Menu",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 6,
      "value": "#     And  Mouse Hover on Tops"
    }
  ],
  "line": 7,
  "name": "Click on Jackets",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Select Sort By filter “Product Name”",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User should see the products name display in alphabetical order",
  "keyword": "Then "
});
formatter.match({
  "location": "WomenSteps.userIsInHomepage()"
});
formatter.result({
  "duration": 42800,
  "status": "passed"
});
formatter.match({
  "location": "WomenSteps.userMouseHoverOnWomenMenuToTopMenu()"
});
formatter.result({
  "duration": 465933500,
  "status": "passed"
});
formatter.match({
  "location": "WomenSteps.clickOnJackets()"
});
formatter.result({
  "duration": 1130453400,
  "status": "passed"
});
formatter.match({
  "location": "WomenSteps.selectSortByFilterProductName()"
});
formatter.result({
  "duration": 56500,
  "status": "passed"
});
formatter.match({
  "location": "WomenSteps.userShouldSeeTheProductsNameDisplayInAlphabeticalOrder()"
});
formatter.result({
  "duration": 1637601800,
  "status": "passed"
});
formatter.after({
  "duration": 799824200,
  "status": "passed"
});
});