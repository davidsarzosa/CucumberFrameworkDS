package com.neotech.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearch {

	
	
	@Given("I open the Google homepage")
	public void i_open_the_google_homepage() {
		System.out.println("Opening Google homepage...");
	}

	@When("I type {string} into the search box")
	public void i_type_into_the_search_box(String string) {
		System.out.println("" + string + " typed into the search box.");
	}

	@When("I press the search button")
	public void i_press_the_search_button() {
		System.out.println("Search button pressed.");
	}

	@Then("I should see results related to {string}")
	public void i_should_see_results_related_to(String string) {
		System.out.println("" + string + " results displayed.");
	}

	@Then("I should see the number of results displayed")
	public void i_should_see_the_number_of_results_displayed() {
		System.out.println("Number of results displayed.");
	}

	@When("I say what I want to search for")
	public void i_say_what_i_want_to_search_for() {
		System.out.println("Saying what I want to search for...");
	}

	@Then("I should see the results of my search")
	public void i_should_see_the_results_of_my_search() {
		System.out.println("Results of my search displayed.");
	}
	
	@Then("I shloud see the number of results displayed")
	public void i_shloud_see_the_number_of_results_displayed() {
	    System.out.println("The number of results are displayed!");
	}
}
