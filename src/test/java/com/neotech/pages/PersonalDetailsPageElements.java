package com.neotech.pages;

import java.util.List;

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

	@FindBy(xpath = "//div[@id='emp_gender_inputfileddiv']//li//span")
	public List<WebElement> genderOptions;

	@FindBy(xpath = "//div[@id='nation_code_inputfileddiv']//input")
	public WebElement nationalityInput;

	@FindBy(xpath = "//div[@id='nation_code_inputfileddiv']//li//span")
	public List<WebElement> nationalityOptions;

	@FindBy(id = "emp_dri_lice_exp_date")
	public WebElement driverLicenseExpirationDate;

	@FindBy(xpath = "//input[@id='emp_dri_lice_exp_date']/following-sibling::span[1]//i")
	public WebElement driverLicenseExpirationDateIcon;

	@FindBy(xpath = "//div[@class='select-wrapper picker__select--month']//input")
	public WebElement monthInput;

	@FindBy(xpath = "//div[@class='select-wrapper picker__select--month']//li/span")
	public List<WebElement> monthOptions;

	@FindBy(xpath = "//div[@class='select-wrapper picker__select--year']//input")
	public WebElement yearInput;

	@FindBy(xpath = "//div[@class='select-wrapper picker__select--year']//li/span")
	public List<WebElement> yearOptions;

	@FindBy(xpath = "//input[@id='emp_dri_lice_exp_date']/following-sibling::span[1]//table//tr/td")
	public List<WebElement> calendarDays;

	@FindBy(xpath = "//div[@id='personal_details_tab']//button[@type='submit']")
	public WebElement personalDetailsSaveBtn;

	@FindBy(id = "top-menu-trigger")
	public WebElement moreBtn;

	@FindBy(xpath = "//a[@class='truncate pim_employees_profile_qualifications']")
	public WebElement qualificationBtn;

	public PersonalDetailsPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}

}
