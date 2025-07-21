package com.neotech.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutlineSteps {
	
	@When("I login with {string} and {string}")
	public void i_login_with_and(String username, String password) {
	    System.out.println("Loggin in with " + username + "and " + password);
	}
	@When("Click on the login button")
	public void click_on_the_login_button() {
	   System.out.println("Validating username is displayed ");
	}
	@Then("Validate that {string} is displayed")
	public void validate_that_is_displayed(String fullName) {
	  System.out.println("Validate by " + fullName);
	}
	@Then("Print By {string} on the screen")
	public void print_by_on_the_screen(String string) {
	   
	}

}
