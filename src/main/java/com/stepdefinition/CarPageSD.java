package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.ObjectRepository.carPage;
import com.resources.FunctionalLibrary;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class CarPageSD extends FunctionalLibrary {
	@Given("^I am on car home page$")
	public void i_am_on_car_home_page() throws Throwable {

		driver.get("https://www.delta.com/");
	}

	@When("^I have check for all fields car page$")
	public void i_have_check_for_all_fields_car_page() throws Throwable {
		carPage car = new carPage();
		click(car.getbtncarpage());
		setText(car.getTxtcarLocation(), "ATLANTA");
		setText(car.getTxtpickUpWidgetDate(), "03/06/2018");
		setText(car.getTxtdropOffWidgetDate(), "07/06/2018");
		click(car.getbtnckbanner());
		car.PickupTime("11:00 AM");
		car.dropOffTime("12:00 PM");
		car.CustomerAge("25+");
		click(car.getbtnBookCar());
		car.SelectCarPrices("19");

	}

	@Then("^I validate car home page$")
	public void i_validate_car_home_page() throws Throwable {
		carPage car = new carPage();

		if (car.getCarDetails().getText().equals(car.getCarDetails())) {
			System.out.println("valid :" );
		} else {
			System.out.println("invalid :" );
		}
	}

}
