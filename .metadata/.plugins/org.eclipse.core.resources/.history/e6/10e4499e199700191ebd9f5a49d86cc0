package com.testng.TestNGProject;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailed implements IRetryAnalyzer {
	private int retrycount=0;
	private int retrymaxcount=3;
	
	
	public boolean retry(ITestResult arg0) {
		if(retrycount<retrymaxcount) {
			retrycount++;
			return true;
					}
		return false;
	}

}
