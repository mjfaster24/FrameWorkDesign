package com.SwagLab.TestCases;

import org.testng.annotations.Test;




public class OverViewPageTestCase extends BaseClass
{
  @Test(priority=1)
  public void verifydetails() 
  {
	  op.getDetails();
  }
  @Test(priority=2)
  public void verifyfinish() 
  {
	  op.dofinish();
  }
}
