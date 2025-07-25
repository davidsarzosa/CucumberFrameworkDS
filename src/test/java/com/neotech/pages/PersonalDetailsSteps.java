package com.neotech.pages;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Then;

public class PersonalDetailsSteps extends CommonMethods {

	@Then("I am able to modify Employee Details {string}, {string}, {string}, {string}, {string}")
	public void i_am_able_to_modify_employee_details(String driverLicense, String expirationDate, String smoker,
			String gender, String nationality) {

		waitForVisibility(personalDetailsPage.firstName);
		// Enter the dirver License
		sendText(personalDetailsPage.driverLicense, driverLicense);

		// click on the smoker checkbox if the value is "YES"
		if (smoker.equalsIgnoreCase("Yes")) {
			click(personalDetailsPage.smokerCheckbox);
		}

		// This is for gender
		click(personalDetailsPage.dropdownGender);

		// Now we need to input the correct gender, this will work because is an input
		// but this will depends on the case

	}

	@Then("I click on Personal Details Save")
	public void i_click_on_personal_details_save() {

	}

}
