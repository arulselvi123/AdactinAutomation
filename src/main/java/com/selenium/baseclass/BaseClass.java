package com.selenium.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.management.RuntimeErrorException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	
public static WebDriver driver;

	
	public static WebDriver BrowserLaunch(String browserlaunch) {
		
		try {
			if (browserlaunch.equalsIgnoreCase("chrome")) {
				
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")
						+"\\src\\test\\resource\\com\\selenium\\drivers\\chromedriver.exe");
				driver = new ChromeDriver();
				
				
			} else if (browserlaunch.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")
						+"\\Drivers\\geckodriver.exe");
				driver = new FirefoxDriver();

			}
			else {
				throw new RuntimeException("Please use a valid browser name");
			}
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			return driver;
			} catch (Exception e) {
			
				e.printStackTrace();
				throw new RuntimeException();
		}
		  
	}
		public static  void geturl(String url) {
			try {
				
				driver.get(url);
				
			} catch (Exception e) {
				e.printStackTrace();
				throw new RuntimeException();
			}
			
		}
		
		
		public static  boolean elementIsDisplayed(WebElement element) {
			
          	try {
				   
          			boolean displayed = element.isDisplayed();
          			return displayed;
          			
				} catch (Exception e) {
                  e.printStackTrace();
                 throw new RuntimeException();
			}
			
          	}
          		public static boolean elementIsEnabled(WebElement element) {
                      try {
						boolean enabled = element.isEnabled();
						  return enabled;
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						throw new RuntimeException();
					}
				}
          		
          		public static void waitForElementVisibility(WebElement element) {
                        try {
							WebDriverWait wd = new WebDriverWait(driver, 40);
							wd.until(ExpectedConditions.visibilityOf(element));
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
							throw new RuntimeException();

						}
                        
				}
          		
          		public static void waitForTextPresentedOnElement(WebElement element, String text) {
                          try {
							WebDriverWait wd = new WebDriverWait(driver, 30);
							  wd.until(ExpectedConditions.textToBePresentInElement(element, text));
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
							throw new RuntimeException();

						}
                          
				}
          		
          		public static void inputValuesToElement(WebElement element, String value) {
                    
          			try {
						waitForElementVisibility(element);
						boolean elementIsDisplayed = elementIsDisplayed(element);
						boolean elementIsEnabled = elementIsEnabled(element);
						
						if (elementIsDisplayed&&elementIsEnabled) {
                        //		element.clear();
							element.sendKeys(value);
						}
					} catch (Exception e) {
						e.printStackTrace();
						throw new RuntimeException();

					}
          			}
          		public static void clickOnTheElement(WebElement element) {
				
                    try {
				        waitForElementVisibility(element);
						if (elementIsDisplayed(element)) {
							element.click();
						}
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						throw new RuntimeException();

					}
				}
          		
          		public static void mouseOverToElemen(WebElement element) {
                   try {
					Actions ac = new Actions(driver);
					   ac.moveToElement(element).build().perform();
				} catch (Exception e) {
				
					e.printStackTrace();
					throw new RuntimeException();
                }
                   


				}
		              public static void dropDown(WebElement element, String value) {

		            	  try {
							Select bd = new Select(element);
							bd.selectByValue(value);
							Select bm = new Select(element);
							bm.selectByValue(value);
							Select by = new Select(element);
							by.selectByValue(value);
						} catch (Exception e) {
							e.printStackTrace();
							throw new RuntimeException();

						}
		          		
					}		
		              
		             		              
		              
		              
		              public static String getAttributeValueofElement(WebElement element) {
		            	  
		            	  try {
							waitForElementVisibility(element);
							  String text = element.getAttribute("value");
							  return text;
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
							throw new RuntimeException();
						}
		            	  
		            	  

					}
		              
		              

		          	public static String getTextofTheElement(WebElement element) {
		                           
								try {
									waitForElementVisibility(element);
									String attribute = element.getText();
									   return attribute;
								} catch (Exception e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
									throw new RuntimeException();
								}
		          	}

	
	              public static void toelementHighlight(WebElement element) {
		                try {
							JavascriptExecutor js = (JavascriptExecutor) driver;
							js.executeScript("arguments[0].setAttribute('style','background: yellow; border: 2px solid red;');", element);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
							throw new RuntimeException();
						}

	             }
	
	              public static void dataDrivenSetValueToExcel(int rowNum, int cellNum, String value) throws IOException {
	            	  
	            	try {
						File few = new File("path");
						FileInputStream fi = new FileInputStream(few);
						Workbook wb = new XSSFWorkbook(fi);
						Sheet sheetAt = wb.getSheetAt(0);
						Row row = sheetAt.getRow(rowNum);
						if (row==null) {
							row = sheetAt.createRow(rowNum);
						}
						Cell cell = row.getCell(cellNum);
						if (cell==null) {
							cell =row.createCell(cellNum);
						}
						cell.setCellValue(value);
						
						FileOutputStream fout = new FileOutputStream(few);
						wb.write(fout);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						throw new RuntimeException();
					}
	        		
	        		
	            	  
	            	  
	            	  
	            	  
	            	  
	            	  
	            	  
	              }
	
	
	
	
	
	
	
	
	
	
	
	
}
