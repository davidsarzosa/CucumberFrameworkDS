package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QualificationPageElements {

	@FindBy(xpath = "//div[@class='qulifications-add-button fixed-action-btn floating-add-btn']")
	public WebElement addQualificationsBtn;

	@FindBy(xpath = "//div[@class='qulifications-add-button fixed-action-btn floating-add-btn']//li")
	public WebElement workExpecienteBtn;

	@FindBy(xpath = "//input[@id='employer']")
	public WebElement Company;

	@FindBy(xpath = "//input[@id='jobtitle']")
	public WebElement jobTitle;
	
	@FindBy(xpath = "//div[@class='input-group-append']//button//div[]")
	public WebElement fromCalendar;

}
