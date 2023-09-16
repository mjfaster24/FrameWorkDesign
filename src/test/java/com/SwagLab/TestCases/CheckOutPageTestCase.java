package com.SwagLab.TestCases;

import org.testng.annotations.Test;

public class CheckOutPageTestCase extends BaseClass
{
 @Test (priority=1,enabled=false)
 public void verifyCancel()
 {
	 cp.doCancel();
 }
 
 @Test (priority=2)
 public void verifycheckout()
 {
	 cp.docheckout("Mohd", "Junaid", "443101");
	 System.out.println("after Checkout we are on Overview Page");
 }
 
 
 
}
