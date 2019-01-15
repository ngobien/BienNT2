Feature: Register

Scenario: Show form after input valid mail
		Given I am staying at testmaster.vn
		When I give the valid email 
		And I do login
		Then I should see the form other
		
Scenario: Show message after input invalid name
		Given I am staying at testmaster.vn
		When I give the valid email 
		And I do login
		Then I should see the form other
		When I give the invalid name 
		Then I should see invalid message
Scenario: Show message after input valid name
		Given I am staying at testmaster.vn
		When I give the valid email 
		And I do login
		Then I should see the form other
		When I give the valid name
		Then I should see success