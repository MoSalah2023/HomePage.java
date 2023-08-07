Feature: User Registration

  Scenario: Verify that user can register using valid data
    Given user is in home page
    When user clicks on signup login button
    And enter his name
    And enter his email
    And clicks on signup button
    Then user is redirected to signup page

  Scenario: Verify that user can not register using already registered email
    Given user is in home page
    When user clicks on signup login button
    And enter his name
    And enter his already registered email
    And clicks on signup button
    Then error message should appear to the user

  Scenario: verify that user can not enter characters in mobile number field
    Given user opens register page
    When user enters char in mobile
    And clicks on register
    Then error message appears