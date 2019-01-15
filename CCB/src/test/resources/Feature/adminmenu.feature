Feature: Administrator Menu

Background: User is Logged In
	Given I navigate to the login page
	When I submit username and password
	Then I should be logged in
	
Scenario: Show Subscription Center after click on Menu
	When I click on subscription Center link
	Then I should see the Subscription Module 
	
Scenario: Show Elearning after click on Menu
	When I click on Elearning link
	Then I should see the Elearning Module