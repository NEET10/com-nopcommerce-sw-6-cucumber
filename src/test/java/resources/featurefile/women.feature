Feature: Women Page
   @sanity @regression
   Scenario: User wants to verify the "Sort By Product Name Filter" on Women Page in to magento.softwaretestingboard website
  Given User is in homepage
     When User mouse Hover on Women Menu to Top Menu
#     And  Mouse Hover on Tops
     And Click on Jackets
     And Select Sort By filter “Product Name”
     Then  User should see the products name display in alphabetical order

      @smoke @regression
      Scenario: User wants to verify the "Sort By Price Filter"
         When User mouse Hover on Women Menu to Top Menu
#         And  Mouse Hover on Tops
         And Click on Jackets
         And Select Sort By filter “Price”
         Then  User should see the products price display in Low to High
