package com.sele;

import org.openqa.selenium.WebDriver;

public class AutomationPage extends BaseClass {

	public static void main(String[] args) {
		WebDriver driver=BrowserLaunch("Chrome");
		driver.get("https://www.automationpractice");
		

	}




}
