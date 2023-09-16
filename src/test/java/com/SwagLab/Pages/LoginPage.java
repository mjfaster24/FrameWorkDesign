package com.SwagLab.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	//Encapsulation=data+function
	
	
		//Declare WebDriver
		private WebDriver d;
		
		//intialization
		public LoginPage(WebDriver d)//base class Driver
		{
			this.d=d;
		}
		//Identification-By Locators
		private By username=By.id("user-name");
		private By password=By.id("password");
		private By btn=By.id("login-button");
		
		
		//Public method to access that data

		public void doLogin(String une,String psw)
		{
			d.findElement(username).sendKeys(une);
			d.findElement(password).sendKeys(psw);
			d.findElement(btn).click();
			
		}
		
		public String getAppTitle()
		{
			return d.getTitle();
		}
		public String getAppCurrentUrl()
		{
			return d.getCurrentUrl(); 
		}
		
}
