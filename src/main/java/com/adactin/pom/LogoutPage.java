package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
	public WebDriver driver;
	public LogoutPage(WebDriver ldriver)
	{
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className="reg_success")
	private WebElement reg_success_text_check;
	
	@FindBy(xpath="//a[contains(text(),'Click here to login again')]")
	private WebElement login_again;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getLogin_again() {
		return login_again;
	}

	public WebElement getReg_success_text_check() {
		return reg_success_text_check;
	}
}
