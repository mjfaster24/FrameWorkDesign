package com.SwagLab.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCartPage 
{

	//declare WebDriver
	private WebDriver d;
	
	//initialization for Driver
	public AddToCartPage (WebDriver d)
	{
		this.d=d;
	}
	
	//Locators
	private By cartbtn=By.xpath("//a[@class='shopping_cart_link']");
	private By removebtn=By.xpath("//button[text()='Remove']");
	private By continuebtn=By.xpath("//button[text()='Continue Shopping']");
	private By checkoutbtn=By.xpath("//button[text()='Checkout']");
	
	//metods
	
	public void getApp()
	{
		d.findElement(cartbtn).click();
		System.out.println("***Cart page Open***");
	}
	
	public void dorRemove()
	{
		d.findElement(removebtn).click();
		System.out.println("After removing we are on same page!");
		
	}
	
	public void doContinue()
	{
		d.findElement(continuebtn).click();
		System.out.println("After continue we are on inventory page!");
		
	}
	
	public void doCheckout ()
	{
		d.findElement(checkoutbtn).click();
		System.out.println("After checkout we are on checkot page");
	}
	
}
