package com.selenium.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {
	
	
public WebDriver driver;
	
	public PaymentPage(WebDriver Adriver) {

		this.driver= Adriver;
		PageFactory.initElements(driver, this);
		
		
	}

	
	
	@FindBy (xpath = "//a[contains(@class,'bankwire')]")
	private WebElement BankWire;
	
	public WebElement getOrderConfirmationText() {
		return orderConfirmationText;
	}



	@FindBy(xpath = "//h1[contains(@class,'page-heading')]")
	private WebElement orderConfirmationText;
	
	public WebDriver getDriver() {
		return driver;
	}



	public WebElement getBankWire() {
		return BankWire;
	}



	public WebElement getClickToSubmitOrder() {
		return ClickToSubmitOrder;
	}



	@FindBy(xpath = "(//button[contains(@type,'submit')])[2]")
	private WebElement ClickToSubmitOrder;
	
	
	
	
	
	
	
	
	
	
	
		
	

}
