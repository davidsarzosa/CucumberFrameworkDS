#Author David 

Feature: Add Qualifications Page
	
	
	Scenario: Qualifications Page validation
	Given The user is logged in with valid credentials
	And user navigates to MyInfo button
	Then user navvigates More Dropdown
	And  user navigate to Qualifications option 
	Then user click add qualification button 
	And user click work experience option
	Then user add requierd Work Experience 
	And click save button  
	Then information should be displayed on the Work Experience table
	
	
	
	
	
	
 

 
 
 
 