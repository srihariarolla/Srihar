Feature: Test google search functionality


  Scenario: google search working
    Given browser is open
    And user on google page
    When user enters a text in search box 
    And hits enter 
    Then user is navigated to search results