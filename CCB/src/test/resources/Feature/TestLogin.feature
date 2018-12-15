Feature: login
Scenario: show Tooltip messenger for invalid value provided for user
    Given I am staying login page
    When input I give invalid username and blank value for password
    And I do login
    Then I should see the error tooltip "Hãy nhập E-mail ở định dạng: user@email.com"
    And "Mật khẩu chỉ nhận giá trị chữ và số" place password