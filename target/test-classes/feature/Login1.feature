Feature: Login Feature error message

  Scenario: Click on Login Button with out giving Credentials
    Given User is on Home Page
    When User Navigate to LogIn Page "http://localhost:8088/medicare/login"
    And Click on Login
    Then Verification of alert message
    And Close the Browser

  Scenario Outline: User Name Validation
    Given User is on Home Page
    When User Navigate to LogIn Page "http://localhost:8088/medicare/login"
    And User enters Email as "<email>" and Password as "<password>"
    And Click on Login
    Then Verification of alert message of invalid email address
    And Close the Browser

    Examples: 
      | email | password |
      | test  | test     |
