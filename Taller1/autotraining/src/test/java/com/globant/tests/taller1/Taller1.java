package com.globant.tests.taller1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Taller1 {

	  @Test 
	  public void test1() {
		  System.out.println("Test1");
	  }
	  
	  @BeforeMethod 
	  public void beforeMethod() {
		  System.out.println("Init session");
	  }

	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("Close session");
	  }

	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("Create Account");
	  }

	  
	  @AfterClass
	  public void afterClass() {
		  System.out.println("Cancel Account");
	  }


}
