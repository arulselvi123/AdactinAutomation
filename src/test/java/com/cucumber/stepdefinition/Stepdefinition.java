package com.cucumber.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.server.handler.GetElementText;

import com.cucumber.runner.TestRunner;
import com.selenium.baseclass.BaseClass;
import com.selenium.pom.AddressPage;
import com.selenium.pom.HomePage;
import com.selenium.pom.LoginPage;
import com.selenium.pom.MyAccountPage;
import com.selenium.pom.PaymentPage;
import com.selenium.pom.SearchPage;
import com.selenium.pom.SearchSummaryPage;
import com.selenium.pom.ShippingPage;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition extends BaseClass {
	
public static WebDriver driver = TestRunner.driver;
	
	@Given("^User Launch the automation practise application$")
	public void user_Launch_the_automation_practise_application() throws Throwable {
		geturl("http://automationpractice.com/index.php");
	  
	    
	   
	}

	@When("^User click on the sigin button in the header$")
	public void user_click_on_the_sigin_button_in_the_header() throws Throwable {
		HomePage hp = new HomePage(driver);
		
		clickOnTheElement(hp.getSiginfield());
	   
	}

	@When("^User enter the email address in the Authentication Page$")
	public void user_enter_the_email_address_in_the_Authentication_Page() throws Throwable {
		LoginPage lp = new LoginPage(driver);
		lp.getEmailField().sendKeys("arjun@gmail.com");
		
	   
	}

	@When("^User enter the password in the Authentication Page$")
	public void user_enter_the_password_in_the_Authentication_Page() throws Throwable {
		LoginPage lp = new LoginPage(driver);
		lp.getPasswordField().sendKeys("123456");
	   
	}

	@When("^User click on the sigin button$")
	public void user_click_on_the_sigin_button() throws Throwable {
		LoginPage lp = new LoginPage(driver);
		clickOnTheElement(lp.getSubmitLoginField());
	   
	}

	@Then("^User verify the username in the header$")
	public void user_verify_the_username_in_the_header() throws Throwable {
	    MyAccountPage map = new MyAccountPage(driver);
	    String ac = getTextofTheElement(map.getVerifymyName());
	    System.out.println(ac);
	   
	}
	
	
	@Given("^User enters the product name on the search field$")
	public void user_enters_the_product_name_on_the_search_field() throws Throwable {
	    SearchPage sp = new SearchPage(driver);
	    		clickOnTheElement(sp.getSearchPage());
	    		sp.getSearchPage().sendKeys("summer dresses");
	    		
	    
	}

	@Given("^User clicked the search button$")
	public void user_clicked_the_search_button() throws Throwable {
		SearchPage sp = new SearchPage(driver);
		clickOnTheElement(sp.getClickSubmit());
	    
	}

	@Then("^User verify the search result on the search header field$")
	public void user_verify_the_search_result_on_the_search_header_field() throws Throwable {
		SearchPage sp = new SearchPage(driver);
		String na = getTextofTheElement(sp.getVerifytheSearchHeader());
	    System.out.println(na);
	}

	@Given("^User mouseover to printed summer dress$")
	public void user_mouseover_to_printed_summer_dress() throws Throwable {
		SearchPage sp = new SearchPage(driver);
		mouseOverToElemen(sp.getMouseover());
	    
	}

	@When("^User click on the More button on the Quickview page$")
	public void user_click_on_the_More_button_on_the_Quickview_page() throws Throwable {
		SearchPage sp = new SearchPage(driver);
		clickOnTheElement(sp.getClickMore());
	    
	}

	@When("^User add two quantites of the item$")
	public void user_add_two_quantites_of_the_item() throws Throwable {
		SearchPage sp = new SearchPage(driver);
		clickOnTheElement(sp.getClickPluse());
	    
	}

	@When("^User select the dress size to Medium$")
	public void user_select_the_dress_size_to_Medium() throws Throwable {
		SearchPage sp = new SearchPage(driver);
	    dropDown(sp.getSize(), "2");
	    
	}

	@When("^User click on the Add to Cart button$")
	public void user_click_on_the_Add_to_Cart_button() throws Throwable {
		SearchPage sp = new SearchPage(driver);
		clickOnTheElement(sp.getAddtoCart());
	    
	}

	@When("^User click on the Proceed to checkout on the popup page$")
	public void user_click_on_the_Proceed_to_checkout_on_the_popup_page() throws Throwable {
		SearchPage sp = new SearchPage(driver);
		clickOnTheElement(sp.getProceedtoCheckout());
	    
	}

	@When("^User click on the Proceed to checkout on the Summary page$")
	public void user_click_on_the_Proceed_to_checkout_on_the_Summary_page() throws Throwable {
		SearchSummaryPage ssp = new SearchSummaryPage(driver);
		clickOnTheElement(ssp.getProceedtoCheckout());
	    
	}

	@When("^User click on the Proceed to checkout on the Address page$")
	public void user_click_on_the_Proceed_to_checkout_on_the_Address_page() throws Throwable {
		AddressPage ap = new AddressPage(driver);
		clickOnTheElement(ap.getAddressProceedtoCheckout());
	    
	}

	@When("^User click on the checkin box on the shipping page$")
	public void user_click_on_the_checkin_box_on_the_shipping_page() throws Throwable {
		ShippingPage shp = new ShippingPage(driver);
		clickOnTheElement(shp.getCheckIn());
	    
	}

	@When("^User click on the Proceed to checkout on the Shipping page$")
	public void user_click_on_the_Proceed_to_checkout_on_the_Shipping_page() throws Throwable {
		ShippingPage shp = new ShippingPage(driver);
		clickOnTheElement(shp.getShippingProccedToCheckout());
	    
	}

	@When("^User click on the pay by bank wire$")
	public void user_click_on_the_pay_by_bank_wire() throws Throwable {
		PaymentPage pp = new PaymentPage(driver);
		clickOnTheElement(pp.getBankWire());
	    
	}

	@When("^User click on the I confirm my order on the payment page$")
	public void user_click_on_the_I_confirm_my_order_on_the_payment_page() throws Throwable {
		PaymentPage pp = new PaymentPage(driver);
		clickOnTheElement(pp.getClickToSubmitOrder());
	    
	}

	@Then("^User verify the Confirmation result on the payment page$")
	public void user_verify_the_Confirmation_result_on_the_payment_page() throws Throwable {
		PaymentPage pp = new PaymentPage(driver);
		String eb = getTextofTheElement(pp.getOrderConfirmationText());
	    System.out.println(eb);
	}




	
	
	
	
	
	
	
	
	
}
