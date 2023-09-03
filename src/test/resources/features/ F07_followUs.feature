Feature: followUs links
  Scenario: user open facebook links
    Given user redirect to home page1
    And click on facebook button
    Then redirect facebook page success

  Scenario: user open twitter links
    Given user redirect to home page2
    And click on twitter button
    Then redirect twitter page success

  Scenario: user open rss links
    Given user redirect to home page3
    And click on rss button
    Then redirect rss page success



  Scenario: user open youtube links
    Given user redirect to home page4
    And click on youtube button
    Then redirect youtube page success

Scenario: Switch Browsers
  Scenario: user open facebook links
    Given user redirect to home page1
    And click on facebook button
    When redirect facebook page success
    Then switch between browsers

