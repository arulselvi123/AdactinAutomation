package com.helper;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.BookAHotelPage;
import com.adactin.pom.LoginPage;
import com.adactin.pom.LogoutPage;
import com.adactin.pom.SearchHotelPage;
import com.adactin.pom.SelectHotelPage;

public class PageObjectManager {
	public WebDriver driver;
	public PageObjectManager(WebDriver ldriver)
	{
		this.driver = ldriver;
	}
	
	public LoginPage lp;
	public SearchHotelPage shp;
	public SelectHotelPage selhp;
	public BookAHotelPage bahp;
	public LogoutPage lop;
	
	public LoginPage getLp()
	{
		if(lp==null)
		{
			lp = new LoginPage(driver);
		}
		return lp;
	}
	public SearchHotelPage getShp()
	{
		if(shp==null)
		{
			shp = new SearchHotelPage(driver);
		}
		return shp;
	}
	public SelectHotelPage getSelhp()
	{
		if(selhp==null)
		{
			selhp = new SelectHotelPage(driver);
		}
		return selhp;
	}
	public BookAHotelPage getBahp()
	{
		if(bahp==null)
		{
			bahp = new BookAHotelPage(driver);
		}
		return bahp;
	}
	public LogoutPage getLop()
	{
		if(lop==null)
		{
			lop = new LogoutPage(driver);
		}
		return lop;
	}
}
