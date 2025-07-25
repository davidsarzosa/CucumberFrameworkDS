package com.neotech.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.testbase.BaseClass;

public class DashboardPageElements {

	@FindBy(id = "account-name")
	public WebElement accountName;
	
	@FindBy(id ="account-job")
	public WebElement accountJob;
	
	@FindBy(id = "menu_pim_viewPimModule")
	public WebElement PIM;
	
	@FindBy(linkText = "Add Employee")
	public WebElement addEmployeeLink;
	
	@FindBy(id = "menu_pim_viewEmployeeList")
	public WebElement employeeListLink;
	
	@FindBy(id = "toast-message")
	public WebElement invalidCredentials;
	
	@FindBy(id = "logoutLink")
	public WebElement logout;
	
	@FindBy(xpath="//div[@id='menu-content']/ul/li")
	public List<WebElement> menuList;
	
	@FindBy(id = "menu_news_More")
	public WebElement moreMenu;
	
	
	
	public DashboardPageElements()
	{
		PageFactory.initElements(BaseClass.driver, this);
	}
}
