package com.oracle.responsys.pagelibrary;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RIHomePage {
	
static Logger log=Logger.getLogger(RIHomePage.class.getName());

WebDriver driver;
/*
 * WebElemts of RISignInPage
 */
@FindBy(xpath="//a[contains(@class,'auto-responsys-header-accountMenuArrow')]")
WebElement signOutArrow;

@FindBy(xpath="//span[text()='Sign Out']")
WebElement signOut;

@FindBy(xpath="//form[@id='loginForm']//button[@id='signIn']")
WebElement signIn;

/*
 * RISignInPage constructor to define driver with PageFactory
 */
public RIHomePage(WebDriver driver){
	PageFactory.initElements(driver,this);
}
/*
 * This function use to log into RI Applicarion
 */
public void signOutRI(){
	log.info("Clicking on SignOut Arrow at:"+signOutArrow.toString());
	signOutArrow.click();
	log.info("Clicking on SignOut Arrow at:"+signOut.toString());
	signOut.click();
	
}



}
