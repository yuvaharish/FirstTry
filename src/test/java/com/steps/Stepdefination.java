package com.steps;

import org.junit.Assert;

import com.baseclass.BaseClass;
import com.pagefact.TravelPage;
import com.pagefact.pageFact;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefination extends BaseClass {
	@Given("Browser will open")
	public void browser_will_open() {
		System.out.println("BrowserOpend");	}
	@Given("I will land the {string}login page")
	public void i_will_land_the_https_opensource_demo_orangehrmlive_com_login_page(String url) {
		url(url);		}
	
	@When("I will enter the user {string} and {string}")
	public void i_will_enter_the_user_Admin_and_admin123(String name, String password) {
		if (driver.getTitle().equalsIgnoreCase("OrangeHRM")) {
			pageFact hrm = new pageFact();
			type(hrm.getUsername(), name);
			type(hrm.getPassword(), password);
			click(hrm.getLoginbutton());
		} else if (driver.getTitle().equalsIgnoreCase("Administator Login")) {
			TravelPage travel = new TravelPage();
			type(travel.getUsername(), name);
			type(travel.getPassword(), password);
			click(travel.getLoginbutton());		}	}
	
	@Then("I verify the login page {string}.")
	public void i_verify_the_login_page_Title(String Title) {
		String title = driver.getTitle();
		if (title.equalsIgnoreCase(Title)) {
			System.out.println(title);
			Assert.assertTrue(true);
		} else if (title.equalsIgnoreCase(Title)) {
			System.out.println(title);
			Assert.assertTrue(true);
		}
	}
}
