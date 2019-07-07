package com.selenium.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressPage {
	
public WebDriver driver;
	
	public AddressPage(WebDriver Adriver) {

		this.driver= Adriver;
		PageFactory.initElements(driver, this);
		
		
	}

	
	@FindBy (xpath = "//p[contains(@class,'cart_navigation clearfix')]//span" )
	private WebElement AddressProceedtoCheckout;

	public WebDriver getDriver() {
		return driver;
	}


	public WebElement getAddressProceedtoCheckout() {
		return AddressProceedtoCheckout;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
