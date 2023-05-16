@sanity @smoke @regression
Feature: Men Page
  Scenario: User Should Add Product SuccessFully To Shopping Cart
    Given User is in homepage
 When Mouse Hover on Men Menu and On Bottom
#    And Mouse Hover on Bottoms
    And Click on Pants
    And Mouse Hover on product name‘Cronus Yoga Pant’ and click on size32.
    And Mouse Hover on product name‘Cronus Yoga Pant’ and click on colourBlack.
    And Mouse Hover on product name‘Cronus Yoga Pant’ and click on‘Add To Cart’ Button.
    And Verify the text‘You added Cronus Yoga Pant to your shopping cart.’
    And Click on ‘shopping cart’ Link into message
    And Verify the text ‘Shopping Cart.’
    And Verify the product name ‘Cronus Yoga Pant’
    And Verify the product size ‘32’
   Then Verify the product colour ‘Black’