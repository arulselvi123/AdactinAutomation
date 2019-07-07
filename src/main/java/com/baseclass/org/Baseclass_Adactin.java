package com.baseclass.org;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Baseclass_Adactin {
	public static WebDriver driver;

	public static WebDriver getBrowser(String browserName) throws Exception {
		try {
			if (browserName.equalsIgnoreCase("chrome")) {
				ChromeOptions options = new ChromeOptions();
				
				options.addArguments("--no-sandbox");
		        options.addArguments("--disable-dev-shm-usage");
		        
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")
						+ "\\src\\test\\resource\\com\\drivers\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")
						+ "\\src\\test\\resource\\com\\drivers\\geckodriver.exe");
				driver = new FirefoxDriver();
			} else if (browserName.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")
						+ "\\src\\test\\resource\\com\\drivers\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			} else {
				throw new Exception("Invalid browser Name");
			}
			driver.manage().window().maximize();
			// implicit wait
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			return driver;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	//get the url
	public static void getUrl(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
		
	public static void waitforElementVisiblity(WebElement element) {
		try {
			WebDriverWait wd = new WebDriverWait(driver, 70);
			wd.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	public static boolean elementDisplayed(WebElement element) {
		try {
			boolean displayed = element.isDisplayed();
			return displayed;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	public static boolean elementEnabled(WebElement element) {
		try {
			boolean enabled = element.isEnabled();
			return enabled;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();

		}
	}

	public static void inputValuestoElement(WebElement element, String value) {
		try {
			waitforElementVisiblity(element);
			if (elementDisplayed(element) && elementEnabled(element)) {
				if(element != null)
				{
					element.clear();
				}
				
				element.sendKeys(value);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();

		}
	}

	public static void clickOnElement(WebElement element) {
		try {
			waitforElementVisiblity(element);
			if (elementDisplayed(element)) {
				element.click();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();

		}
	}

	public static void selectOptionFromDropDown(WebElement element, String value, String options) throws Exception {
		try {
			waitforElementVisiblity(element);
			Select sc = new Select(element);
			if (options.equalsIgnoreCase("value")) {
				sc.selectByValue(value);
			} else if (options.equalsIgnoreCase("visibleText")) {
				sc.selectByVisibleText(value);
			} else if (options.equalsIgnoreCase("index")) {
				sc.selectByIndex(Integer.parseInt(value));
			} else {
				throw new Exception("Not a valid option");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();

		}

	}

	public static void scrollbyUsingElements(WebElement element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", element);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();

		}
	}

	public static void scrollByCoordinates(int width, int height) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			// js.executeScript("window.scrollBy(200,500)");
			js.executeScript("window.scrollBy(" + width + "," + height + ")");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();

		}
	}

	public static void sendkeysUsingActions(WebElement element, String value) {
		try {
			Actions ac = new Actions(driver);
			ac.sendKeys(element, value).build().perform();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();

		}
	}

	public static void clickUsingActions(WebElement element) {
		try {
			waitforElementVisiblity(element);
			Actions ac = new Actions(driver);
			ac.click(element).build().perform();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	public static void mouseHoverUsingActions(WebElement element) {
		try {
			waitforElementVisiblity(element);
			Actions ac = new Actions(driver);
			ac.moveToElement(element).build().perform();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();

		}
	}

	public static void dragAndDropusingActions(WebElement src, WebElement tar) {

		try {
			waitforElementVisiblity(src);
			Actions ac = new Actions(driver);
			ac.dragAndDrop(src, tar).build().perform();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();

		}
	}

	/*public static void takeScreenShotonthePage(String fileName) throws IOException {
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File temp = ts.getScreenshotAs(OutputType.FILE);
			File des = new File(System.getProperty("user.dir") + "\\src\\test\\resource\\com\\selenium\\report\\screeshot\\"
					+ fileName + ".png");
			FileUtils.copyFile(temp, des);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
	
	public static String getAttributeText(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;
	}
	
	public static String getElementText(WebElement element) {
		String text = element.getText();
		return text;
	}
	
	public static String getValuesFromExcel(int value_one, int value_two) throws Throwable  
	{
		File xf = new File("C:\\Users\\anu\\Documents\\q1.xlsx");
		
		FileInputStream fin = new FileInputStream(xf);
		Workbook wb = new XSSFWorkbook(fin);
		
		Sheet sheetAt = wb.getSheetAt(0);
		Row row = sheetAt.getRow(value_one);
		
		Cell cell = row.getCell(value_two);
		
		CellType cellType = cell.getCellType();
		
		if(cellType.equals(CellType.STRING))
		{
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
			
			return stringCellValue;
		}
		else if(cellType.equals(CellType.NUMERIC))
		{
			double numericCellValue = cell.getNumericCellValue();
			Long l = (long) numericCellValue;
			String valueOf = String.valueOf(l);
			System.out.println(valueOf);
			
			return valueOf;
		}
		return null;
	}
}
