package com.oracle.responsys.testscripts;


import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.oracle.responsys.pagelibrary.RIHomePage;
import com.oracle.responsys.pagelibrary.RISignInPage;
import com.oracle.responsys.testbase.RITestBase;

public class RI_TC_03_RecentFromHome extends RITestBase {
	
	public static final Logger log=Logger.getLogger(RI_TC_03_RecentFromHome.class.getName());
	
	RISignInPage risign;
	RIHomePage rihome;
	String RIUserName="gokulmvt";
	String RIPassword="Welcome1234%";
	
	@BeforeTest
	public void DriverSetup() throws IOException{
		init();
	}
	@Test//(dataProvider="LoginData")
	public void test() throws InterruptedException{//String RIUserName,String RIPassword){
		log.info(":Starting of Test:");
		risign=new RISignInPage(driver);
		risign.logintoRI(RIUserName, RIPassword);
/*		driver.manage().timeouts().implicitlyWait(60,TimeUnit.MILLISECONDS);
	driver.manage().timeouts().implicitlyWait(60,TimeUnit.MILLISECONDS);
		rihome.signOutRI();*/
		riwait();
		/*rihome.signOutRI();
		log.info(":Ending of Test:");*/
		
		//Click om Campaign from recent of Home
		Thread.sleep(10000);
		driver.findElement(By.xpath("//label[@class='suite-dashboard-recentactivity-item-name' and @title='KR_QA1_Jun1818_FF1_Regression_P']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//table//tbody/tr[5]/td[2]/div/div[2]/div/div/div/div[1]/div/div/div[3]/div[2]")).click();
		Thread.sleep(10000);
		driver.switchTo().frame(1);
		WebElement status=driver.findElement(By.xpath("//span[@class='campaignStatusMsg']"));
		System.out.println("Status is::"+status.getText().toString());
	
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//div[@class='x-tool-img x-tool-close']")).click();
		//driver.close();
	}
//	@DataProvider(name="LoginData")
//	public String[][] getData(){
//		String[][] data=getData("RILoginData.xlsx","RILogin");
//		return data;
//	}
	/*@AfterMethod
	public void existTest(){
		driver.close();
		log.info(":Close the Browser:");
	}*/
	
}
