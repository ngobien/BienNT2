Feature: Login

  Scenario: Show message for invalid case
    Given I am staying at testmaster.vn/Admin
    When I give the invalid email
    And I do login backend
    Then The correspond messages is showed for invalid case.

  Scenario: •	The Backend is showed for valid credential.
    Given I am staying at testmaster.vn/Admin
    When I give the valid email/password
    And I do login backend
    Then I should see the Backend page
    
