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
	public WebElement  qualificationPageText;
	// 
	// Add Work Experience Elements -------------------------------------------------------- 
	//
	@FindBy(xpath = "//input[@id='employer']")
	public WebElement Company;

	@FindBy(xpath = "//input[@id='jobtitle']")
	public WebElement jobTitle;

	@FindBy(xpath = "//label[@for='from_date']/following::button[@class='btn date-picker-button'][1]/i")
	public WebElement openCalendarIcon;
	
	@FindBy(xpath = "//div[@class='dropdown bootstrap-select picker__select--month']")
	public WebElement calendarInputWorkExperieceFROM;
	
	@FindBy(xpath = "//div[@class='dropdown bootstrap-select picker__select--month show']//option")
	public WebElement monthOption; // this potentially needs to be changed to List of WebElements if does not work 
	
	@FindBy(xpath = "//div[@class='dropdown bootstrap-select picker__select--year']")
	public WebElement yearOption; // this potentially needs to be changed to List of WebElements if does not work 
	
	@FindBy(xpath = "//div[@class='picker__day picker__day--infocus']")
	public WebElement dayOption;
	
	
	
	
	
	
	
	
	
	
	

	
	
	public QualificationPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
}
