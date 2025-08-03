#Author David 


	
  Feature: Admin Add employee Qualifications
  
  @qualifications
  Scenario: Admin select any employee and manage qualification entries
    Given User is logged into the application
    When User navigates to PIM and clicks on Employee List
    And User clicks on any employee in the list 
    Then User should be navigated to the Personal Details page
    When the admin expands the More dropdown
    And selects the Qualifications option
    Then the Qualifications page should be displayed

  # Work Experience
  When the admin clicks on the + icon
  And selects Work Experience
  Then the Work Experience modal should be displayed
  When the admin fills in valid work experience details and clicks Save
  Then the new work experience should appear in the Work Experience table
	
	
 

 
 
 
 