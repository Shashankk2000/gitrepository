package com.mindtree.runner;

import java.io.IOException;
import org.testng.annotations.*;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.mindtree.reusablecomponents.Base123;
import com.mindtree.uistore.Homepageui;
import com.mindtree.uistore.loginpageui;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Runnerclass extends Base123{
	public static ExtentTest test;
	public static ExtentReports report;
	
	@BeforeTest
	public void initilalizer() throws IOException
	{
		report=new ExtentReports(System.getProperty("user.dir")+"\\reports\\"+"ExtentReportResults-"+System.currentTimeMillis()+"-.html");
		test=report.startTest("Homepage");
		report.endTest(test);
		report.flush();
		driver=intilializedriver();
	}
	
	@Test(dataProvider="getdata")
	public void basepagenavigation(String username,String password) throws IOException
	{
		
		//driver=intilializedriver();
		driver.get(prop.getProperty("url"));
		
	
		
		 Homepageui hp=new Homepageui(driver);
		Assert.assertEquals(hp.gettext().getText(), "COMBO COLLECTIONS"); 
	
		hp.login().click();
		loginpageui lp=new loginpageui(driver);
		lp.getemail().sendKeys(username);
		lp.getpassword().sendKeys(password);
		lp.getlgbutton().click();
	
		}
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] data=new Object[2][2];
		
		data[0][0]="1user";
		data[0][1]="1password";
		
		data[1][0]="2user";
		data[1][1]="2password";
		
		return data;
	}
	

}
