package com.stepdefinition;

import com.ObjectRepository.FlipkartPage;
import com.resources.FunctionalLibrary;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class flipkatsteps extends FunctionalLibrary {

	@Given("^I am on Flipkart Home page$")
	public void i_am_on_Flipkart_Home_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.get("https://www.flipkart.com");
	}

	@When("^I have printing the washing machine,Refigerators and Kitchen App$")
	public void i_have_printing_the_washing_machine_Refigerators_and_Kitchen_App() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		FlipkartPage kart = new FlipkartPage();
		mouseOver(kart.getAppliancesModule());
		kart.refrigertaorNames();
		kart.washing();
		kart.kitchenApp();
	}

	@Then("^I validate the Flipkart all Product$")
	public void i_validate_the_Flipkart_all_Product() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

}
