package com.neotech.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.neotech.pages.DashboardPageElements;
import com.neotech.pages.LoginPageElements;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends CommonMethods {

	

	@Given("I open the HRM application")
	public void i_open_the_hrm_application() {
		setUp();

		

	}

	@When("I enter valid username")
	public void i_enter_valid_username() {
		sendText(driver.findElement(By.id("txtUsername")), ConfigsReader.getProperty("username"));
	}

	@When("I enter valid password")
	public void i_enter_valid_password() {
		sendText(driver.findElement(By.id("txtPassword")), ConfigsReader.getProperty("password"));

	}

	@When("I click on the login button")
	public void i_click_on_the_login_button() {
		click(loginPage.loginBtn);

	}

	@Then("I should be redirected to the dashboard")
	public void i_should_be_redirected_to_the_dashboard() {
		String expected = "Jacqueline White";
		String actual = dashboardPage.accountName.getText();

		if (actual.equals(expected)) {
			System.out.println("Test successful. User is on the dashboard");

		} else {
			System.out.println("Test failed. User is not on the dashboard");
		}

	}
	
	@Then("I quit the browser")
	public void i_quite_the_browser() {
		tearDown();
	}

	@When("I enter invalid password")
	public void i_enter_invalid_password() {
		sendText(driver.findElement(By.id("txtPassword")), "Invalid Credentials");

	}

	@Then("I should see Invalid Credentials message")
	public void i_should_see_invalid_credentials_message() {
		String expected = "Invalid Credentials";
		String actual = loginPage.invalidPassword.getText();

		if (expected.equals(actual)) {
			System.out.println("Test successful. User is on the dashboard");
		} else {
			System.out.println("Test failed. User is not on the dashboard");
		}
	}

	@When("I enter a valid {string} and {string}")
	public void i_enter_a_valid_and(String username, String password) {

		sendText(loginPage.username, username);
		sendText(loginPage.password, password);

	}

	@Then("I verify that {string} is displayed")
	public void i_verify_that_is_displayed(String employeeName) {

		String actualName = dashboardPage.accountName.getText();

		Assert.assertEquals("The account name does not match! ", employeeName, actualName);

	}

	@When("the user enters a valid username and password and clicks the submit button")
	public void the_user_enters_a_valid_username_and_password_and_clicks_the_submit_button(DataTable users) {
		// What needs to be done:
		// For every row in users data table,
		// send the login credentials
		// click the login button
		// verify the employee name
		// logout

		// convert datatable into a list of maps object

		List<Map<String, String>> employeeList = users.asMaps();

		// now loop over the employee list and perform: login, verify, and logout

		for (Map<String, String> employee : employeeList) {
			String username = employee.get("username");
			String password = employee.get("password");
			String employeeName = employee.get("employeeName");

			// login
			sendText(loginPage.username, username);
			sendText(loginPage.password, password);

			// click the login button
			click(loginPage.loginBtn);
			wait(1);

			// verify
			String actualName = dashboardPage.accountName.getText();
			Assert.assertEquals("The account name does not match! ", employeeName, actualName);

			// logout
			click(dashboardPage.accountJob);
			click(dashboardPage.logout);
		}

	}

	
}
