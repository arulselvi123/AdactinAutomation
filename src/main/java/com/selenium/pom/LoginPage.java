package com.selenium.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


	public WebDriver driver;
	
	public  LoginPage(WebDriver Adriver) {

		this.driver= Adriver;
		PageFactory.initElements(driver, this);
			
	}
    @FindBy (id="email")
	private WebElement emailField;
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getEmailField() {
		return emailField;
	}

	public WebElement getPasswordField() {
		return passwordField;
	}

	public WebElement getSubmitLoginField() {
		return SubmitLoginField;
	}
	@FindBy (id="passwd")
	private WebElement passwordField;
	
	@FindBy (id="SubmitLogin")
	private WebElement SubmitLoginField;
	
	
	
	
	
	
	
	
	
}
