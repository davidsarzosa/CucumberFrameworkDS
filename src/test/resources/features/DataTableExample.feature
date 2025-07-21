Feature: Data Table Example 
	
	@dataTable
	Scenario: Add employees using DataTable 
		When I login to the HRM website
		And I want to add new employees 
			| FirstName | LastName | Position | 
			| Ana | Thurman | General Manager | 
			| Sofia | Avramidou | QA Teter | 
			| Adrian | Espinosa | Mechanic Engenieer| 
			
		Then I validate that the employee is added 
		
			
		Examples:
		| username | password | fullName | 
		| sofia | sopita123 | Sofia A  | 
		| joost | jost123| Joost A  | 
		| David| davida123| David A  | 
		
		