Feature:  user login
  Scenario: Verify that user can register using valid data
    Given redirect home page
    When click on login button
    And enter valid email
    And enter valid password
    And press on login button
   Then user is login success



    Scenario: user could login with invalid email and password
      Given redirect home page
      When click on login button
      And enter invalid email
      And enter valid password
      And press on login button
    Then error message should appear to the user


