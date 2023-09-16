package com.SwagLab.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class InventoryPageTestCase extends BaseClass 
{
  @Test(priority=1)
  public void VerifyTotalProductCount() 
  {
	  int count=ip.getTotalProductCount();
	  Assert.assertEquals(count, 6,"count is not matched!");
	  System.out.println("Total Products are: "+count);
  }
  
  
  @Test(priority=2)
  public void VerifyProductName()
  {
	 ip.getProductName();
  }
  
  @Test(priority=3)
  public void VerifyAddProductToCart()
  {
	  ip.addProductToCart("Sauce Labs Fleece Jacket");   
  }
  
}
