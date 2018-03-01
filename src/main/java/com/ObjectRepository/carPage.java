package com.ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class carPage extends FunctionalLibrary {

	@FindBy(id = "book-car-content-tab")
	private WebElement btncarpage;

	@FindBy(id = "carLocation")
	private WebElement txtcarLocation;

	@FindBy(id = "pickUpWidgetDate")
	private WebElement txtpickUpWidgetDate;

	@FindBy(id = "dropOffWidgetDate")
	private WebElement txtdropOffWidgetDate;

	@FindBy(id = "pickUpTime-button")
	private WebElement btnpickUpTime;

	@FindBy(id = "dropOffTime-button")
	private WebElement btndropOffTime;

	@FindBy(id = "carTripSubmit")
	private WebElement btnBookCar;

	@FindBy(id = "ck-banner-close")
	private WebElement btnckbanner;

	@FindBy(id = "ageWidget-button")
	private WebElement btnAgeWidget;

	@FindBy(xpath = "(//table[@class='carResultContainer_EHI'])[2]")
	private WebElement carResultContaner;

	@FindBy(xpath = "//input[@class='secondary']")
	private WebElement btnSelectCar;

	@FindBy(xpath = "//h3[@class='carDetailsHeaderText floatLeft']")
	private WebElement CarDetails;

	public WebElement getCarDetails() {
		return CarDetails;
	}

	public WebElement getcarResultContainer() {
		return carResultContaner;
	}

	public WebElement getbtnSelectCar() {
		return btnSelectCar;
	}

	public WebElement getbtnAgeWidget() {
		return btnAgeWidget;
	}

	public WebElement getbtnckbanner() {
		return btnckbanner;
	}

	public WebElement getbtncarpage() {
		return btncarpage;
	}

	public WebElement getBtnpickUpTime() {
		return btnpickUpTime;
	}

	public WebElement getBtndropOffTime() {
		return btndropOffTime;
	}

	public WebElement getbtnBookCar() {
		return btnBookCar;
	}

	public WebElement getTxtcarLocation() {
		return txtcarLocation;
	}

	public WebElement getTxtpickUpWidgetDate() {
		return txtpickUpWidgetDate;
	}

	public WebElement getTxtdropOffWidgetDate() {
		return txtdropOffWidgetDate;
	}

	public carPage() {
		PageFactory.initElements(driver, this);
	}

	public void PickupTime(String checkIn) {
		click(getBtnpickUpTime());
		WebElement ListInTime = driver.findElement(By.xpath("//ul[@id='pickUpTime-menu']"));
		if (ListInTime.isDisplayed()) {
			List<WebElement> Intime = ListInTime.findElements(By.tagName("li"));
			for (WebElement x : Intime) {
				String txt = x.getText();
				if (txt.equalsIgnoreCase(checkIn)) {
					System.out.println("customer Pick up time of car:" + checkIn);
					click(x);
				}

			}
		}

	}

	public void dropOffTime(String checkoutTime) {
		click(getBtndropOffTime());
		WebElement Listdropoff = driver.findElement(By.xpath("//ul[@id='dropOffTime-menu']"));
		if (Listdropoff.isDisplayed()) {
			List<WebElement> ListoutTime = driver.findElements(By.tagName("li"));
			for (WebElement x : ListoutTime) {
				String outtime = x.getText();
				if (outtime.equalsIgnoreCase(checkoutTime)) {
					System.out.println("customer drop off time of car:" + checkoutTime);
					click(x);
				}

			}
		}
	}

	public void CustomerAge(String value) {
		click(getbtnAgeWidget());
		WebElement Age = driver.findElement(By.id("ageWidget-menu"));
		if (Age.isDisplayed()) {
			List<WebElement> ListofAge = driver.findElements(By.tagName("li"));
			for (WebElement x : ListofAge) {
				String outtime = x.getText();
				if (outtime.equalsIgnoreCase(value)) {
					System.out.println("Age of customer :" + value);
					click(x);
				}

			}
		}
	}

	public void SelectCarPrices(String price) {
		WebElement carprice = getcarResultContainer()
				.findElement(By.xpath("//td[@class='carVendorDetails column_ET']"));
		if (carprice.isDisplayed()) {
			List<WebElement> valuesofcar = carprice.findElements(By.xpath("//span[@class='carPriceDollar']"));
			for (WebElement carName : valuesofcar) {
				String text = carName.getText();
				if (text.equals(price)) {
					text = carprice.getText();
					System.out.println("customer car price:" + text);

				}

			}
			click(getbtnSelectCar());
		}

	}

}
