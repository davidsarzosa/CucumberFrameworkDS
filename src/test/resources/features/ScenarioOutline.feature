Feature: Scenario Outline Example 
	@outline
	Scenario Outline:
		When I login with "<username>" and "<password>"
		And Click on the login button 
		Then Validate that "<username>" is displayed 
		And Print By "<fullName>" on the screen 
		
		Examples:
		| username | password | fullName | 
		| sofia | sopita123 | Sofia A  | 
		| joost | jost123| Joost A  | 
		| David| davida123| David A  | 