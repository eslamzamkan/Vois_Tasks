Feature:Amazon Search Functionality
  Scenario:1
    Given user navigates to home page
    When user search for car accessories
    And user clicks on the search button
    And Select the first Item
    And  Add item to the cart
    And display cart page
    Then  Go to the cart and check that item is added successfully and greater than 0

  Scenario:2
    When Open today's deals
    And from the left side filters select grocery
    And from the discount part choose 10% off or more
    And go to the fourth page then select any item
    Then add filtered item to the cart