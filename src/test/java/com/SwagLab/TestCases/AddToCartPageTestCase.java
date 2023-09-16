package com.SwagLab.TestCases;

import org.testng.annotations.Test;

public class AddToCartPageTestCase extends BaseClass
{
  @Test(priority=1)
  public void VerifyApp() 
  {
	  ap.getApp();
	  WaitStep();
  }
  @Test(priority=2)
  public void VerifyRemove() 
  {
	  ap.dorRemove();
	  WaitStep();
  }
  @Test(priority=3)
  public void VerifyContinue() 
  {
	  ap.doContinue();
	  WaitStep();
	  ip.addProductToCart("Sauce Labs Fleece Jacket");
	  WaitStep();
	  ap.getApp();
	  WaitStep();
  }
  @Test(priority=4)
  public void VerifyCheckout() 
  {
	  ap.doCheckout();
  }
}

