@backround 
Feature: Backround keyword exammples

Background:
Given Precondition1 
And Precondition2 

Scenario: Example1 
When Test Step1 with first name "Joost van der " and last name "Wagt"
And Test Step2 
Then Validation Step1 
And Validation Step2 

@smoke @sprint5 @sanity
Scenario: Example2 
When Test Step3
And Test Step4 
Then Validation Step3 
And Validation Step4
 
 
 # Order of Executrion ----- 
 # Hooks --> @ Before 
 # Background Steps 
 # Scenario: Example1 
 # Hooks --> @After 
 # ----------------------------
 # Hooks --> @Before 
 # Background Steps 
 # Scenatio : Exampl2 
 # Hooks -- > @After 
 
 
 
 
 
 
 
 
 
 
