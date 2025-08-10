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

	}

	@Then("the Qualifications page should be displayed")
	public void the_qualifications_page_should_be_displayed() {
		String expected = "Qualifications";
		if (qualificationPage.qualificationValidation.getText().contains(expected)) {
			System.out.println("Qualification Page it's being displayed");
		}

	}

	@When("the admin clicks on the + icon")
	public void the_admin_clicks_on_the_icon() {

		waitForVisibility(qualificationPage.addQualificationsBtn);
		click(qualificationPage.addQualificationsBtn);

	}

	@When("selects Work Experience")
	public void selects_work_experience() {
		// waitForVisibility(qualificationPage.workExperienceBtn);
		click(qualificationPage.workExperienceBtn);
	}

	@Then("the Work Experience modal should be displayed")
	public void the_work_experience_modal_should_be_displayed() {
		String expected = "Add Work Experience";
		String actual = qualificationPage.workExperienceTitle.getText();

		Assert.assertEquals(expected, actual);
	}

	@When("the admin fills in valid work experience details and clicks Save")
	public void the_admin_fills_in_valid_work_experience_details_and_clicks_save() {

		sendText(qualificationPage.Company, "AltasCorp");

		sendText(qualificationPage.jobTitle, "CEO");
		click(qualificationPage.openCalendarIconFROM);
		// wait(2);
		click(qualificationPage.dayOptionCalendarFROM);
		selectDropdown(qualificationPage.dayOptionCalendarFROM, "5");
		click(qualificationPage.openCalendarIconTO);
		// wait(2);
		click(qualificationPage.dayOptionCalendarTO15);
		// wait(1);
		click(qualificationPage.creditableLabel);
		// wait(1);
		click(qualificationPage.addWorkExperienceComments);
		sendText(qualificationPage.addWorkExperienceComments, "TEST");
		// wait(2);
		click(qualificationPage.addWorkExperienceSaveBtn);
		// wait(2);

	}

	@Then("the new work experience should appear in the Work Experience table")
	public void the_new_work_experience_should_appear_in_the_work_experience_table() {
		String expected = "Company";
		String actual = qualificationPage.validationOnWorkTable.getText();
		wait(3);
		Assert.assertEquals("The work expecience is NOT Displayed!! ", expected, actual);
		

	}

	///////////////////////////////
	/// This steps are for Education
	///////////////////////////////

	@When("selects Education")
	public void selects_education() {
		waitForClickability(qualificationPage.educationBtn);
		click(qualificationPage.educationBtn);
	}

	@Then("the Add Education modal should be displayed")
	public void the_add_education_modal_should_be_displayed() {
		String expected = "Add Education";
		String actual = qualificationPage.workExperienceTitle.getText();

		Assert.assertEquals(expected, actual);
	}

	@When("the admin fills in valid education details and clicks Save")
	public void the_admin_fills_in_valid_education_details_and_clicks_save() {
		selectDropdown(qualificationPage.addEducationLevel, "Master's Degree");
		sendText(qualificationPage.addEducationInstitute, "Tarasa Shevshenko University");
		sendText(qualificationPage.addMajorSpecialization, "Literature");
		sendText(qualificationPage.addYearSpecialization, "2019");
		sendText(qualificationPage.addScoreSpecialization, "5");
		// missing the calendar FROM & TO
		click(qualificationPage.saveBtn);

	}

	@Then("the new education entry should appear in the Education table")
	public void the_new_education_entry_should_appear_in_the_education_table() {
		String expected = "Level";
		String actual = qualificationPage.validationOnEducationTable.getText();

		Assert.assertEquals("The new education is NOT Displayed!! ", expected, actual);
	}

///////////////////////////////
/// This steps are for Skill
///////////////////////////////

	@When("selects Skill")
	public void selects_skill() {
		waitForClickability(qualificationPage.skillsBtn);

	}

	@Then("the Add Skill modal should be displayed")
	public void the_add_skill_modal_should_be_displayed() {
		String expected = "Add Skill";
		String actual = qualificationPage.workExperienceTitle.getText();

		Assert.assertEquals(expected, actual);
	}

	@When("the admin fills in valid skill details and clicks Save")
	public void the_admin_fills_in_valid_skill_details_and_clicks_save() {
		selectDropdown(qualificationPage.addSkillButton, "Programming");
		sendText(qualificationPage.addSkillYearsofExperience, "10");
		sendText(qualificationPage.addSkillComments, "Hello QA JOB");
		click(qualificationPage.addSkillSaveBtn);

	}

	@Then("the new skill should appear in the Skills table")
	public void the_new_skill_should_appear_in_the_skills_table() {
		String expected = "Skill";
		String actual = qualificationPage.validationOnSkillTable.getText();

		Assert.assertEquals("The new Skill is NOT Displayed!! ", expected, actual);
	}

///////////////////////////////
/// This steps are for Language
///////////////////////////////

	@When("selects Language")
	public void selects_language() {
		waitForClickability(qualificationPage.languageBtn);
		// click(null);
	}

	@Then("the Add Language modal should be displayed")
	public void the_add_language_modal_should_be_displayed() {
		String expected = "Add Language";
		String actual = qualificationPage.workExperienceTitle.getText();

		Assert.assertEquals(expected, actual);
	}

	@When("the admin fills in valid language details and clicks Save")
	public void the_admin_fills_in_valid_language_details_and_clicks_save() {
		selectDropdown(qualificationPage.addLanguageOption, "Japanese");
		selectDropdown(qualificationPage.addLanguagePractice, "Speaking");
		selectDropdown(qualificationPage.addLanguageFluency, "Good");
		sendText(qualificationPage.addLanguageComments, "KONICHIGUA");
		click(qualificationPage.saveBtn);
	}

	@Then("the new language should appear in the Languages table")
	public void the_new_language_should_appear_in_the_languages_table() {
		String expected = "Language";
		String actual = qualificationPage.validationOnSkillTable.getText();

		Assert.assertEquals("The new Language is NOT Displayed!! ", expected, actual);
	}

///////////////////////////////
/// This steps are for License 
///////////////////////////////

	@When("selects License")
	public void selects_license() {
		waitForClickability(qualificationPage.licenceBtn);
		click(qualificationPage.licenceBtn);
	}

	@Then("the Add License modal should be displayed")
	public void the_add_license_modal_should_be_displayed() {
		String expected = "Add License";
		String actual = qualificationPage.workExperienceTitle.getText();

		Assert.assertEquals(expected, actual);

	}

	@When("the admin fills in valid license details and clicks Save")
	public void the_admin_fills_in_valid_license_details_and_clicks_save() {
		selectDropdown(qualificationPage.licenceType, "Social Work License");
		sendText(qualificationPage.licenseNumber, "TXDL34234");
		click(qualificationPage.saveBtn);

	}

	@Then("the new license should appear in the License table")
	public void the_new_license_should_appear_in_the_license_table() {

		String expected = "License Type";
		String actual = qualificationPage.validationOnSkillTable.getText();

		Assert.assertEquals("The new Licence is NOT Displayed!! ", expected, actual);
	}

}
