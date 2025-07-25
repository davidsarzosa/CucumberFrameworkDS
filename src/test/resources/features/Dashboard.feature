# Author: Neotech Academy

Feature: Dashboard Menu

	@menu	
	Scenario:
	#Hooks! will open the browser for us already 
	Given The user is logged in with valid credentials
	Then I want to validate the items in main menu 
		|Admin|
		|PIM|
		|My info|
		|Discipline|
		|Reports Catalog|
		|More|
		|Maintenance|
		
		
	
	 		
    