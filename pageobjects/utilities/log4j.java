package com.mindtree.utilities;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

import com.mindtree.reusablecomponents.Base123;

public class log4j extends Base123 {
	
	//@Test
	public void logger() throws IOException
	{
	Logger logger=Logger.getLogger("log4j");
	PropertyConfigurator.configure("Log4j.properties");
	
	
	driver=intilializedriver();
	logger.info("browser invoked");
	
	
	driver.get("https://www.elocalshops.com/");
	logger.info("website opened");
	
	
	
	}
	
	
}
