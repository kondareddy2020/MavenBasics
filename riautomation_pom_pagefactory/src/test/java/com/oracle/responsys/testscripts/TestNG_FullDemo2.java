package com.oracle.responsys.testscripts;

import org.testng.annotations.*;

public class TestNG_FullDemo2 {
	@BeforeSuite
	public void BeforeSuite(){
		System.out.println("I am from BeforeSuite-2");
	}
	@AfterSuite
	public void AfterSuite(){
		System.out.println("I am from AfterSuite-2");
	}
	@BeforeClass
	public void BeforeClass(){
		System.out.println("I am from BeforeClass-2");
	}
	@BeforeMethod
	public void BeforeMethod(){
		System.out.println("I am from BeforeMethod-2");
	}
	@AfterClass
	public void AfterClass(){
		System.out.println("I am from AfterClass-2");
	}
	@AfterMethod
	public void AfterMethod(){
		System.out.println("I am from AfterMethod-2");
	}
	@BeforeTest
	public void BeforeTest(){
		System.out.println("I am from BeforeTest-2");
	}
	@AfterTest
	public void AfterTest(){
		System.out.println("I am from AfterTest-2");
	}
	@Test
	public void test1(){
		System.out.println("I am from Test1-2");
	}
	@Test
	public void test2(){
		System.out.println("I am from Test2-2");
	}
	@Test
	public void test3(){
		System.out.println("I am from Test3-2");
	}
}
