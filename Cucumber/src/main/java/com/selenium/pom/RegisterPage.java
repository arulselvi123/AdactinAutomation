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
	@FindBy(xpath="//*[@id=\\\"header\\\"]/div[2]/div/div/nav/div[1]/a")
	private WebElement signIn;
	
	public WebElement getSignIn() {
		return signIn;
	}

	public WebElement getEmailAddress() {
		return emailAddress;
	}

	public WebElement getCreateAnAccount() {
		return createAnAccount;
	}

	public WebElement getRadioBtn() {
		return radioBtn;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getPassWd() {
		return passWd;
	}

	public WebElement getDay() {
		return day;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getNewsLetter() {
		return newsLetter;
	}

	public WebElement getFstName() {
		return fstName;
	}

	public WebElement getLstName() {
		return lstName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCityAddress() {
		return cityAddress;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getPostcode() {
		return postcode;
	}

	public WebElement getMobilePhone() {
		return mobilePhone;
	}

	public WebElement getRegister() {
		return register;
	}
	@FindBy(id="email_create")
	private WebElement emailAddress;

	@FindBy(xpath="//*[@id=\"SubmitCreate\"]/span")
	private WebElement createAnAccount;
	
	//Your Personal Information	
	@FindBy(id="id_gender2")
	private WebElement radioBtn;
	
	@FindBy(id="customer_firstname")
	private WebElement firstName;
	
	@FindBy(id="customer_lastname")
	private WebElement lastName;
	
	@FindBy(id="passwd")
	private WebElement passWd;
	
	@FindBy(id="uniform-days")
	private WebElement day;
	
	@FindBy(id="months")
	private WebElement month;
	
	@FindBy(id="years")
	private WebElement year;
	
	@FindBy(id="newsletter")
	private WebElement newsLetter;
	
	//Your Address
	@FindBy(id="firstname")
	private WebElement fstName;
	
	@FindBy(id="lastname")
	private WebElement lstName;
	
	@FindBy(id="address1")
	private WebElement address;
	
	@FindBy(id="city")
	private WebElement cityAddress;
	
	@FindBy(id="id_state")
	private WebElement state;
	
	@FindBy(id="postcode")
	private WebElement postcode;
	
	@FindBy(id="phone_mobile")
	private WebElement mobilePhone;
	
	@FindBy(xpath="//*[@id=\"submitAccount\"]/span")
	private WebElement register;
	
	
	
	

}