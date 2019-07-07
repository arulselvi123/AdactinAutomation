package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigReader {

	public static Properties prop;

	public ConfigReader() throws Throwable {
		try {
			prop = new Properties();
			File f = new File(
					"C:\\Users\\Admin\\eclipse-workspace\\AdactinAutomationPractice\\src\\test\\resource\\com\\selenium\\driver\\configuration.properties");
			FileInputStream fin = new FileInputStream(f);
			
			prop.load(fin);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getUrl() throws Exception {
		String property = prop.getProperty("url");
		if (property==null) {
			throw new Exception("Not a valid prop name");
		}
		return property;
	}
	
	public String getBrowser() throws Exception {
		String property = prop.getProperty("browser");
		if (property==null) {
			throw new Exception("Not a valid prop name");
		}
		return property;
	}
	
	
}
