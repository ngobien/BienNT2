Feature: Create News
Background: User is Logged In
	Given I navigate to the login page
 	When I submit username and password
 	Then I should be logged in 
Scenario: Check Group, Name, Subject and Body are mandatory information
		Given At the Backend page
		When I click link soan gui tin
		When I click next button 
		Then I should see the messages required fields
Scenario: add the merge tag
		Given At the Backend page
		When I click link soan gui tin
		When I type E character
		Then I should see the Email in list
		When I select Email from list
		Then The content will be restored as plan text

		