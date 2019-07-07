package com.selenium.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SummaryPage {
	
public WebDriver driver;
	
	public SummaryPage(WebDriver Adriver) {

		this.driver= Adriver;
		PageFactory.initElements(driver, this);
		
		
	}
   
	@FindBy (xpath ="//a[contains(@class,'button btn btn-default standard-checkout button-medium')]" )
	private WebElement SummaryProceedtoCheckout;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getSummaryProceedtoCheckout() {
		return SummaryProceedtoCheckout;
	}
	
	
	
	
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	

}
