package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.testbase.BaseClass;

public class DashboardPageElements {

	@FindBy(id = "account-name")
	public WebElement accountName;
	
	@FindBy(id = "menu_pim_viewPimModule")
	public WebElement PIM;
	
	@FindBy(linkText = "Add Employee")
	public WebElement addEmployeeLink;
	
	@FindBy(id = "toast-message")
	public WebElement invalidCredentials;
	
	
	
	public DashboardPageElements()
	{
		PageFactory.initElements(BaseClass.driver, this);
	}
}
