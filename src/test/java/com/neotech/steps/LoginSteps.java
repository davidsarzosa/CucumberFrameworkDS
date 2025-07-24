package com.neotech.steps;

import org.openqa.selenium.By;

import com.neotech.pages.DashboardPageElements;
import com.neotech.pages.LoginPageElements;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends CommonMethods {

	LoginPageElements login;
	DashboardPageElements dashboard;

	@Given("I open the HRM application")
	public void i_open_the_hrm_application() {
		setUp();

		login = new LoginPageElements();
		dashboard = new DashboardPageElements();
		

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
		click(login.loginBtn);
		
	}

	@Then("I should be redirected to the dashboard")
	public void i_should_be_redirected_to_the_dashboard() {
		String expected = "Jacqueline White";
		String actual = dashboard.accountName.getText();
		
		if(actual.equals(expected)) {
			System.out.println("Test successful. User is on the dashboard");
			
		}else {
			System.out.println("Test failed. User is not on the dashboard");
		}
		
	}
	
	@When("I enter invalid password")
	public void i_enter_invalid_password() {
		sendText(driver.findElement(By.id("txtPassword")), "Invalid Credentials");

	}

	@Then("I should see Invalid Credentials message")
	public void i_should_see_invalid_credentials_message() {
	   String expected = "Invalid Credentials";
	   String actual = login.invalidPassword.getText();
	   
	   if(expected.equals(actual)) {
		   System.out.println("Test successful. User is on the dashboard");
	   }else {
		   System.out.println("Test failed. User is not on the dashboard");
	   }
	}

	
	
	

	@Then("I quite the browser")
	public void i_quite_the_browser() {
		tearDown();
	}
}
