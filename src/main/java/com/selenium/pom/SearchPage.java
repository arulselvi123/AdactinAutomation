package com.selenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	
public WebDriver driver;
	
	public SearchPage(WebDriver Adriver) {

		this.driver= Adriver;
		PageFactory.initElements(driver, this);
		
		
	}

	@FindBy (id = "search_query_top")
	private WebElement SearchPage;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getSearchPage() {
		return SearchPage;
	}

	public WebElement getClickSubmit() {
		return ClickSubmit;
	}

	public WebElement getClickMore() {
		return ClickMore;
	}

	public WebElement getAddtoCart() {
		return AddtoCart;
	}

	public WebElement getProceedtoCheckout() {
		return ProceedtoCheckout;
		
		
	}

	@FindBy(xpath = ("//button[contains(@class,'btn btn-default button-search')]"))
    private WebElement ClickSubmit;
	
	

	@FindBy(xpath = "//span[contains(@class,'lighter')]")
	private WebElement  VerifytheSearchHeader;
	

	public WebElement getVerifytheSearchHeader() {
		return VerifytheSearchHeader;
	}

	@FindBy(xpath = "(//a[contains(@class,'button lnk_view btn btn-default')]//span)[1]")
	private WebElement ClickMore;
	
	@FindBy (xpath = "//i[contains(@class,'icon-plus')]")
	private WebElement ClickPluse;
	
	@FindBy (id = "group_1")
	private WebElement Size;
	
	public WebElement getSize() {
		return Size;
	}

	public void setSize(WebElement size) {
		Size = size;
	}

	public WebElement getClickPluse() {
		return ClickPluse;
	}

	public void setClickPluse(WebElement clickPluse) {
		ClickPluse = clickPluse;
	}

	@FindBy(id = "add_to_cart")
	private WebElement AddtoCart;

	@FindBy(xpath = "//a[contains(@title,'Proceed to checkout')]")
	private WebElement ProceedtoCheckout;
	
	@FindBy (xpath = "(//a[contains(@title,'Printed Summer Dress')])[2]")
private WebElement Mouseover;

	public WebElement getMouseover() {
		return Mouseover;
	}

	public void setMouseover(WebElement mouseover) {
		Mouseover = mouseover;
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
