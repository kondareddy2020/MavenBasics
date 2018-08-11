package com.oracle.responsys.testscripts;


import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.oracle.responsys.pagelibrary.RIHomePage;
import com.oracle.responsys.pagelibrary.RISignInPage;
import com.oracle.responsys.testbase.RITestBase;

public class RI_TC_01_Verify_Launch_Status extends RITestBase {
	
	public static final Logger log=Logger.getLogger(RI_TC_01_Verify_Launch_Status.class.getName());
	
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
		/////////////////////////////////
		Thread.sleep(10000);
        driver.findElement(By.xpath("//span[text()='Schedule launch']")).click();
        
        Thread.sleep(10000);
        driver.findElement(By.xpath("//label[text()='Immediate']/../span")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//span[text()='Next']")).click();
        
        Thread.sleep(10000);
        driver.findElement(By.xpath("//span[text()='Launch']")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//div[contains(@id,'messagebox')]//span[text()='Launch']")).click();
    	Thread.sleep(10000);
   
    	/////////////////////////////////
		//Click on Live Report
		driver.findElement(By.xpath("//table//tbody/tr[5]/td[2]/div/div[2]/div/div/div/div[1]/div/div/div[3]/div[2]")).click();
		Thread.sleep(10000);	
		driver.switchTo().frame(1);
		/*WebElement element=driver.findElement(By.xpath("//span[@class='campaignStatusMsg']"));
		WebDriverWait wait = new WebDriverWait(driver, 120);
		ExpectedCondition<Boolean> elementTextEqualsString = arg0 -> element.getText().toString().equalsIgnoreCase("Done");
		wait.until(elementTextEqualsString);
		*/
		Thread.sleep(240000);
		WebElement status=driver.findElement(By.xpath("//span[@class='campaignStatusMsg']"));
		System.out.println("Status is::"+status.getText()+"KR");
	
		
		
	}
	/*public void waitForElementTextEqualsString(WebElement element, String expectedString, WebDriver driver, int
			specifiedTimeout) {
			WebDriverWait wait = new WebDriverWait(driver, specifiedTimeout);
			ExpectedCondition<Boolean> elementTextEqualsString = arg0 -> element.getText().equals(expectedString);
			wait.until(elementTextEqualsString);
			}*/
	@AfterTest
	public void test_close() {
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//div[@class='x-tool-img x-tool-close']")).click();
		driver.close();
	}
}
