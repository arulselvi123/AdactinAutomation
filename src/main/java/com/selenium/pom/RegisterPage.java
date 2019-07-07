package com.selenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
public WebDriver driver;

public RegisterPage(WebDriver rdriver) {
	this.driver=rdriver;
	PageFactory.initElements(driver, this);
}

@FindBy(xpath="//span[contains(text(),'Hello, Sign in')]")
private WebElement newCustField;

@FindBy(xpath="//a[contains(text(),'Start here.')]")
private WebElement newCustomerLink;

@FindBy(id="ap_customer_name")
private WebElement nameField;

@FindBy(id="ap_phone_number")
private WebElement phoneNumberField;

@FindBy(id="ap_email")
private WebElement emailField;

@FindBy(id="ap_password")
private WebElement passwordField;

@FindBy(id="continue")
private WebElement continueBtn;

public WebDriver getDriver() {
	return driver;
}

public void setDriver(WebDriver driver) {
	this.driver = driver;
}

public WebElement getNewCustomerLink() {
	return newCustomerLink;
}

public void setNewCustomerLink(WebElement newCustomerLink) {
	this.newCustomerLink = newCustomerLink;
}

public WebElement getNameField() {
	return nameField;
}

public void setNameField(WebElement nameField) {
	this.nameField = nameField;
}

public WebElement getPhoneNumberField() {
	return phoneNumberField;
}

public void setPhoneNumberField(WebElement phoneNumberField) {
	this.phoneNumberField = phoneNumberField;
}

public WebElement getEmailField() {
	return emailField;
}

public void setEmailField(WebElement emailField) {
	this.emailField = emailField;
}

public WebElement getPasswordField() {
	return passwordField;
}

public void setPasswordField(WebElement passwordField) {
	this.passwordField = passwordField;
}

public WebElement getContinueBtn() {
	return continueBtn;
}

public void setContinueBtn(WebElement continueBtn) {
	this.continueBtn = continueBtn;
}


public WebElement getNewCustField() {
	return newCustField;
}

}
