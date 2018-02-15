package com.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class Hotel {
	
	@FindBy(xpath = "//a[@id='book-hotel-content-trigger']")
	private WebElement Hotelbook;
	
	
	@FindBy(id="hotelLocation")
	private WebElement txtSearch;
	
	@FindBy(xpath = "//input[@name='checkInDate']")
	private WebElement chkindate;
	
	@FindBy(xpath = "//input[@name='checkOutDate']")
	private WebElement chkoutdate;
	
	@FindBy(xpath = "//span[@id='numberOfRoomsWidget-button']")
	private WebElement room;
	
	@FindBy(xpath = "//span[@id='numberOfAdultsWidget-button']")
	private WebElement adult;
	
	@FindBy(xpath = "//span[@id='numberOfChildrenWidget-button']")
	private WebElement childern;
	
	@FindBy(xpath = "//button[@id='hotelTripSubmit']")
	private WebElement btnsubmit;
	
	@FindBy(linkText =  "Free Breakfast")
	private WebElement clkbreakfast;
	
	@FindBy(linkText =  "Pool")
	private WebElement pool;

	@FindBy(id =  "f-star-rating-4")
	private WebElement fourstar;
	
	@FindBy(id =  "f-star-rating-3")
	private WebElement threestar;
	
	@FindBy(id =  "f-star-rating-2")
	private WebElement twostar;
	
	@FindBy(id =  "f-star-rating-1")
	private WebElement onestar;
	
	
	public WebElement gethotelbook() { 
		return Hotelbook;
	}

	public WebElement getTxtSearch() {
		return txtSearch;
	}
	
	public WebElement getChkInDate() {
		return chkindate;
	}
	
	public WebElement getChkOutDate() {
		return chkoutdate;
	}
	
	public WebElement getBtnSubmit() {
		return btnsubmit;
	}
	
	public WebElement getBreakfast() {
		return clkbreakfast;
	}
	
	public WebElement getPool() {
		return pool;
	}
	
	public WebElement getFour() {
		return fourstar;
	}
	
	public WebElement getThree() {
		return threestar;
	}
	
	public WebElement getTwo() {
		return twostar;
	}
	
	public WebElement getOne() {
		return onestar;
	}
	
	
	public Hotel() {
		PageFactory.initElements(FunctionalLibrary.driver, this);
	}

	
	public void Clickopt(WebElement element) {

			

	}
	
	public void SetTextInput(WebElement element,String Value) {
    element.sendKeys(Value);
	}

}
