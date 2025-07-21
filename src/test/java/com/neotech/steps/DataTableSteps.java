package com.neotech.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTableSteps {
	
	@When("I login to the HRM website")
	public void i_login_to_the_hrm_website() {
	   System.out.println("I login here .... ");
	   
	}
	@When("I want to add new employees")
	public void i_want_to_add_new_employees(DataTable employees) { // in a format of data table 
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
		
		
		
		
	   
	}
	@Then("I validate that the employee is added")
	public void i_validate_that_the_employee_is_added() {
	    
	}

}
