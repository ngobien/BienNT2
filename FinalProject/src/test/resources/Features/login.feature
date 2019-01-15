Feature: Login

Background: User is Logged In
	Given I navigate to the login page
 	When I submit username and password
 	Then I should be logged in
