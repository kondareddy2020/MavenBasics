package com.oracle.responsys.testscripts;

import org.testng.annotations.*;

public class TestNG_FullDemo1 {
	@BeforeSuite
	public void BeforeSuite(){
		System.out.println("I am from BeforeSuite-1");
	}
	@AfterSuite
	public void AfterSuite(){
		System.out.println("I am from AfterSuite-1");
	}
	@BeforeClass
	public void BeforeClass(){
		System.out.println("I am from BeforeClass-1");
	}
	@BeforeMethod
	public void BeforeMethod(){
		System.out.println("I am from BeforeMethod-1");
	}
	@AfterClass
	public void AfterClass(){
		System.out.println("I am from AfterClass-1");
	}
	@AfterMethod
	public void AfterMethod(){
		System.out.println("I am from AfterMethod-1");
	}
	@BeforeTest
	public void BeforeTest(){
		System.out.println("I am from BeforeTest-1");
	}
	@AfterTest
	public void AfterTest(){
		System.out.println("I am from AfterTest-1");
	}
	@Test
	public void test1(){
		System.out.println("I am from Test1-1");
	}
	@Test
	public void test2(){
		System.out.println("I am from Test2-1");
	}
	@Test
	public void test3(){
		System.out.println("I am from Test3-1");
	}
}
