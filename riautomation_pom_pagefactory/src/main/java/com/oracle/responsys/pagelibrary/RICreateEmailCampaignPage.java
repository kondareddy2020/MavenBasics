package com.oracle.responsys.pagelibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebElement;

import com.oracle.responsys.testbase.RITestBase;

public class RICreateEmailCampaignPage extends RITestBase{

public void CreateEmailCampaign() throws InterruptedException {
	
	
	
    WebElement ele = driver.findElement(By
                  .xpath("//a[contains(@id,'uifresponsyshamburgerbutton')]"));
//JS CLICK
    JavascriptExecutor executor = (JavascriptExecutor) driver;
    executor.executeScript("arguments[0].click();", ele);
//JS CLICK END VINAY_FOLDERvinay_contacts
    Thread.sleep(4000);
    driver.findElement(By.xpath("//div[text()='Campaigns']")).click();
    Thread.sleep(400);
    driver.findElement(By.xpath("//div[text()='Create Campaign']")).click();
    Thread.sleep(10000);

    driver.findElement(By.xpath("//input[@name='name']")).sendKeys(
                 "vinay_18C_for demo auto");
    driver.findElement(By.xpath("//input[@name='folderId']")).sendKeys(
                 "Vinay_18C_Folder" + Keys.RETURN);
    Thread.sleep(5000);
    driver.findElement(By.xpath("//input[@name='profileId']")).sendKeys(
                 "Vinay_Contacts" + Keys.RETURN);
    Thread.sleep(5000);
    driver.findElement(By.xpath("//span[text()= 'Done']")).click();
    Thread.sleep(10000);
    driver.findElement(By.id("subject-inputEl")).sendKeys("${campaign.name}  launchid --> ${launch.id}   at time ${.now}");
    driver.findElement(
                 By.xpath("//div[@class='ri-image-with-text-icon mdf-from-library-icon']"))
                 .click();
    Thread.sleep(10000);
    driver.findElement(By.xpath("//span[text()='All content']/../div[1]")).click();
    Thread.sleep(10000);
    driver.findElement(By.xpath("//span[text()='!! CL 6.25 CF testing']")).click();
    Thread.sleep(10000);
    driver.findElement(By.xpath("//span[text()='aa.htm']")).click();

    Thread.sleep(10000);
    driver.findElement(By.xpath("//span[text()='Select']")).click();
    
    
    Thread.sleep(10000);
    driver.findElement(By.xpath("//span[text()='More']")).click();
    
    Thread.sleep(10000);
    driver.findElement(By.xpath("//span[text() ='Link tracking']")).click();
    
    Thread.sleep(10000);
    driver.findElement(By.xpath("//div[text()='On']")).click();
    
    Thread.sleep(10000);
    driver.findElement(By.xpath("(//span[text()='Select link table'])[2]")).click();
    
    Thread.sleep(10000);
    driver.findElement(By.xpath("//span[text()='!!!!635_Vinay_Folder']/preceding-sibling::div[1]")).click();
    Thread.sleep(10000);
    driver.findElement(By.xpath("//span[text()='TRANSACTIONAL CAMPAGIN DEC 6_linktable']")).click();
    Thread.sleep(10000);
    driver.findElement(By.xpath("//div[@title='Choose selected object']//div[@class='x-autocontainer-innerCt']")).click();
    Thread.sleep(10000);
    driver.findElement(By.xpath("//span[text()='Select']")).click();
    Thread.sleep(10000);
    driver.findElement(By.xpath("//span[text()='Done']")).click();
    Thread.sleep(10000);
    driver.findElement(By.xpath("//span[text()='Workbook']")).click();
    Thread.sleep(10000);
    driver.findElement(By.xpath("//div[text()='Audience']/../following-sibling::a[1]")).click();
    Thread.sleep(10000);
    driver.findElement(By.xpath("//label[text()='Everyone in the list']/../span")).click();
    Thread.sleep(10000);
    driver.findElement(By.xpath("//a[contains(@class,'x-toolbar-item')]//span[text()='Save']")).click();
    Thread.sleep(10000);
    driver.findElement(By.xpath("//div[contains(@class,'ri-warning-msgbox')]//span[text()='OK']")).click();
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
    driver.findElement(By.xpath("//div[text() ='View live report']")).click();
    
    /* WebDriverWait wait = new WebDriverWait(driver, 30);
     wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id='passwordNext']/content/span")))).click();
    */
    Thread.sleep(10000);
     driver.switchTo().frame(1);
     Thread.sleep(10000);
     WebElement status=driver.findElement(By.xpath("//span[@class='campaignStatusMsg']"));
     System.out.println("Status is::"+status.getText().toString());
    
}
}