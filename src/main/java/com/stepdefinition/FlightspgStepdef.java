package com.stepdefinition;

import com.ObjectRepository.FlightsPag;
import com.resources.FunctionalLibrary;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FlightspgStepdef extends FunctionalLibrary {
	
	FlightsPag f=new FlightsPag();
	@Given("^i am in delta page$")
	public void i_am_in_delta_page() throws Throwable {
		driver.get("https://www.delta.com/");
	   
	}

	@When("^i want to click find flights in roundtrip$")
	public void i_want_to_click_find_flights_in_roundtrip() throws Throwable {
		
		setText(f.getLocatext(),"BHM");
		
		setText(f.getLocatex(),"YHZ");
//		click(f.getLocatsymbol());
//		click(f.getLocatsymb());
		click(f.getDateclick());
		click(f.getDate());
		click(f.getDateclic());
		click(f.getDat());
		click(f.getDownclick());
		
		click(f.getDrpdwnval());
		click(f.getSrchbtn());
		
		
	   
	}

	@When("^i want to delete flights has lowest price$")
	public void i_want_to_delete_flights_has_lowest_price() throws Throwable {
	    
	    
	}

	@Then("^I validate the outcomes$")
	public void i_validate_the_outcomes() throws Throwable {
	   
	    
	}

}