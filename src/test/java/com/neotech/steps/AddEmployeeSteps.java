package com.neotech.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ExcelUtility;

import io.cucumber.datatable.DataTable;
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
		selectDropdown(addEmployeePage.location, "New York Sales Office");
	}

	@When("user clicks on save button")
	public void user_clicks_on_save_button() {
		wait(2);
		click(addEmployeePage.saveBtn);

	}

	@Then("validate that employee is added successfully")
	public void validate_that_employee_is_added_successfully() {

		// wait for the personal details to be visible
		waitForVisibility(personalDetailsPage.firstName);

		String expected = "Lionel Messi";
		String actual = personalDetailsPage.employeeFullName.getText();

		// Please make sure you are importing Assert class from org.junit package
		Assert.assertEquals("The employee name does NOT match!!!", expected, actual);
	}

	@When("user enters employee first name {string} and last name {string}")
	public void user_enters_employee_first_name_and_last_name(String firstName, String lastName) {
		sendText(addEmployeePage.firstName, firstName);
		sendText(addEmployeePage.lastName, lastName);
	}

	@Then("validate that employee {string} is added successfully")
	public void validate_that_employee_is_added_successfully(String expectedName) {
		waitForVisibility(personalDetailsPage.employeeFullName);

		String actualName = personalDetailsPage.employeeFullName.getText();
		Assert.assertEquals("The employee name does NOT match!!!", expectedName, actualName);
	}

	@When("user clicks on Create Login Details")
	public void user_clicks_on_create_login_details() {
		click(addEmployeePage.loginDetailsToggle);
	}

	@When("user provides credentials")
	public void user_provides_credentials() {
		sendText(addEmployeePage.username, "JohnDoe0001");
		sendText(addEmployeePage.password, "JohnDoe0001!@#");
		sendText(addEmployeePage.confirmPassword, "JohnDoe0001!@#");

	}

	// Extra practice: create another scenario where you send the username and
	// password as parameters

	@When("user enters employee {string}, {string}, and {string}")
	public void user_enters_employee_and(String firstName, String middleName, String lastName) {
		sendText(addEmployeePage.firstName, firstName);
		sendText(addEmployeePage.middleName, middleName);
		sendText(addEmployeePage.lastName, lastName);
	}

	@When("user selects a location {string}")
	public void user_selects_a_location(String location) {
		selectDropdown(addEmployeePage.location, location);
	}

	@Then("validate that employee {string} and {string} is added successfully")
	public void validate_that_employee_and_is_added_successfully(String firstName, String lastName) {
		waitForVisibility(personalDetailsPage.employeeFullName);

		String expectedName = firstName + " " + lastName;
		String actualName = personalDetailsPage.employeeFullName.getText();

		Assert.assertEquals("The employee name does NOT match!!!", expectedName, actualName);
	}

	@When("user enters employee details and clicks on save and validates it is added")
	public void user_enters_employee_details_and_clicks_on_save_and_validates_it_is_added(DataTable table) {
		// System.out.println(table);

		// table.asList() - a complete list including the header, would be messy to tell
		// where one employee starts and where it ends

		// get the first column as a list
		System.out.println("Table as list " + table.column(0));

		// System.out.println("Table as map " + table.asMap());

		System.out.println("Table as list of maps " + table.asMaps());

		// 1 map:
		// FirstName MiddleName LastName (keys)
		// John R. Doe (values)

		// another map:
		// FirstName MiddleName LastName (keys)
		// Jane H. Doe (values)

		List<Map<String, String>> employeeList = table.asMaps();

		// when using a datatable, we have to handle iterations in code...

		for (Map<String, String> employee : employeeList) {
			// add the first employee
			System.out.println("Employee: " + employee);

			String fName = employee.get("FirstName");
			String lName = employee.get("LastName");
			String mName = employee.get("MiddleName");

			sendText(addEmployeePage.firstName, fName);
			sendText(addEmployeePage.middleName, mName);
			sendText(addEmployeePage.lastName, lName);

			selectDropdown(addEmployeePage.location, "New York Sales Office");

			wait(2);

			click(addEmployeePage.saveBtn);

			waitForVisibility(personalDetailsPage.employeeFullName);

			String expectedName = fName + " " + lName;
			String actualName = personalDetailsPage.employeeFullName.getText();

			Assert.assertEquals("The employee name does NOT match!!!", expectedName, actualName);

			wait(1);

			click(dashboardPage.addEmployeeLink);
		}
	}
	// click on add employee again

	@When("user enters employee details from Excel file and saves it")
	public void user_enters_employee_details_from_excel_file_and_saves_it() {
		String path = System.getProperty("user.dir") + "/src/test/resources/testdata/Excel - EmployeeWithLocation.xlsx";

		List<Map<String, String>> employeeList = ExcelUtility.excelIntoListOfMaps(path, "Employee");

		// loop through the list of employees
		for (Map<String, String> employee : employeeList) {
			String fName = employee.get("FirstName");
			String lName = employee.get("LastName");
			String location = employee.get("Location");
			String username = employee.get("Username");
			String password = employee.get("Password");

			// enter the employee details
			sendText(addEmployeePage.firstName, fName);
			sendText(addEmployeePage.lastName, lName);
			selectDropdown(addEmployeePage.location, location);
			wait(2);
			click(addEmployeePage.loginDetailsToggle);
			sendText(addEmployeePage.username, username);
			sendText(addEmployeePage.password, password);
			sendText(addEmployeePage.confirmPassword, password);

			wait(2);
			click(addEmployeePage.saveBtn);

			waitForVisibility(personalDetailsPage.employeeFullName);

			// assert the employee name
			String expectedName = fName + " " + lName;
			String actualName = personalDetailsPage.employeeFullName.getText();

			Assert.assertEquals("The employee name does NOT match!!!", expectedName, actualName);

			// at this point, we have added the employee, so we can click on add employee
			// again
			wait(1);
			click(dashboardPage.addEmployeeLink);
			waitForVisibility(addEmployeePage.firstName);
		}
	}

}
