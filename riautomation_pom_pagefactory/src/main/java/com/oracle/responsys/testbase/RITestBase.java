package com.oracle.responsys.testbase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


import com.oracle.responsys.exclereader.ReadWriteExcleData;

public class RITestBase {
	public static final Logger log=Logger.getLogger(RITestBase.class.getName());
	public static Properties Repository=new Properties();	
	public File f;
	public FileInputStream FI;
	public WebDriver driver;
	ReadWriteExcleData excel;
	/*
	 * This Method get the Properties from Config Properties File
	 */
	private void loadpropertiesFile() throws IOException {
		f=new File(System.getProperty("user.dir")+"//src//test//java//com//oracle//responsys//config//config.properties");
		FI=new FileInputStream(f);
		Repository.load(FI);
		log.info(FI);
	}
	/*
	 * This Method intiates the WebDriver ,Launch the Browser and Navigate to the APplication to Test
	 */
	public void init() throws IOException{
		String log4jConfPath="log4j.properties";
		PropertyConfigurator.configure(log4jConfPath);
		loadpropertiesFile();
		log.info("Selecting the browser:"+Repository.getProperty("browser"));
		selectBrowser(Repository.getProperty("browser"));
		log.info("Navigating to the Application :"+Repository.getProperty("url"));
		getUrl(Repository.getProperty("url"));
	}
	/*
	 * This method selects the browser based on config values
	 */
	private WebDriver selectBrowser(String browser){
		if(browser.equalsIgnoreCase("firefox")){
			log.info("Launching:"+browser.equalsIgnoreCase("firefox")+"Browser");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			return driver;
		}
		else if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//drivers//chromedriver.exe");
			log.info("Launching:"+browser.equalsIgnoreCase("chrome")+"Browser");
			driver=new ChromeDriver();
		}if(browser.equalsIgnoreCase("ie"))
		{
			driver=new InternetExplorerDriver();
			driver.manage().window().maximize();
			return driver;
		}
		return null;

	}
	/*
	 * This method navigate to the application based on config application URL
	 */
	private void getUrl(String url) {
		log.info("Navigating to the Application:"+url);
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.MILLISECONDS);
	}
	public void riwait(){
		
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.MILLISECONDS);
	}
	/*
	 * This get the data from Excle Sheet of provided workbook
	 */
	public Object[][] getData(String ExcelName,String SheetName) throws IOException{
		String Path=System.getProperty("user.dir")+"\\src\\test\\java\\com\\oracle\\responsys\\data";
		log.info("Reading Excel Data from:"+Path);
		excel=new ReadWriteExcleData();
		log.info("Storing the Data");
		Object[][] data=excel.readExcel(Path,ExcelName,SheetName);
		log.info("Returning the Data");
		return data;
	}


}
