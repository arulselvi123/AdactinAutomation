package com.selenium.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShippingPage {

public WebDriver driver;
	
	public ShippingPage(WebDriver Adriver) {

		this.driver= Adriver;
		PageFactory.initElements(driver, this);
		
		
	}

	@FindBy (id = "uniform-cgv" )
	private WebElement CheckIn;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getCheckIn() {
		return CheckIn;
	}
	public WebElement getShippingProccedToCheckout() {
		return ShippingProccedToCheckout;
	}

	@FindBy(xpath = "(//button[contains(@type,'submit')])[2]" )
	private WebElement ShippingProccedToCheckout;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
