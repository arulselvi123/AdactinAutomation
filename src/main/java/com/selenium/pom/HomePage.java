package com.selenium.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public WebDriver driver;
	
	public HomePage(WebDriver Adriver) {

		this.driver= Adriver;
		PageFactory.initElements(driver, this);
		
		
	}
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getLogoField() {
		return logoField;
	}

	public WebElement getSiginfield() {
		return Siginfield;
	}

	@FindBy (xpath="//img[contains(@class,'logo img-responsive')]")
	private WebElement logoField;
	
	@FindBy (xpath="//a[contains(@title,'Log in to your customer account')]")
	private WebElement Siginfield;
	 

		
	
}


