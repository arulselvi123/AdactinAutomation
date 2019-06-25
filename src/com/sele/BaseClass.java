package com.sele;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	public static WebDriver driver;
	public static WebDriver BrowserLaunch(String browserName) {
		try {
			if (browserName.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
				driver=new ChromeDriver(); 
				
			}else if (browserName.equalsIgnoreCase("IE")) {
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\IEDriverServer.exe");
				driver=new InternetExplorerDriver(); 
			}else {
				throw new RuntimeException("Invalid browser Name");
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        return driver;	
	}
	
		
public static void getUrl(String url) {
	try {
		driver.get(url);
	} catch (Exception e) {
		e.printStackTrace();
		throw new RuntimeException();
	}}
	
		public static Boolean elementIsDisplayed(WebElement element) {
		try {
			boolean displayed = element.isDisplayed();
			return displayed;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();

		}}
		public static boolean elementIsEnabled(WebElement element) {
			try {
				boolean enabled = element.isEnabled();
				return enabled;
			} catch (Exception e) {
				e.printStackTrace();
				throw new RuntimeException();

			}
			
		}
		public static void waitForTheElementVisibility(WebElement element) {
			try {
				WebDriverWait wd=new WebDriverWait(driver, 50);
				wd.until(ExpectedConditions.visibilityOf(element));
			} catch (Exception e) {
				e.printStackTrace();
				throw new RuntimeException();

			}
			
		}
		public static void waitForTextPresentOnElement(WebElement element,String value) {
			try {
				WebDriverWait wd=new WebDriverWait(driver, 40);
				wd.until(ExpectedConditions.textToBePresentInElement(element, value));
			} catch (Exception e) {
				e.printStackTrace();
				throw new RuntimeException();

			}
			
		}
		public static void inputVaulesToTheElement(WebElement element,String vaule) {
			try {
				waitForTextPresentOnElement(element, vaule);
				Boolean elementIsDisplayed = elementIsDisplayed(element);
				boolean elementIsEnabled = elementIsEnabled(element);
				if (elementIsEnabled&&elementIsDisplayed) {
					element.sendKeys(vaule);
					
					
				}
			} catch (Exception e) {
				e.printStackTrace();
				throw new RuntimeException();

			}
		}
		public static void clickOnTheElement(WebElement element) {
       try {
		waitForTheElementVisibility(element);
		    Boolean elementIsDisplayed = elementIsDisplayed(element);
				boolean elementIsEnabled = elementIsEnabled(element);
				if (elementIsDisplayed) {
					
					element.click();
					
				}
	} catch (Exception e) {
		e.printStackTrace();
		throw new RuntimeException();

	}
		}
		public static void mouseHoverToTheElement(WebElement element) {
			try {
				Actions ac=new Actions(driver);
						ac.moveToElement(element).build().perform();
			} catch (Exception e) {
				e.printStackTrace();
				throw new RuntimeException();

			}
			
			
		}
}