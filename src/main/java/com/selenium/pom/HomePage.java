package com.selenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;
	
	public HomePage(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "twotabsearchtextbox")
	private WebElement searchFeild;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement searchBtn;
	
	public WebDriver getDriver() {
		return driver;
	}

	
		public WebElement getSearchFeild() {
		return searchFeild;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
		
	}



}
