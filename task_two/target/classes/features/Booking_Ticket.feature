Feature: Booking Ticket
  Scenario: Book a ticket from CHIKKAMAGALURU to BENGALURU
    When user Choose the Departure route from CHIKKAMAGALURU
    And user Choose the Destination route from BENGALURU
    And user Choose the arrival date only
    And Click Search for bus
    And Select a seat
    And Choose the boarding point
    And user choose dropping point
    And Fill the Customer
    And Fill Passenger details
    Then Click on make payment and fill all the fields without submitting the payment
