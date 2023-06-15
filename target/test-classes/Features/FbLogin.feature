Feature: Validation of Facebook Web Application

  Scenario: TC_001 Validation of login page with valid credentials
    Given User is on Login page
    When User enters valid username and password
    And User clicks on Login button
    Then User verifies home page is displayed

  Scenario Outline: TC__002  Validation of login page with invalid credentials
    Given User is on Login page
    When User enters invalid "<username>" and "<password>"
    And User clicks on Login button
    Then User verifies error message is displayed

    Examples: 
      | username   | password        |
      | testing123 | 123testing    |
      | chennai007 | 1234Testing     |
      | vijayawada | testingPass123 |
