#Author
#Date
#Discription
@SmokeFeature
Feature: Test login functionality

@Smoketest
  Scenario: Check login is successful
    Given user is on login page
    When user entered username and password
    And clicks on login button
    Then user is navigated to home page
