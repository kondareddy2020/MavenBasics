package com.oracle.responsys.testscripts;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import org.testng.annotations.*;



public class TestW  {
	WebDriver driver;
	
	@BeforeTest
	public void init() throws IOException{
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://interact2.responsys.net/authentication/login/LoginPage");
		
		System.out.println("L"+driver.getCurrentUrl());
		
		
	}
	@Test
	public void test(){
		System.out.println("Hello");
	}
	@AfterTest
	public void close(){
		driver.close();
	}
}
