package com.selenium.testscript;

import java.util.Base64;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.internal.FindsByXPath;
import org.openqa.selenium.support.FindBy;

import com.selenium.baseclass.BaseClass;
import com.selenium.pom.HomePage;
import com.selenium.pom.LoginPage;
import com.selenium.pom.RegisterPage;

public class AmazonLoginFunctinality extends BaseClass{
	
	public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		
		
		driver = getBrowser("chrome");
		HomePage hp = new HomePage(driver);
		LoginPage lp = new LoginPage(driver);
		RegisterPage rp = new RegisterPage(driver);
		driver.get("https://www.amazon.in/");
		/*inputValuestoElement(hp.getSearchFeild(), "Mobile");
		mouseHoverUsingActions(lp.getSigninField());
		clickOnElement(lp.getSigninPopup());
		inputValuestoElement(lp.getEmail(), "r.n.sudhamathi@gmail.com");
		clickOnElement(lp.getContinuebtn());
		inputValuestoElement(lp.getPassword(), "Yuvish@11");
		clickOnElement(lp.getLoginBtn());
		*/
		
		mouseHoverUsingActions(rp.getNewCustField());
		clickOnElement(rp.getNewCustomerLink());
		inputValuestoElement(rp.getNameField(), "Yuvish");
		inputValuestoElement(rp.getPhoneNumberField(), "8939933547");
		inputValuestoElement(rp.getEmailField(), "s.s.yuvish@gmail.com");
		inputValuestoElement(rp.getPasswordField(), "Yuvish@11");
		clickOnElement(rp.getContinueBtn());
	}

}
