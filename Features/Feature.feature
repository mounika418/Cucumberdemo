Feature: Test Triangle testing app total functionality

  Scenario Outline: Smoke Testing
    Given Launch the URL in "<browser>"
    When Select the check box
    And Click Next button
    Then Navigate to Sign up page successfully
    When Enter Forename
    And Enter Surname
    And Select gender
    And Enter address in address lines
    And Enter City
    And Enter Postal code
    And Enter Telephone number
    And Select Country
    And Click Submit button
    Then Navigate to Flight booking page successfully
    When Select departure city
    And Select departure date
    And Select arrival city
    And Select return date
    And Enter number of passengers
    And Select round trip
    And Select seating preference
    And Select ticket type
    And Click Confirm button
    Then Navigate to Payment page successfully
    When Enter Credit card number
    And Enter name on card
    And Select expiry month
    And Select expiry year
    And Enter CVC number
    And Click Pay now button
    Then Payment was successful message should be displayed
    And Click Home button
    Then Navigate to Home page successfully
    
    Examples: 
    
    | browser | 
    |  FF |
    |  GC |
    |  IE |
    
    
