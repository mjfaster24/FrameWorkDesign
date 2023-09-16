package com.SwagLab.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OverViewPage 
{
	private WebDriver d;
	

	public  OverViewPage (WebDriver d)
	{
		this.d=d;
	}
	
	private By data=By.id("checkout_summary_container");
	private By finishbtn=By.id("finish");
	private By msg=By.xpath("//h2");
	
	public void getDetails()
	{
		System.out.println(d.findElement(data).getText());
	}
	
	public void dofinish()
	{
		d.findElement(finishbtn).click();
		System.out.println(d.findElement(msg).getText());
	}
	
	
}
