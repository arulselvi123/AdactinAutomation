package com.testng.TestNGProject;

import org.testng.AssertJUnit;
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


public class AppTest{
  
@BeforeSuite
public void sample()
    {
System.out.println("Before Suite");  
}
@AfterSuite
public void sample5() {
	System.out.println("After Suite");  

}
@AfterClass
public void sample6() {
	System.out.println("AfterClass");  

}
@BeforeGroups
public void sample9() {
	System.out.println("BeforeGroups");  

}
@AfterMethod
public void sample7() {
	System.out.println(" AfterMethod  ");  

}
@AfterTest
public void sample8() {
	System.out.println(" AfterTest  ");  

}
@BeforeClass
public void sample1() {
	System.out.println(" BeforeClass  ");  

}
@BeforeMethod
public void sample2() {
	System.out.println(" BeforeMethod  ");  

}
@BeforeTest
public void sample3() {
	System.out.println("Before Suite");  

}
@Test
public void sample4() {
	System.out.println("Before Suite");  

}
}
