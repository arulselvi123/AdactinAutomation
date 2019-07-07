package com.selenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SummerDressesPage {
	
public WebDriver driver;
	
	public SummerDressesPage(WebDriver Adriver) {

		this.driver= Adriver;
		PageFactory.initElements(driver, this);
		
		
	}
@FindBy (xpath = "(//a[contains(@title,'Dresses')])[5]")
  private WebElement DressesField;
public WebDriver getDriver() {
	return driver;
}
public WebElement getDressesField() {
	return DressesField;
}
public WebElement getSummerdressfield() {
	return Summerdressfield;
}
public WebElement getLargeSize() {
	return LargeSize;
}
public WebElement getPolysterField() {
	return PolysterField;
}
public WebElement getCasualField() {
	return CasualField;
}
public WebElement getMaxiField() {
	return MaxiField;
}
public WebElement getInstockField() {
	return InstockField;
}
public WebElement getFashionField() {
	return FashionField;
}
public WebElement getNewField() {
	return NewField;
}
@FindBy (xpath = "(//ul[contains(@class,'submenu-container clearfix first-in-line-xs')]//a[contains(@title,'Summer Dresses')])[2]")
  private WebElement Summerdressfield;
@FindBy (xpath = "(//div[contains(@class,'checker')])[3]")
  private WebElement LargeSize;

public WebElement getColorfield() {
	return colorfield;
}
@FindBy (xpath = "(//input[contains(@class,'color-option  ')])[2]")
private WebElement colorfield;
@FindBy (xpath = "(//div[contains(@class,'checker')])[4]")
private WebElement PolysterField;
@FindBy (xpath = "(//div[contains(@class,'checker')])[6]")
private WebElement CasualField;
@FindBy (xpath = "(//div[contains(@class,'checker')])[8]")
private WebElement MaxiField;
@FindBy (xpath = "(//div[contains(@class,'checker')])[11]")
private WebElement InstockField;
@FindBy(xpath = "(//div[contains(@class,'checker')])[12]")
private WebElement FashionField;
@FindBy (xpath = "(//div[contains(@class,'checker')])[13]")
private WebElement NewField;
@FindBy(xpath = "//a[contains(@class,'logout')]")
private WebElement SignoutField;

public WebElement getSignoutField() {
	return SignoutField;
}




	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
