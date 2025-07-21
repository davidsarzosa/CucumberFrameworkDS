package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.testbase.BaseClass;

public class EmployeeListPageElements {

	@FindBy(id = "employee_name_quick_filter_employee_list_value")
	public WebElement searchBox;
	
	@FindBy(id = "quick_search_icon")
	public WebElement searchIcon;
	
	
	// we do need PageFactory.initElement to initiate the elements
	// otherwise the elements will not be initialized!! 
	
	public EmployeeListPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
		
	}
	
	
	
	
	
	
	
	
}
