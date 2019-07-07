package com.selenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
public WebDriver driver;
	
	public LoginPage(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getSigninField() {
		return signinField;
	}

	public WebElement getSigninPopup() {
		return signinPopup;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getContinuebtn() {
		return continuebtn;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	@FindBy(xpath="//span[text()='Hello, Sign in']")
	private WebElement signinField;
	
	@FindBy(xpath="(//span[text()='Sign in'])[1]")
	private WebElement signinPopup;
	
	@FindBy(xpath="//input[@id='ap_email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement continuebtn;
	
	@FindBy(xpath="//input[@id='ap_password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	private WebElement loginBtn;
	


}
