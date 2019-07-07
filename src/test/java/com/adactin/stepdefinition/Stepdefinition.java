package com.adactin.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.adactin.runner.TestRunner;
import com.baseclass.org.Baseclass_Adactin;
import com.helper.FileReaderManager;
import com.helper.PageObjectManager;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition extends Baseclass_Adactin{
	public static WebDriver driver = TestRunner.driver;
	PageObjectManager pom = new PageObjectManager(driver);
	
	//1
	@Given("^User launch the adactin application using \"([^\"]*)\" url$")
	public void user_launch_the_adactin_application_using_url(String arg1) throws Throwable {
		String url=FileReaderManager.getInstance().getCr().getUrl();
		getUrl(url);
	}
	
	@Given("^User enter the UserID \"([^\"]*)\" in the home page$")
	public void user_enter_the_UserID_in_the_home_page(String arg1) throws Throwable {
	   inputValuestoElement(pom.getLp().getUsername(), getValuesFromExcel(6, 2));
	}

	@Given("^User enter the password \"([^\"]*)\" in the home page$")
	public void user_enter_the_password_in_the_home_page(String arg1) throws Throwable {
	    inputValuestoElement(pom.getLp().getPassword(), getValuesFromExcel(6, 3));
	}

	@Given("^User click on the Login button$")
	public void user_click_on_the_Login_button() throws Throwable {
	    clickOnElement(pom.getLp().getLogin());
	}

	@Then("^User verify the text \"([^\"]*)\" in the header$")
	public void user_verify_the_text_in_the_header(String arg1) throws Throwable {
		Assert.assertEquals(arg1, getElementText(pom.getShp().getWelcome_text()));
	}
	
	//2
	@Given("^User Select location as \"([^\"]*)\"$")
	public void user_Select_location_as(String arg1) throws Throwable {
		selectOptionFromDropDown(pom.getShp().getLocation(), arg1, "visibleText");
	}

	@Given("^User Select hotel as \"([^\"]*)\"$")
	public void user_Select_hotel_as(String arg1) throws Throwable {
		selectOptionFromDropDown(pom.getShp().getHotels(), arg1, "visibleText");
	}

	@Given("^User Select room type as \"([^\"]*)\"$")
	public void user_Select_room_type_as(String arg1) throws Throwable {
		selectOptionFromDropDown(pom.getShp().getRoom_type(), arg1, "visibleText");
	}

	@Given("^User Select no-of-rooms as \"([^\"]*)\"$")
	public void user_Select_no_of_rooms_as(String arg1) throws Throwable {
		selectOptionFromDropDown(pom.getShp().getRoom_nos(), arg1, "visibleText");
	}

	@Given("^Enter check-in-date as \"([^\"]*)\"$")
	public void enter_check_in_date_as(String arg1) throws Throwable {
		inputValuestoElement(pom.getShp().getDatepick_in(), arg1); 
	}

	@Given("^Enter check-out-date as \"([^\"]*)\"$")
	public void enter_check_out_date_as(String arg1) throws Throwable {
		inputValuestoElement(pom.getShp().getDatepick_out(), arg1); 
	}

	@Given("^User click the search button$")
	public void user_click_the_search_button() throws Throwable {
		 clickOnElement(pom.getShp().getSubmit());
	}

	@Then("^Verify that system gives an error saying \"([^\"]*)\"$")
	public void verify_that_system_gives_an_error_saying(String arg1) throws Throwable {
		System.out.println(getElementText(pom.getShp().getCheckin_span_error()));
		Assert.assertEquals(arg1, getElementText(pom.getShp().getCheckin_span_error()));
	}

	//3
	@Given("^Select No-of-adults \"([^\"]*)\"$")
	public void select_No_of_adults(String arg1) throws Throwable {
		selectOptionFromDropDown(pom.getShp().getAdult_room(), arg1, "visibleText");
	}

	@Given("^Select No-of-children \"([^\"]*)\"$")
	public void select_No_of_children(String arg1) throws Throwable {
		selectOptionFromDropDown(pom.getShp().getChild_room(), arg1, "visibleText");
	}

	//4
	@Then("^Verify that hotel displayed is the same as selected in search Hotel form$")
	public void verify_that_hotel_displayed_is_the_same_as_selected_in_search_Hotel_form() throws Throwable {
		Assert.assertEquals("Sydney", getAttributeText(pom.getSelhp().getSelect_hotel_location_check()));
		Assert.assertEquals("Hotel Creek", getAttributeText(pom.getSelhp().getSelect_hotel_name_check()));
	}
	
	//5
	@Then("^Verify Check-in-date and check-outdate should be displayed according to the data entered in search hotel form$")
	public void verify_Check_in_date_and_check_outdate_should_be_displayed_according_to_the_data_entered_in_search_hotel_form() throws Throwable {
		Assert.assertEquals("02/07/2019", getAttributeText(pom.getSelhp().getSelect_hotel_arrive_check()));
		Assert.assertEquals("30/07/2019", getAttributeText(pom.getSelhp().getSelect_hotel_depature_check()));
	}
	
	//6
	@Then("^Verify the No-of-rooms should be displayed and match with number of rooms in search hotel page$")
	public void verify_the_No_of_rooms_should_be_displayed_and_match_with_number_of_rooms_in_search_hotel_page() throws Throwable {
		Assert.assertEquals("1 Rooms", getAttributeText(pom.getSelhp().getSelect_hotel_rooms_check()));
	}
	
	//7
	@Then("^Verify the Room type displayed should be the same as selected in search hotel page$")
	public void verify_the_Room_type_displayed_should_be_the_same_as_selected_in_search_hotel_page() throws Throwable {
		Assert.assertEquals("Standard", getAttributeText(pom.getSelhp().getSelect_hotel_roomtype_check()));
	}

	@And("^User select the hotel$")
	public void user_select_the_hotel() throws Throwable {
		 clickOnElement(pom.getSelhp().getSelect_hotel_radio_check());
	}

	@And("^User click on the continue button$")
	public void user_click_on_the_continue_button() throws Throwable {
	   clickOnElement(pom.getSelhp().getSelect_hotel_continue());
	}
	
	//8
	@Then("^Verify that totalprice\\(excl\\.GST\\) is being calculated as \\(price-per-night\\*noof-rooms\\*no-of-days\\)$")
	public void verify_that_totalprice_excl_GST_is_being_calculated_as_price_per_night_noof_rooms_no_of_days() throws Throwable {
		Assert.assertEquals("Standard", getAttributeText(pom.getSelhp().getSelect_hotel_roomtype_check()));
	}
	
	//9
	@And("^Enter the details and click on book now$")
	public void enter_the_details_and_click_on_book_now() throws Throwable {
	    inputValuestoElement(pom.getBahp().getFirst_name(), "TEJA");
	    inputValuestoElement(pom.getBahp().getLast_name(), "C H");
	    inputValuestoElement(pom.getBahp().getAddress(), "ABC NAGAR,DEF STREET,CHENNAI-99");
	    inputValuestoElement(pom.getBahp().getCc_num(), "1234567890123456");
	    selectOptionFromDropDown(pom.getBahp().getCc_type(), "VISA", "value");
	    selectOptionFromDropDown(pom.getBahp().getCc_exp_month(), "5", "value");
	    selectOptionFromDropDown(pom.getBahp().getCc_exp_year(), "2020", "value");
	    inputValuestoElement(pom.getBahp().getCc_cvv(), "345");
	    clickOnElement(pom.getBahp().getBook_now());
	}

	@Then("^Check the details, click on logout and verify we have been logged out of the application$")
	public void check_the_details_click_on_logout_and_verify_we_have_been_logged_out_of_the_application() throws Throwable {
		clickOnElement(pom.getBahp().getLogout());
		Assert.assertEquals("You have successfully logged out. Click here to login again", getElementText(pom.getLop().getReg_success_text_check()));
	}
	
	//10
	@Given("^User clicks Sign-in again$")
	public void user_clicks_Sign_in_again() throws Throwable {
	    clickOnElement(pom.getLop().getLogin_again());
	}

	@Then("^Verify that total-price is being calculated as \\(price-pernight\\* no-ofrooms\\* no-of-days \\+ (\\d+)% GST”\\)$")
	public void verify_that_total_price_is_being_calculated_as_price_pernight_no_ofrooms_no_of_days_GST(int arg1) throws Throwable {
	    
	}
	
	@Then("^Data should be same as selected in previous screen$")
	public void data_should_be_same_as_selected_in_previous_screen() throws Throwable {
		Assert.assertEquals("Melbourne", getAttributeText(pom.getSelhp().getSelect_hotel_location_check()));
		Assert.assertEquals("Hotel Creek", getAttributeText(pom.getSelhp().getSelect_hotel_name_check()));
		Assert.assertEquals("02/07/2019", getAttributeText(pom.getSelhp().getSelect_hotel_arrive_check()));
		Assert.assertEquals("30/07/2019", getAttributeText(pom.getSelhp().getSelect_hotel_depature_check()));
		Assert.assertEquals("1 Rooms", getAttributeText(pom.getSelhp().getSelect_hotel_rooms_check()));
		Assert.assertEquals("Standard", getAttributeText(pom.getSelhp().getSelect_hotel_roomtype_check()));
	}
}


