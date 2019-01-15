Feature: Manage the subscriber information
Background: User is Logged In
	Given I navigate to the login page
 	When I submit username and password
 	Then I should be logged in 
Scenario: Manage the subscriber information
		Given At the Backend page
		When I click link Dang ky nhan tin
		Then I should see list of Subscriber
		And  Email sorted by alphabet
		


		