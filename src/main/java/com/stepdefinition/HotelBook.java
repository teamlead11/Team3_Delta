package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
		click(h.gethotelbook());
         h.SetTextInput(h.getTxtSearch(), "Atlanta");
         //driver.findElement(By.xpath("//a[@id='book-hotel-content-trigger']")).click();
		  //WebElement element = driver.findElement(By.id("hotelLocation"));
	      //element.sendKeys("Iowa");
	      //Select o = new Select(element);
		  //o.selectByIndex(0);
	}

	@When("^I enter the input for booking hotel$")
	public void i_enter_the_input_for_booking_hotel() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Hotel h = new Hotel();
		//setText(h.getChkInDate(),"02/10/2018");
		//setText(h.getChkOutDate(),"02/22/2018");
		driver.findElement(By.xpath("//input[@name='checkInDate']")).sendKeys("02/10/2018");
	    driver.findElement(By.xpath("//input[@name='checkOutDate']")).sendKeys("02/22/2018");
		driver.findElement(By.xpath("(//button[@id='hotelTripSubmit'])[1]")).click();
		
	}

	@When("^I filter hotel based on star rating$")
	public void i_filter_hotel_based_on_star_rating() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 Hotel h = new Hotel();
		 
	}

	@When("^I filter hotel based on food availability$")
	public void i_filter_hotel_based_on_food_availability() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   Hotel h = new Hotel();
	   click(h.getBreakfast());
	}

	@When("^I filter hotel based on Pool availability$")
	public void i_filter_hotel_based_on_Pool_availability() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Hotel h = new Hotel();
		click(h.getPool());
	}

}

