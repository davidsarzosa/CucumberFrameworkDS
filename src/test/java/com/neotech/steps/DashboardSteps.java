package com.neotech.steps;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;

public class DashboardSteps extends CommonMethods {

	@Then("I want to validate the items in main menu")
	public void i_want_to_validate_the_items_in_main_menu(DataTable menuItems) {

		List<String> expectedList = menuItems  .asList();
		List<String> actualList = new ArrayList<>();
		
		// close the more menu 
		click(dashboardPage.moreMenu);
		wait(3);
		 			
		for(WebElement el : dashboardPage.menuList) {
			actualList.add(el.getText());
		}
		
		System.out.println("Expected list:" + expectedList);
		System.out.println("actual list: " + actualList);
		
		
		// verify that expected and actual lists are equal 
		Assert.assertEquals(expectedList, actualList);
		
	}

}
