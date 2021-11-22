package com.mindtree.reusablecomponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;


public class Base123 {
	
	
	public static  WebDriver driver;
	public static Properties prop;
	public static ExtentTest test;
	public static ExtentReports report;
	
	

	public  WebDriver intilializedriver() throws IOException
	{
		 prop=new Properties();
		FileInputStream fis=new FileInputStream("D:\\Selinium\\selinium-program\\demoprojectelshop\\src\\main\\resources\\config.properties");
	   prop.load(fis);
	String browsername= prop.getProperty("browser");
	
	if(browsername.equalsIgnoreCase("chrome"))
	{

		System.setProperty("webdriver.chrome.driver","D:\\Selinium\\selinium-program\\demoprojectelshop\\driver\\chromedriver.exe");
		driver=new ChromeDriver();	
	}
	else if(browsername.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.geko.driver","\"C:\\Users\\shashank\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe\"");
	    	driver= new FirefoxDriver();
	}
	
	driver.manage().window().maximize();
	return driver;
	}




}
