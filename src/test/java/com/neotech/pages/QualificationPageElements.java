package com.neotech.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.testbase.BaseClass;

public class QualificationPageElements {

	@FindBy(xpath = "//div[@class='qulifications-add-button fixed-action-btn floating-add-btn']")
	public WebElement addQualificationsBtn;

	@FindBy(xpath = "//ul[@id='additem-options-dropdown-qualifications']//a[contains(text(),'Work Experience')]")
	public WebElement workExperienceBtn;

	@FindBy(xpath = "//h5[@class='modal-title']")
	public WebElement workExperienceTitle;

	@FindBy(partialLinkText = "Qualifications")
	public WebElement qualificationPageText;
	/////////////////////////////////
	/// Add Work Experience Elements
	// ///////////////////////////////
	@FindBy(xpath = "//input[@id='employer']")
	public WebElement Company;

	@FindBy(xpath = "//input[@id='jobtitle']")
	public WebElement jobTitle;

	@FindBy(xpath = "//label[@for='from_date']/following::button[@class='btn date-picker-button'][1]/i")
	public WebElement openCalendarIconFROM;

	@FindBy(xpath = "//div[@class='dropdown bootstrap-select picker__select--month']")
	public WebElement calendarMonthSelect;

	@FindBy(xpath = "//div[@class='dropdown bootstrap-select picker__select--month show']//option")
	public WebElement monthOptionFROM; // this potentially needs to be changed to List of WebElements if does not work

	@FindBy(xpath = "//div[@class='dropdown bootstrap-select picker__select--year']")
	public WebElement yearOptionFROM; // this potentially needs to be changed to List of WebElements if does not work

	@FindBy(xpath = "//div[@class='picker__day picker__day--infocus']")
	public WebElement dayOptionCalendarFROM;

	@FindBy(xpath = "//label[@for='from_date']/following::button[@class='btn date-picker-button'][2]/i")
	public WebElement openCalendarIconTO;

	@FindBy(xpath = "//div[contains(@class,'picker--opened')]//div[@class='picker__day picker__day--infocus' and text()='15']")
	public WebElement dayOptionCalendarTO15;

	@FindBy(id = "comments")
	public WebElement addWorkExperienceComments;

	@FindBy(xpath = "//label[@class='custom-control-label']")
	public WebElement creditableLabel;

	@FindBy(id = "modal-save-button")
	public WebElement addWorkExperienceSaveBtn;

	@FindBy(id = "//div[@class='toast-message']")
	public WebElement successfullyUpdateMessage;
	
	
/////////////////////////////////
/// Add Education Elements
// ///////////////////////////////
	
	@FindBy(xpath="//div[@class='filter-option-inner-inner']")
	public WebElement addEducationLevel;
	
	@FindBy(xpath = "//div[@class='dropdown-menu show']//li")
	public WebElement selectEducationLevel;
	
	@FindBy(xpath = "//input[@id='institute']")
	public WebElement addEducationInstitud;
	
	@FindBy(xpath = "//input[@id='major']")
	public WebElement addMajorSpecialization;
	
	@FindBy(xpath = "//input[@id='year']")
	public WebElement addYearSpecialization;
	
	@FindBy(xpath = "//input[@id='score']")
	public WebElement addScoreSpecialization;
	
	
	
	
	
	
	
	
	

	
	

	public QualificationPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}

}
