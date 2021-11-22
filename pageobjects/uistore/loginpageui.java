package com.mindtree.uistore;
import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.reusablecomponents.Base123;

public class loginpageui extends Base123{
	
	
		By email=By.id("customer_email");
		By password=By.id("customer_password");
		By lgbutton=By.cssSelector("#customer_login > div.form-action-row > button");
		
	
		public loginpageui(WebDriver driver2) {
			this.driver=driver2;
		}
		public WebElement getemail()
		{
			return driver.findElement(email);
		}
		public WebElement getpassword()
		{
			return driver.findElement(password);
		}
		public WebElement getlgbutton()
		{
			return driver.findElement(lgbutton);
		}
	
	
}
