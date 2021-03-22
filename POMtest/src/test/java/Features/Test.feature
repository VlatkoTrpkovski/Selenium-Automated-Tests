Feature: Open page and login

  As a user I want to login on 'https://www.saucedemo.com/' page

  Scenario: Open page and login with available login details
    Given I navigate to 'https://www.saucedemo.com/'
    When I add username 'standard_user' and password 'secret_sauce'
    And Click on login button
    And I am logged in
    And I add item in card
    And I click on the menu button
    Then I logout