Feature: Login Features
  This Feature deals with login functionality of the application

  Scenario: Login to site with correct username and password
    Given I navigate to the login page
    And  I enter the following  for Login
    |username| Password|
    |admin   |adminpassword|
    And I click to login button
    Then I click should see the userform page
