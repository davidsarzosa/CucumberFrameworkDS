# Author: Neotech Academy

Feature: Add Employee Feature
	I want to test the Add Employee functionality
	
	
	Background:
		Given The user is logged in with valid credentials
	    And user navigates to AddEmployee page
	
	@AddEmployee
  Scenario: Add Employee with first and last name
    When user enters employee first name and last name
    And user selects a location
    And user clicks on save button
    Then validate that employee is added successfully
    
    
    
    @task
  Scenario: Add Employee with parameterized first and last name
    When user enters employee first name "Cristiano" and last name "Ronaldo"
    And user selects a location
    And user clicks on save button
    Then validate that employee "Cristiano Ronaldo" is added successfully
    
    
     @third
  Scenario: Add Employee and create login Credentials  
    When user enters employee first name "John" and last name "Doe"
    And user selects a location
    And user clicks on Create Login Details
    And user provides credentials
    And user clicks on save button
    Then validate that employee "John Doe" is added successfully
    
    @scenarioOutline
  Scenario Outline: Adding multiple employees with Scenario Outline
  	When user enters employee "<FirstName>", "<MiddleName>", and "<LastName>"
    And user selects a location "<Location>"
    And user clicks on save button
    Then validate that employee "<FirstName>" and "<LastName>" is added successfully

    Examples:
	|FirstName	|MiddleName	|LastName	|Location							|
	|John	 	|R.			|Doe		|New York Sales Office				|
	|Jane		|H.			|Doe		|Chinese Development Center			|
	|Jack 		|B.			|Doe		|South African Development Center	| 		
	
	
	@usingDataTable
	Scenario: Adding multiple employees with DataTable
	 	When user enters employee details and clicks on save and validates it is added
	 		|FirstName	|MiddleName	|LastName	|
	 		|John 		|R.			|Doe		|
	 		|Jane		|H.			|Doe		|
	 		|Jack		|B.			|Doe		|
	 		
	 @excelScenario
	 Scenario: Adding multiple employees with Excel file
	 When user enters employee details from Excel file and saves it 
	 
    