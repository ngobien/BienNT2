Feature: login
Scenario: show messenger Request input user
    Given stay in login
    When not enter user and pass
    And click login
   	Then show messenger "Bạn chưa nhập tên đăng nhập"
   	
Scenario:  show messenger Request input pass
    Given stay in login
    When valid user and not pass
    And click login
   	Then show messenger pass "Bạn chưa nhập mật khẩu"

Scenario:  show announce when valid user and invalid pass
    Given stay in login
    When input valid user and invalid pass
    And click login
   	Then show messenger invalid "Tên đăng nhập hoặc mật khẩu không đúng"
   	
Scenario: login homepage when valid user and valid pass
    Given stay in login
    When input valid user and valid pass
    And click login
   	Then show homepage