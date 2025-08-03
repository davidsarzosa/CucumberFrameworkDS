package com.neotech.steps;

import org.junit.Assert;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddQualificationSteps extends CommonMethods {

	@When("the admin expands the More dropdown")
	public void the_admin_expands_the_more_dropdown() {
		click(personalDetailsPage.moreBtn);

	}

	@When("selects the Qualifications option")
	public void selects_the_qualifications_option() {
		click(personalDetailsPage.qualificationBtn);
		wait(4);
	}

	@Then("the Qualifications page should be displayed")
	public void the_qualifications_page_should_be_displayed() {
		
		String expected = "Qualifications";
		String actual = qualificationPage.qualificationPageText.getText();
		System.out.println(actual);
		Assert.assertNotEquals(expected,actual);
		
	}
	
	@When("the admin clicks on the + icon")
	public void the_admin_clicks_on_the_icon() {
		
		waitForVisibility(qualificationPage.addQualificationsBtn);
		click(qualificationPage.addQualificationsBtn);
		
	}
	@When("selects Work Experience")
	public void selects_work_experience() {
		waitForVisibility(qualificationPage.workExperienceBtn);
	    click(qualificationPage.workExperienceBtn);
	}
	@Then("the Work Experience modal should be displayed")
	public void the_work_experience_modal_should_be_displayed() {
		String expected = "Add Work Experience";
		String actual = qualificationPage.workExperienceTitle.getText();
		
		Assert.assertEquals(expected,actual);
	}
	@When("the admin fills in valid work experience details and clicks Save")
	public void the_admin_fills_in_valid_work_experience_details_and_clicks_save() {
	    
		sendText(qualificationPage.Company, "AltasCorp");
		sendText(qualificationPage.jobTitle, "CEO");
		click(qualificationPage.openCalendarIcon);
		wait(2);
		click(qualificationPage.calendarInputWorkExperieceFROM);
		selectDropdown(qualificationPage.monthOption, "September");
		wait(2);
		click(qualificationPage.yearOption);
		selectDropdown(qualificationPage.yearOption, "2024");
		wait(2);
		click(qualificationPage.dayOption);
		selectDropdown(qualificationPage.dayOption, "5");
		
		
		

		
	    
	    
	    
	}
	@Then("the new work experience should appear in the Work Experience table")
	public void the_new_work_experience_should_appear_in_the_work_experience_table() {
	    
	}

}
