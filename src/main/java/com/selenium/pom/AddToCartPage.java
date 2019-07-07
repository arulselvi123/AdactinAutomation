package com.selenium.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {
	public WebDriver driver;
	
	public AddToCartPage(WebDriver Adriver) {

		this.driver= Adriver;
		PageFactory.initElements(driver, this);
		
		
	}

	@FindBy (xpath="(//a[contains(@title,'Faded Short Sleeve T-shirts')])[2]")
	private WebElement AddToCart;
	
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getAddToCart() {
		return AddToCart;
	}

	public WebElement getAddToCart1() {
		return AddToCart1;
	}

	public WebElement getProceedToCheckout() {
		return ProceedToCheckout;
	}

	@FindBy (xpath="//li[contains(@class,'ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line first-item-of-tablet-line first-item-of-mobile-line')]//span[contains(text(),'Add to cart')]")
	private WebElement AddToCart1;
	
	@FindBy (xpath="(//div[contains(@class,'button-container')]//span)[3]")
	private WebElement ProceedToCheckout;

	
	
	
	
	
		
}
