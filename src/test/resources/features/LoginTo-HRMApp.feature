Feature: Login Functionality 

Scenario: Valid login to HRM 
Given I open the HRM application  
When I enter valid username 
And I enter valid password 
And I click on the login button 
Then I should be redirected to the dashboard   
Then I quite the browser 


Scenario: Invalid login to HRM
          Given I open the HRM application
          When I enter valid username
          And I enter invalid password
          And I click on the login button
          Then I should see Invalid Credentials message
         Then I quite the browser	


