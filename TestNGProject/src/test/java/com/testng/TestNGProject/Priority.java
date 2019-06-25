package com.testng.TestNGProject;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Priority {
	@Test(priority=-5)
	public void sample()
	    {
	System.out.println("Before Suite");  
	}
	@Test(priority=-4)

	public void sample5() {
		System.out.println("After Suite");  

	}
	@Test

	public void sample6() {
		System.out.println("AfterClass");  

	}
	@Test(priority=-2)

	public void sample9() {
		System.out.println("BeforeGroups");  

	}
	@Test(priority=-1)

	public void sample7() {
		System.out.println(" AfterMethod  ");  

	}
	@Test (invocationCount=5)

	public void sample8() {
		System.out.println(" AfterTest  ");  

	}
	@Test(priority=1)

	public void sample1() {
		System.out.println(" BeforeClass  ");  

	}
	@Test(priority=2)

	public void sample2() {
		System.out.println(" BeforeMethod  ");  

	}
	@Test(priority=3)

	public void sample3() {
		System.out.println("Before Suite");  

	}
	@Test(priority=4)

	public void sample4() {
		System.out.println("Before Suite");  

	}
}
