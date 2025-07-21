package com.neotech.steps;

import org.junit.Assert;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddEmployeeSteps extends CommonMethods {
	
	
	@Given("user navigates to AddEmployee page")
	public void user_navigates_to_add_employee_page() {
	   click(dashboardPage.PIM);
	   click(dashboardPage.addEmployeeLink);
	}
	@When("user enters employee first name and last name")
	public void user_enters_employee_first_name_and_last_name() {
	  sendText(addEmployeePage.firstName, "Lionel");
	  sendText(addEmployeePage.lastName, "Messi");
	}
	@When("user selects a location")
	public void user_selects_a_location() {
	selectDropdown(addEmployeePage.location, "New York Sales Ofiice");   
	}
	
	@When("user clicks on save button")
	public void user_clicks_on_save_button() {
	  wait(2);
	  click(addEmployeePage.saveBtn);
	}
	@Then("validate that employee is added successfully")
	public void validate_that_employee_is_added_successfully() {
	   waitForVisibility(personalDetailsPage.firstName);
	   String expected = "Lionel Messi";
	   String actual = personalDetailsPage.employeeFullname.getText();
	   
	   Assert.assertEquals(expected, actual, "The employee name does NOT match");
	   
	}
	
	
	@When("user enters employee first name {string} and last name {string}")
	public void user_enters_employee_first_name_and_last_name(String firstName, String lastName) {
	   
		sendText(addEmployeePage.firstName, firstName);
		sendText(addEmployeePage.lastName, lastName);
	}
	
	@Then("validate that employee {string} is added successfully")
	public void validate_that_employee_is_added_successfully(String expectedName) {
	   waitForVisibility(personalDetailsPage.employeeFullname);
	   
	   String actualName = personalDetailsPage.employeeFullname.getText();
	   
	   
	}

}
