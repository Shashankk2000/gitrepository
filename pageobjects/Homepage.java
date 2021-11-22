package com.mindtree.pageobjects;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.annotations.*;

import com.mindtree.reusablecomponents.Base123;
import com.mindtree.uistore.Homepageui;

import junit.framework.Assert;

public class Homepage extends Base123 {
	public static Logger logger=Logger.getLogger(Base123.class.getName());
	@Test
	public void login() throws IOException
	{
		
		//Logger logger=Logger.getLogger(Base123.class.getName());
		driver=intilializedriver();
		driver.get("https://www.elocalshops.com/");
		
		Homepageui hp=new Homepageui(driver);
		Assert.assertEquals(hp.gettext().getText(), "COMBO COLLECTIONS"); 
		logger.info("passed");
		hp.login().click();
	}
	
	
	}

