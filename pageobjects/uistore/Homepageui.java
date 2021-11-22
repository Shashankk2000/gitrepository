package com.mindtree.uistore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.reusablecomponents.Base123;
import org.testng.annotations.*;
public class Homepageui extends Base123 {
	
	public WebDriver driver;
	By text=By.xpath("//*[@id=\"shopify-section-1493163784784\"]/section/h2");
	By login=By.xpath("//*[@id=\"site-header-nav\"]/nav/ul[2]/li/a");
	
	public Homepageui(WebDriver driver2) {
		this.driver=driver2;
		// TODO Auto-generated constructor stub
	}

	public WebElement login()
	{
		return driver.findElement(login);
	}
	

	public WebElement gettext() {
		// TODO Auto-generated method stub
		 return driver.findElement(text);
	}

}
