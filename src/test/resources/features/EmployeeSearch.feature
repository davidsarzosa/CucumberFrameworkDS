@EmloyeeSearch
Feature: Search Employee	

	@smoke 
	Scenario: Search by ID
	Given The user is logged in with valid credentials
	And The user navigates to the Employee List page
	When The user enters a valid employee Id
	And Clicks the search button 
	Then The employee details are displayed 
	
	 @smoke @regression  
     Scenario: Search by Name
     	Given The user is logged in with valid credentials
	    And The user navigates to the Employee List page
	    When The user enters a valid employee name
	    And Clicks the search button
        Then The employee details are displayed
	 
