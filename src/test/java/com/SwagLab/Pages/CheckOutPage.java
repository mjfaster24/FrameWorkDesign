package com.SwagLab.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage 
{
	//declare webDiver
	private WebDriver d;
	
	//initialization of driver
	public CheckOutPage(WebDriver d)
	{
		this.d=d;
	}
	
	//locatorse
	private By fname=By.id("first-name");
	private By lname=By.id("last-name");
	private By zcode=By.id("postal-code");
	private By cancelbtn=By.id("cancel");
	private By continuebtn=By.id("continue");
	
	
	//method
	
	public void doCancel()
	{
		d.findElement(cancelbtn).click();
		
	}
	
	public void docheckout(String f,String l,String z)
	{
		d.findElement(fname).sendKeys(f);
		d.findElement(lname).sendKeys(l);
		d.findElement(zcode).sendKeys(z);
		d.findElement(continuebtn).click();
	}

	
		
	}
	
	
	
	
	


