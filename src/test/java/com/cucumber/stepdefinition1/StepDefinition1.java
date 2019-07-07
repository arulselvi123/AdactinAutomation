package com.cucumber.stepdefinition1;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.cucumber.runner.TestRunner;
import com.selenium.baseclass.BaseClass;
import com.selenium.pom.HomePage;
import com.selenium.pom.LoginPage;
import com.selenium.pom.MyAccountPage;
import com.selenium.pom.SearchPage;
import com.selenium.pom.SummerDressesPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition1 extends BaseClass {

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

	
	
	
	@When("^User enter the \"([^\"]*)\" in the email address field$")
	public void user_enter_the_in_the_email_address_field(String arg1) throws Throwable {
		LoginPage lp = new LoginPage(driver);
		lp.getEmailField().sendKeys(arg1);
		
	}

	@When("^User enter the \"([^\"]*)\" in the password field$")
	public void user_enter_the_in_the_password_field(String arg1) throws Throwable {
		LoginPage lp = new LoginPage(driver);
		lp.getPasswordField().sendKeys("123456");
	   
	}

	@When("^User click on the sigin button$")
	public void user_click_on_the_sigin_button() throws Throwable {
		LoginPage lp = new LoginPage(driver);
		clickOnTheElement(lp.getSubmitLoginField());
	   
	}

	@When("^User click on the signout button$")
	public void user_click_on_the_signout_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		SummerDressesPage sd = new SummerDressesPage(driver);
		clickOnTheElement(sd.getSignoutField());
	}

	@Given("^User mouse overed to the Dresses field$")
	public void user_mouse_overed_to_the_Dresses_field() throws Throwable {
	  SummerDressesPage sd = new SummerDressesPage(driver);
	  mouseOverToElemen(sd.getDressesField());
	
	}

	@When("^User click on the summer dresses field$")
	public void user_click_on_the_summer_dresses_field() throws Throwable {
		SummerDressesPage sd = new SummerDressesPage(driver);
		clickOnTheElement(sd.getSummerdressfield());
	
	}

	@When("^User click on the Medium size check button$")
	public void user_click_on_the_Medium_size_check_button() throws Throwable {
		SummerDressesPage sd = new SummerDressesPage(driver);
		clickOnTheElement(sd.getLargeSize());
	
	}

	
	  @When("^User click on the black color field$") 
	  public void user_click_on_the_black_color_field() throws Throwable { 
		  SummerDressesPage sd = new SummerDressesPage(driver); 
	  clickOnTheElement(sd.getColorfield());
	  
	  }
	 
	@When("^User click on the Polyester check in field$")
	public void user_click_on_the_Polyester_check_in_field() throws Throwable {
		SummerDressesPage sd = new SummerDressesPage(driver);
  		clickOnTheElement(sd.getPolysterField());
	   
	}

	@When("^User click on the casual under the style field$")
	public void user_click_on_the_casual_under_the_style_field() throws Throwable {
		SummerDressesPage sd = new SummerDressesPage(driver);
	clickOnTheElement(sd.getCasualField());
	}

	@When("^User click on the Maxi dress field$")
	public void user_click_on_the_Maxi_dress_field() throws Throwable {
		SummerDressesPage sd = new SummerDressesPage(driver);
		clickOnTheElement(sd.getMaxiField());
	
	}

	@When("^User click on the Instock field$")
	public void user_click_on_the_Instock_field() throws Throwable {
		SummerDressesPage sd = new SummerDressesPage(driver);
		clickOnTheElement(sd.getInstockField());
	
	}

	@When("^User click on the Fashion Manufacturer$")
	public void user_click_on_the_Fashion_Manufacturer() throws Throwable {
		SummerDressesPage sd = new SummerDressesPage(driver);
		clickOnTheElement(sd.getFashionField());
	
	}

	@When("^User click on the new Condition field$")
	public void user_click_on_the_new_Condition_field() throws Throwable {
		SummerDressesPage sd = new SummerDressesPage(driver);
		clickOnTheElement(sd.getNewField());
	
	}
}
