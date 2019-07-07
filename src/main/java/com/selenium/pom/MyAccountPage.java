package com.selenium.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {
	
public WebDriver driver;
	
	public MyAccountPage(WebDriver Adriver) {

		this.driver= Adriver;
		PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy (xpath="(//a[contains(text(),'Women')])[1]")
	private WebElement WomenField;
@FindBy(xpath = "//h1[contains(@class,'page-heading')]")
private WebElement containstext;

public WebElement getVerifymyName() {
	return VerifymyName;
}

@FindBy(xpath = "//a[contains(@title,'View my customer account')]")
private WebElement VerifymyName;
	public WebElement getContainstext() {
	return containstext;
}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getWomenField() {
		return WomenField;
	}
	
	
	
	
	
	
	


	
	
	
	
	

}
