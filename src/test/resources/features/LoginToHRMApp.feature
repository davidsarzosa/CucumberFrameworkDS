@login
Feature: Login Functionality

    @regression
	Scenario: Valid login to HRM
	    #Given I open the HRM application
        When I enter valid username
        And I enter valid password
        And I click on the login button
        Then I should be redirected to the dashboard
        #And I quit the browser
        
      
    @smoke @sprint4
    Scenario: Invalid login to HRM
          #Given I open the HRM application
          When I enter valid username
          And I enter invalid password
          And I click on the login button
          Then I should see Invalid Credentials message
          #And I quit the browser	
          
     @HW3_1
     Scenario Outline:
		When I enter a valid "<username>" and "<password>"
		And I click on the login button
		Then I verify that "<employeeName>" is displayed
	
	 Examples:
		|username | password | employeeName |
		|admin | Neotech@123 | Jacqueline White |
		|monishamondal | Monisha@123 | Monisha Mondal |
		
	
	@HW3_2
	Scenario:
		When the user enters a valid username and password and clicks the submit button
			|username | password | employeeName |
			|admin | Neotech@123 | Jacqueline White |
			|DavidS | DavidS@123 | David Sarzosa |
			#	|monishamondal | Monisha@123 | Monisha Mondal |
			|Adrian007 | Patico@123 | Adrian Espinosa |
					
		
	
	
	
	
	
	
	

