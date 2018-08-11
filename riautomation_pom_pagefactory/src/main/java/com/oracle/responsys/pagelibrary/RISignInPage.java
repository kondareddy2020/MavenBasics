package com.oracle.responsys.pagelibrary;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RISignInPage {
	
static Logger log=Logger.getLogger(RISignInPage.class.getName());

WebDriver driver;
/*
 * WebElemts of RISignInPage
 */
@FindBy(xpath="//input[@id='txtUserName']")
WebElement username;

@FindBy(xpath="//input[@id='txtPassword']")
WebElement password;

@FindBy(xpath="//form[@id='loginForm']//button[@id='signIn']")
WebElement signIn;

/*
 * RISignInPage constructor to define driver with PageFactory
 */
public RISignInPage(WebDriver driver){
	PageFactory.initElements(driver,this);
}
/*
 * This function use to log into RI Applicarion
 */
public void logintoRI(String RIUserName,String RIPassword){
	log.info("Entering RI User Name:"+RIUserName+" :At "+username.toString());
	username.sendKeys(RIUserName);
	log.info("Entering RI RIPasswrodssword:"+RIPassword+" :At "+password.toString());
	password.sendKeys(RIPassword);
	log.info("Clicking on SignIn Button of RI Login Page At:"+signIn.toString());
	signIn.click();
	
}



}
