package com.ObjectRepository;
import java.util.List;
import com.resources.FunctionalLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


	
		
	public class FlightsPag extends FunctionalLibrary {
		
			@FindBy(xpath="(//input[@id='originCity'])")
				private WebElement locatext;
			
			@FindBy(xpath="//input[@id='destinationCity']")
					private WebElement locatex;
			
			@FindBy(xpath="(//span[@class='airportLookUpBalloon'])[1]")
			private WebElement locatsymbol;
			
			@FindBy(xpath="(//span[@class='airportLookUpBalloon'])[2]")
			private WebElement locatsymb;
			
			
			@FindBy(xpath="(//span[@class='calendarClickIcon'])[1]")
			private WebElement dateclick;
			
			@FindBy(xpath="(//span[@class='calendarClickIcon'])[2]")
			private WebElement dateclic;
			
			
			@FindBy(xpath="(//a[text()='2'])[1]")
			private WebElement date;
			
			@FindBy(xpath="(//a[text()='2'])[2]")
			private WebElement dat;
			
			@FindBy(xpath="(//span[@class='ui-icon ui-icon-triangle-1-s'])[3]")
			private WebElement downclick;
			
				
			@FindBy(xpath="//ul[@id='paxCount-menu']//li[text()='2']")
			private WebElement drpdwnval;
			
				
			@FindBy(xpath="//button[@id='findFlightsSubmit']")
			private WebElement srchbtn;
			
			@FindBy(xpath="//span[@class='priceBfrDec']")
			private WebElement prcbsed;
			
			@FindBy(xpath="//button[@class='basicEconomyBtn yesButton']")
			private WebElement acptrestns;
			
			@FindBy(xpath="//span[@class='tblCntBigTxt  ']")
				private WebElement lowprcslt;
				
			
			

			public WebElement getDate() {
				return date;
			}
			public void setDate(WebElement date) {
				this.date = date;
			}
			public WebElement getDat() {
				return dat;
			}
			public void setDat(WebElement dat) {
				this.dat = dat;
			}


			
				public WebElement getLocatext() {
					return locatext;
				}

				public void setLocatext(WebElement locatext) {
					this.locatext = locatext;
				}

				public WebElement getLocatex() {
					return locatex;
				}

				public void setLocatex(WebElement locatex) {
					this.locatex = locatex;
				}

				public WebElement getLocatsymbol() {
					return locatsymbol;
				}

				public void setLocatsymbol(WebElement locatsymbol) {
					this.locatsymbol = locatsymbol;
				}

				public WebElement getLocatsymb() {
					return locatsymb;
				}

				public void setLocatsymb(WebElement locatsymb) {
					this.locatsymb = locatsymb;
				}

				public WebElement getDateclick() {
					return dateclick;
				}

				public void setDateclick(WebElement dateclick) {
					this.dateclick = dateclick;
				}

				public WebElement getDateclic() {
					return dateclic;
				}

				public void setDateclic(WebElement dateclic) {
					this.dateclic = dateclic;
				}

				public WebElement getDownclick() {
					return downclick;
				}

				public void setDownclick(WebElement downclick) {
					this.downclick = downclick;
				}

				public WebElement getDrpdwnval() {
					return drpdwnval;
				}

				public void setDrpdwnval(WebElement drpdwnval) {
					this.drpdwnval = drpdwnval;
				}

				public WebElement getSrchbtn() {
					return srchbtn;
				}

				public void setSrchbtn(WebElement srchbtn) {
					this.srchbtn = srchbtn;
				}

				public WebElement getPrcbsed() {
					return prcbsed;
				}

				public void setPrcbsed(WebElement prcbsed) {
					this.prcbsed = prcbsed;
				}

				public WebElement getAcptrestns() {
					return acptrestns;
				}

				public void setAcptrestns(WebElement acptrestns) {
					this.acptrestns = acptrestns;
				}

				public WebElement getLowprcslt() {
					return lowprcslt;
				}

				public void setLowprcslt(WebElement lowprcslt) {
					this.lowprcslt = lowprcslt;
				}
				public FlightsPag() {
					PageFactory.initElements(FunctionalLibrary.driver, this);
				}

		public void deleteBasedOnPrice(String priceValue) {
					WebElement required = null;
					WebElement priceValue2 = getPrcbsed();
					List<WebElement> price = priceValue2.findElements(By.tagName("span"));
					for (int i = 0; i < price.size(); i++) {
						if (price.get(i).getText().equals(priceValue)) {
							 required = price.get(i);
							
						}
					
					}
					click(required);
				
			}
			}


