package com.stepdefinition;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.ObjectRepository.Hotel;
import com.resources.FunctionalLibrary;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class HotelBook extends FunctionalLibrary {

	
	@Given("^I am in delta page$")
	public void i_am_in_delta_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  driver.get("https://www.delta.com/");
	}

	@When("^I select hotel booking module in book a trip module$")
	public void i_select_hotel_booking_module_in_book_a_trip_module() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   Hotel h = new Hotel();
	   click(h. gethotelbook());
	  
	}

	@When("^I enter the input for booking hotel$")
	public void i_enter_the_input_for_booking_hotel() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Hotel v = new Hotel();
		 setText(v.getTxtSearch(), "ATL");
		 setText(v.getChkInDate(), "05/02/2018");
		 setText(v.getChkOutDate(), "10/02/2018");
		 
		 
	}
}