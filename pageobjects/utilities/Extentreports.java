package com.mindtree.utilities;

import java.io.IOException;

import org.testng.annotations.Test;

import com.mindtree.reusablecomponents.Base123;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Extentreports extends Base123 {
	public static ExtentTest test;
	public static ExtentReports report;
@Test
	public void extentreports() throws IOException
	{
		driver=intilializedriver();
	
		report=new ExtentReports(System.getProperty("user.dir")+"\\reports\\"+"ExtentReportResults-"+System.currentTimeMillis()+"-.html");
		test=report.startTest("Homepage");
		report.endTest(test);
		report.flush();
		
		

}
}
