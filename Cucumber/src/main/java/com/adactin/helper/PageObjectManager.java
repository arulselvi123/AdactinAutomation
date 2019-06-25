package com.adactin.helper;

import org.openqa.selenium.WebDriver;

import com.selenium.pom.LoginAdactIn;

public class PageObjectManager {

	public WebDriver driver;
	
	public PageObjectManager(WebDriver ldriver) {
	this.driver=ldriver;
	}
	
	public LoginAdactIn la;
	
	public LoginAdactIn getLa() {
		
		if(la==null) {
			la=new LoginAdactIn(driver);
				
		}
		return la;
	}
	
}
