package com.ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class FlipkartPage extends FunctionalLibrary {
	public FlipkartPage() {
		PageFactory.initElements(driver, this);

	}


	@FindBy(xpath = "//*[@id=\"container\"]/div/header/div[3]/div/ul/li[2]/a/span")
	private WebElement appliancesModule;

	@FindBy(xpath = "//span[@text()='Washing Machine']")
	private WebElement washingMachine;

	@FindBy(xpath = "//span[text()='Refrigerators']")
	private WebElement refigeratos;

	@FindBy(xpath = "//span[text()='Kitchen Appliances']")
	private WebElement kitchenAppliances;

	@FindBy(className = "LM6RPg")
	private WebElement txtSearch;

	@FindBy(className = "vh79eN")
	private WebElement btnSearch;

	@FindBy(className = "_1Nyybr _30XEf0")
	private List<WebElement> mobilePhones;

	@FindBy(className = "_2AkmmA _2Npkh4 _2MWPVK")
	private WebElement addToCart;

	public WebElement getAppliancesModule() {
		return appliancesModule;
	}

	public void setAppliancesModule(WebElement appliancesModule) {
		this.appliancesModule = appliancesModule;
	}

	public WebElement getWashingMachine() {
		return washingMachine;
	}

	public void setWashingMachine(WebElement washingMachine) {
		this.washingMachine = washingMachine;
	}

	public WebElement getRefigeratos() {
		return refigeratos;
	}

	public void setRefigeratos(WebElement refigeratos) {
		this.refigeratos = refigeratos;
	}

	public WebElement getKitchenAppliances() {
		return kitchenAppliances;
	}

	public void setKitchenAppliances(WebElement kitchenAppliances) {
		this.kitchenAppliances = kitchenAppliances;
	}

	public WebElement getTxtSearch() {
		return txtSearch;
	}

	public void setTxtSearch(WebElement txtSearch) {
		this.txtSearch = txtSearch;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	public void setBtnSearch(WebElement btnSearch) {
		this.btnSearch = btnSearch;
	}

	public List<WebElement> getMobilePhones() {
		return mobilePhones;
	}

	public void setMobilePhones(List<WebElement> mobilePhones) {
		this.mobilePhones = mobilePhones;
	}

	public WebElement getAddToCart() {
		return addToCart;
	}

	public void setAddToCart(WebElement addToCart) {
		this.addToCart = addToCart;
	}

	public List<WebElement> getCartListing() {
		return cartListing;
	}

	public void setCartListing(List<WebElement> cartListing) {
		this.cartListing = cartListing;
	}

	public WebElement getRemoveItems() {
		return removeItems;
	}

	public void setRemoveItems(WebElement removeItems) {
		this.removeItems = removeItems;
	}

	@FindBy(className = "_325-ji _3ROAwx")
	private List<WebElement> cartListing;

	@FindBy(xpath = "//span[text()='Remove']")
	private WebElement removeItems;

	
	public void removeName(String name) {
		if (getCartListing().equals(name)) {
			click(getRemoveItems());
		}
	}

	public void refrigertaorNames() {
		WebElement refergerator1 = getRefigeratos();
		List<WebElement> lister = refergerator1.findElements(By.tagName("li"));
		for (int i = 0; i < lister.size(); i++) {
			String strs = lister.get(i).getText();
			System.out.println(strs);
		}
	}

	public void washing() {
		WebElement wash = getWashingMachine();
		List<WebElement> list = wash.findElements(By.tagName("li"));
		for (int i = 0; i < list.size(); i++) {
			String washing = list.get(i).getText();
			System.out.println(washing);
		}
	}
	public void kitchenApp() {
		WebElement kit = getKitchenAppliances();
		List<WebElement> list = kit.findElements(By.tagName("li"));
		for (int i = 0; i < list.size(); i++) {
			String kitchenList = list.get(i).getText();
			System.out.println(kitchenList);
		}
}
}