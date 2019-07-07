package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage {
	public WebDriver driver;
	public SelectHotelPage(WebDriver ldriver)
	{
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className="login_title")
	private WebElement select_hotel_check;
	
	@FindBy(id="location_0")
	private WebElement select_hotel_location_check;
	
	@FindBy(id="arr_date_0")
	private WebElement select_hotel_arrive_check;
	
	@FindBy(id="dep_date_0")
	private WebElement select_hotel_depature_check;
	
	@FindBy(id="rooms_0")
	private WebElement select_hotel_rooms_check;
	
	@FindBy(id="room_type_0")
	private WebElement select_hotel_roomtype_check;
	
	@FindBy(id="radiobutton_0")
	private WebElement select_hotel_radio_check;
	
	@FindBy(id="hotel_name_0")
	private WebElement select_hotel_name_check;
	
	public WebElement getSelect_hotel_name_check() {
		return select_hotel_name_check;
	}
	
	@FindBy(name="continue")
	private WebElement select_hotel_continue;
	
	public WebElement getSelect_hotel_continue() {
		return select_hotel_continue;
	}
	
	public WebElement getSelect_hotel_radio_check() {
		return select_hotel_radio_check;
	}
	
	public WebElement getSelect_hotel_roomtype_check() {
		return select_hotel_roomtype_check;
	}
	
	public WebElement getSelect_hotel_rooms_check() {
		return select_hotel_rooms_check;
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getSelect_hotel_arrive_check() {
		return select_hotel_arrive_check;
	}
	public WebElement getSelect_hotel_depature_check() {
		return select_hotel_depature_check;
	}
	public WebElement getSelect_hotel_check() {
		return select_hotel_check;
	}
	public WebElement getSelect_hotel_location_check() {
		return select_hotel_location_check;
	}
}
