Feature: Login
  @RegressionTest
  Scenario: Success login with valid credentials
    Given I am on the SauceDemo login page
    When I enter a valid username and password
    And I click the login button
    Then I should be redirected to the dashboard page



  Scenario: Invalid login with invalid credentials
    Given I am Logout
    When I enter a invalid username and password
    And I click the login button
    Then I see massage Invalid credentials
