package com.SwagLab.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginPageTestCase extends BaseClass
{
	
  @Test(priority=1)
  public void VerifyTitle () 
  {
	  
	  String ActTitle=lp.getAppTitle();
	  Assert.assertTrue(ActTitle.contains("Swag"),"Title validtion not found");
	  System.out.println("title Validation Pass");
  }
  
  @Test (priority=2)
  public void verifyLogin()
  {
	  lp.doLogin("standard_user", "secret_sauce");
	  Assert.assertTrue(lp.getAppCurrentUrl().contains("inventory"), "Url not match");
	  System.out.println("Login is completed");
	  
  }
  
  
  @Test (priority=3)
  public void verifyCurrentUrl()
  {
	  String url=lp.getAppCurrentUrl();
	  Assert.assertTrue(url.contains("inventory"), "url is not match");
	  System.out.println("Url is matcheed: "+url);
	  
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
