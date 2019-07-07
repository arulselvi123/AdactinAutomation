package com.selenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchSummaryPage {

public WebDriver driver;
	
	public SearchSummaryPage(WebDriver Adriver) {

		this.driver= Adriver;
		PageFactory.initElements(driver, this);
		
		
	}

	
	
	
	
	
	
	
	
	
	public WebDriver getDriver() {
		return driver;
	}










	public WebElement getProceedtoCheckout() {
		return ProceedtoCheckout;
	}










	@FindBy(xpath = "(//a[contains(@title,'Proceed to checkout')])[2]")
	private WebElement ProceedtoCheckout;
}
