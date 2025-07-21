#Author: Neotech Academy 

	Background:
	Given The user is logged in with valid credentials
    And user navigates to AddEmployee page
	

Feature: AddEmployee Feature 
	I want to test the Add Employee functionality 
	
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
    
    