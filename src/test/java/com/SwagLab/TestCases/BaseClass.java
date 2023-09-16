package com.SwagLab.TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import com.SwagLab.Pages.AddToCartPage;
import com.SwagLab.Pages.CheckOutPage;
import com.SwagLab.Pages.InventoryPage;
import com.SwagLab.Pages.LoginPage;
import com.SwagLab.Pages.OverViewPage;
import com.SwagLab.Utility.PropertiesUtil;
import com.SwagLab.Utility.Utility;

public class BaseClass 
 {
	
	public WebDriver d;
	public LoginPage lp;
	public InventoryPage ip;
	public AddToCartPage ap;
	public CheckOutPage cp;
	public OverViewPage op;
	public PropertiesUtil p1;
	@BeforeTest
	public void SetUp()
	{
		d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://www.saucedemo.com/");
		p1=new PropertiesUtil();
		lp=new LoginPage(d);
		ip=new InventoryPage(d);
		ap=new AddToCartPage(d);
		cp=new CheckOutPage(d);
		op=new OverViewPage(d);
	}		
	
	
	@BeforeClass
	public void PageSetUp()
	{
		System.out.println("******Login Test*******");
		System.out.println("Verified Title: "+lp.getAppTitle());
		
		lp.doLogin(p1.getData("un"),p1.getData("psw"));
		Utility.screenshot(d);
		WaitStep();
		System.out.println("verified current url: "+lp.getAppCurrentUrl());
		Utility.screenshot(d);  
		
System.out.println("***Inventory Test***");
		WaitStep();
		System.out.println("TotalProducts Are: "+ip.getTotalProductCount());
		Utility.screenshot(d);
		WaitStep();
		ip.getProductName();
		Utility.screenshot(d);
		ip.addProductToCart(p1.getData("pname"));//call data from properties
		Utility.screenshot(d);
		WaitStep();
		
System.out.println("***Add to Cart Page***");
		
Utility.screenshot(d);
		ap.getApp();
		ap.dorRemove();
		Utility.screenshot(d);
		ap.doContinue();
		ip.addProductToCart(p1.getData("pname"));//call data from properties
		ap.getApp();
		Utility.screenshot(d);
		ap.doCheckout();
		Utility.screenshot(d);
		
		System.out.println("*** CheckOut page***");
		
		cp.docheckout(p1.getData("fname"),p1.getData("lname"),p1.getData("zcode"));//call data from properties
		Utility.screenshot(d);
		//we use hardcore value for hiding data from user like fname lname pname
		//we can use data instesd of this hardcore value like mohd junaid 443101
		
	}
	
	
	public void WaitStep() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
