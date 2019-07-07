package com.cucumber.runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.cucumber.listener.Reporter;
import com.selenium.baseclass.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "com.cucumber.listener.ExtentCucumberFormatter:src\\test\\resource\\com\\reports\\extentreport.html",
		"pretty", "html:src\\test\\resource\\com\\reports\\", "json:src\\test\\resource\\com\\reports\\reports.json",
		"junit:src\\test\\resource\\com\\reports\\reports.xml"

},

		features = "src\\test\\java\\com\\cucumber\\feature", tags = {
				"@demo" }, glue = "com.cucumber.stepdefinition1", dryRun = false, strict = true, monochrome = true)

public class TestRunner {
	public static WebDriver driver;

	@BeforeClass
	public static void setup() {
		driver = BaseClass.BrowserLaunch("chrome");
	}

	@AfterClass
	public static void tearDown() {
		driver.quit();
		Reporter.loadXMLConfig(new File(
				"C:\\Users\\KALAI\\eclipse-workspace\\Cucumber\\src\\test\\resource\\com\\resource\\extent-config.xml"));

	}

}
