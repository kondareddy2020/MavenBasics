package com.oracle.responsys.testscripts;

import org.testng.annotations.*;

public class TestNG_FullDemo3 {
	@BeforeSuite
	public void BeforeSuite(){
		System.out.println("I am from BeforeSuite-3");
	}
	@AfterSuite
	public void AfterSuite(){
		System.out.println("I am from AfterSuite-3");
	}

	@BeforeClass
	public void BeforeClass(){
		System.out.println("I am from BeforeClass-3");
	}
	@BeforeMethod
	public void BeforeMethod(){
		System.out.println("I am from BeforeMethod-3");
	}
	@AfterClass
	public void AfterClass(){
		System.out.println("I am from AfterClass-3");
	}
	@AfterMethod
	public void AfterMethod(){
		System.out.println("I am from AfterMethod-3");
	}
	@BeforeTest
	public void BeforeTest(){
		System.out.println("I am from BeforeTest-3");
	}
	@AfterTest
	public void AfterTest(){
		System.out.println("I am from AfterTest-3");
	}
	@Test
	public void test1(){
		System.out.println("I am from Test1-3");
	}
	@Test
	public void test2(){
		System.out.println("I am from Test2-3");
	}
	@Test
	public void test3(){
		System.out.println("I am from Test3-3");
	}
}
