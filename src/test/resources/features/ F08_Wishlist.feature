Feature: Wishlist
  Scenario: added product to wishlist
    Given user go to main page
    When user click on Wishlist button
    Then success message is displayed

  Scenario: added product to wishlist2
    Given user go to main page
    When user click on Wishlist button
    And  click on Wishlist Tab on the top of the page
   Then get Qty value and verify it's bigger than 0



