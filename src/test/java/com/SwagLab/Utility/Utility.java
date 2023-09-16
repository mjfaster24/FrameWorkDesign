package com.SwagLab.Utility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility 
{
	public static void screenshot(WebDriver d)
	{
		 //takeScreenshot interface
		  TakesScreenshot ts=(TakesScreenshot) d;
		  File temo=ts.getScreenshotAs(OutputType.FILE);
		  File dest=new File("./"+"\\screenshot\\SwagLabProject"+System.currentTimeMillis()+"png");
		  
		  try {
			FileHandler.copy(temo, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public static void  samescript(WebElement e1,String value)
	{
//Select class for day
		Select s1=new Select(e1);
		
		List<WebElement> list=s1.getOptions();
		
		System.out.println("Total options are: "+list.size());
		
		for(WebElement i:list)
		{
			System.out.println(i.getText());
			if(i.getText().contains(value))
			{
				i.click();
				break;
			}
			}
}
	
		
	
	//for Explicit wait script
	public static WebElement waitforvisibility(WebDriver d,By loc)
	{
		WebDriverWait wait=new WebDriverWait(d, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(loc));
		
	}
	
	public static WebElement waitforPresence(WebDriver d,By loc)
	{
		WebDriverWait wait=new WebDriverWait(d,Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.presenceOfElementLocated(loc));
		
	}
	public static WebElement waitforclick(WebDriver d,By loc)
	{
		WebDriverWait wait=new WebDriverWait(d,Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.elementToBeClickable(loc));
		
	}
}
