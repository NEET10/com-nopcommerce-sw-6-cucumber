@sanity @smoke @regression
Feature: Gear Test

  Scenario: User Should Add Product SuccessFully To Shopping Cart
    Given User is in homepage
    When  Mouse Hover on Gear Menu to Bags
    And Mouse Hover on Bags and click on Bags
#    And Click on Bags
    And Click on Product Name ‘Overnight Duffle’
    And Verify the text ‘Overnight Duffle’
    And Change Qty 3
    And Click on ‘Add to Cart’ Button.
    And Verify the text
    And ‘You added Overnight Duffle to your shopping cart.’Click on ‘shopping cart’ Link into message
    And Verify the product name ‘Cronus Yoga Pant’
    And Verify the Qty is ‘3’
    And Verify the product price ‘$135.00’
    And Change Qty to ‘5’
    And Click on ‘Update Shopping Cart’ button
    And Verify the product price ‘$225.00’
