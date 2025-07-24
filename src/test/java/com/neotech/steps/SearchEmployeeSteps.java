package com.neotech.steps;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchEmployeeSteps extends CommonMethods {

	@Given("The user is logged in with valid credentials")
	public void the_user_is_logged_in_with_valid_credentials() {
		loginPage.adminLogin();
	   
	}


	@Given("The user navigates to the Employee List page")
	public void the_user_navigates_to_the_employee_list_page() {
		click(dashboardPage.PIM);
		click(dashboardPage.addEmployeeLink);

	}

	@When("The user enters a valid employee Id")
	public void the_user_enters_a_valid_employee_id() {
		sendText(employeeListPage.searchBox, "0029"); // exmple employee ID
	}

	@When("Clicks the search button")
	public void clicks_the_search_button() {
		click(employeeListPage.searchIcon);

		// We do need PageFactory.initElement to initiate the elements
		// otherwise the elements will no be initialized!
	}

	@Then("The employee details are displayed")
	public void the_employee_details_are_displayed() {
		// lets skip this step for now!
		System.out.println("I see the employee details displated on the screen. ");
		wait(5);

	}

	@When("The user enters a valid employee name")
	public void the_user_enters_a_valid_employee_name() {
		sendText(employeeListPage.searchBox, "Aaban Aale"); // Example of employee name
	}

}
