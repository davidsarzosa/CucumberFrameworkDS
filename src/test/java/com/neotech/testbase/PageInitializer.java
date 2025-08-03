package com.neotech.testbase;

import com.neotech.pages.AddEmployeePageElements;
import com.neotech.pages.DashboardPageElements;
import com.neotech.pages.EmployeeListPageElements;
import com.neotech.pages.LoginPageElements;
import com.neotech.pages.PersonalDetailsPageElements;
import com.neotech.pages.QualificationPageElements;

public class PageInitializer extends BaseClass {

	
	public static LoginPageElements loginPage;
	public static DashboardPageElements dashboardPage;
	public static AddEmployeePageElements addEmployeePage;
	public static PersonalDetailsPageElements personalDetailsPage;
	public static EmployeeListPageElements employeeListPage;
	public static QualificationPageElements qualificationPage;
	
	
	public static void initialize()
	{
		loginPage = new LoginPageElements();
		dashboardPage = new DashboardPageElements();
		addEmployeePage = new AddEmployeePageElements();
		personalDetailsPage = new PersonalDetailsPageElements();
		employeeListPage = new EmployeeListPageElements();
		qualificationPage = new QualificationPageElements();
	}

}
