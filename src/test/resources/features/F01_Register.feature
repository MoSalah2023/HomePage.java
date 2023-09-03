Feature: user registration

  Scenario: User can navigate to home page
    Given user can navigate to home page
    When  clicks on register button
    And select gender
    And enter first name
    And enter last name
    And enter date of birth
    And enter email
    And enter passwords
    When click on register button
    Then success message will appear
