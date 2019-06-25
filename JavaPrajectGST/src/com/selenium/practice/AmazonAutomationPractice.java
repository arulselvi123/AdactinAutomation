package com.selenium.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAutomationPractice {
	

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Gautham\\eclipse-workspace\\SeleniumInstall\\JavaPrajectGST\\driver\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.navigate().to("https://www.amazon.in/");
driver.manage().window().maximize();
	}

}
