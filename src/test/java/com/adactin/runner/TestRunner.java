package com.adactin.runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclass.org.Baseclass_Adactin;
import com.cucumber.listener.Reporter;
import com.helper.FileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature\\",
glue = "com.adactin.stepdefinition",dryRun=true,strict=true,monochrome=true,
tags = {"@TC_101,@TC_104,@TC_105,@TC_106,@TC_107,@TC_108,@TC_109"},
plugin={"com.cucumber.listener.ExtentCucumberFormatter:src\\test\\resource\\com\\adactin\\reports\\extendreport.html",
		"pretty","html:src\\test\\resource\\com\\adactin\\reports",
				 "json:src\\test\\resource\\com\\adactin\\reports\\reports.json",
				 "junit:src\\test\\resource\\com\\adactin\\reports\\reports.xml"
})
//tags = {"@TC_101,@TC_104,@TC_105,@TC_106,@TC_107,@TC_108,@TC_109"})
//"com.cucumber.listerner.ExtentCucumberFoormatter:src\\test\\resource\\com\\adactin\\reports\\extendreport.html",
public class TestRunner {
	public static WebDriver driver;

	@BeforeClass
	public static void setup() throws Exception {
		
		String browser=FileReaderManager.getInstance().getCr().getBrowser();
		driver=Baseclass_Adactin.getBrowser(browser);
	}

	@AfterClass
	public static void tearDown() {
		//driver.quit();
		Reporter.loadXMLConfig(new File("E:\\eclipse-workspace\\AdactinCucumber\\src\\test\\resource\\com\\adactin\\extendreports\\extend-config.xml"));
	}
}