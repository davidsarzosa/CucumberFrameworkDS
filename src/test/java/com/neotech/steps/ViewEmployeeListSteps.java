package com.neotech.steps;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ViewEmployeeListSteps extends CommonMethods {

	String expectedName;

	@Given("User is logged into the application")
	public void user_is_logged_into_the_application() {
		loginPage.adminLogin();
	}

	@When("User navigates to PIM and clicks on Employee List")
	public void user_navigates_to_pim_and_clicks_on_employee_list() {

		click(dashboardPage.PIM);
		click(dashboardPage.empListLink);
		waitForVisibility(employeeListPage.empListPage);
	}

	@Then("User should see the Employee List page")
	public void user_should_see_the_employee_list_page() {

		String expectedURL="https://hrm.neotechacademy.com/client/#/pim/employees";
		String actualURL=driver.getCurrentUrl();
		
		Assert.assertEquals(expectedURL, actualURL);
		
		
	}

//	@Then("Employee List table should show {int} rows by default")
//	public void employee_list_table_should_show_rows_by_default(int defaultRowCount) {
//
//		String actualRows = employeeListPage.rowPerPage.getAttribute("value");
//		String expectedRows = String.valueOf(defaultRowCount);
//
//		Assert.assertEquals(actualRows, expectedRows);
//
//	}

//	@Then("Table should contain the following columns:")
//	public void table_should_contain_the_following_columns(DataTable headers) {
//
//		WebElement costCenter = driver
//				.findElement(By.xpath("//table[@id='employeeListTable']//th[normalize-space(text())='Cost Center']"));
//
//		waitForVisibility(costCenter);
//
//		List<String> expectedList = headers.asList();
//
//		List<String> actualList = new ArrayList<>();
//
//		for (int i = 1; i < employeeListPage.headerList.size(); i++) {
//			WebElement header = employeeListPage.headerList.get(i);
//
//			String str = header.getText();
//
//			if (str.contains("Namearrow_upward")) {
//
//				str = str.substring(0, 4);
//
//			}
//
//			actualList.add(str);
//
//		}

//		System.out.println("expected list: " + expectedList);
//		System.out.println("actual list: " + actualList);
//
//		// verify that expected and actual lists are equal
//		Assert.assertEquals(expectedList, actualList);
//	}

	@When("User clicks on any employee in the list")
	public void user_clicks_on_any_employee_in_the_list() {

		click(employeeListPage.empName);

		waitForVisibility(personalDetailsPage.firstName);
	}

	@Then("User should be navigated to the Personal Details page")
	public void user_should_be_navigated_to_the_personal_details_page() {
		
		String actualHeader=personalDetailsPage.personalDetailsHeader.getText();
		String expectedHeader="Personal Details";

		
		Assert.assertEquals(actualHeader, expectedHeader);

	}

//	@When("User enters employee name in the search bar")
//	public void user_enters_employee_name_in_the_search_bar() throws InterruptedException {
//
//		expectedName = employeeListPage.empName.getText();
//
//		sendText(employeeListPage.searchName, expectedName);
//		
//		waitForClickability(employeeListPage.searchIcon);
//		
//	}

//	@When("clicks on the search icon")
//	public void clicks_on_the_search_icon() {
//		
//		click(employeeListPage.searchIcon);
//		click(employeeListPage.name);
//
//	}

//	@Then("Employee should appear in the search results")
//	public void employee_should_appear_in_the_search_results() {
//
//		waitForVisibility(personalDetailsPage.empFullName);
//		
//		String fullName=personalDetailsPage.empFullName.getText();
//
//		Assert.assertEquals(expectedName,fullName );
//
//	}
//	
//	@When("User enter a non-existent user")
//	public void user_enter_a_non_existent_user() {
//		sendText(employeeListPage.searchName,"Monisha Mondal");
//		
//	    
//	}
//
//	@Then("We should see no records found")
//	public void we_should_see_no_records_found() {
//	
//	waitForVisibility(employeeListPage.errMsg);	
//	String expectedMessage=	employeeListPage.errMsg.getText();
//	String actualMessage= "No results found";
//	
//	Assert.assertEquals(expectedMessage,actualMessage );  
//	}


	
}
