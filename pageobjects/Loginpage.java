package com.mindtree.pageobjects;

import java.io.IOException;
import org.testng.annotations.*;

import org.testng.annotations.Test;

import com.mindtree.reusablecomponents.Base123;
import com.mindtree.uistore.loginpageui;

public class Loginpage extends Base123 {
//	@Test
	public void login() throws IOException
	{
		driver=intilializedriver();
		driver.get("https://www.elocalshops.com/");
		
		loginpageui lp=new loginpageui(driver);
		lp.getemail().sendKeys("abc@gmail.com");
		lp.getpassword().sendKeys("12345");
		lp.getlgbutton().click();
	}
}
