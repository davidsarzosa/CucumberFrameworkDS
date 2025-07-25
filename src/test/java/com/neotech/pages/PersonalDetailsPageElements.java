package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.testbase.BaseClass;

public class PersonalDetailsPageElements {

	
	@FindBy(id = "firstName")
	public WebElement firstName;
	
	@FindBy(id = "employeeId")
	public WebElement employeeId;
	
	@FindBy(id = "pim.navbar.employeeName")
	public WebElement employeeFullName;
	
	@FindBy(id = "licenseNo")
	public WebElement driverLicense;
	
	@FindBy(xpath = "//label[text()='Smoker']")
	public WebElement smokerCheckbox;
	
	@FindBy(id = "emp_gender_inputfileddiv")
	public WebElement dropdownGender;
	
	@FindBy(xpath = "//div[@id=\"emp_gender_inputfileddiv\"]//input")
	public WebElement genderInput;
	
	
	
	
	
	public PersonalDetailsPageElements()
	{
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	
}
