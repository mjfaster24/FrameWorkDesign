package com.SwagLab.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class InventoryPage 
{
private WebDriver d;
//inialization
public InventoryPage(WebDriver d)
{
	this.d=d;
	
}

private  By totalProducts=By.xpath("//div[@class='inventory_item_name']");
private By productname=By.xpath("//div[@class='inventory_item_name']");
private By AddtoCartbutton=By.xpath("//button[text()='Add to cart']");

//Method

public int getTotalProductCount()
{
	int count=d.findElements(totalProducts).size();
	return count;
}

public void getProductName()
{
	List<WebElement> AllProducts=d.findElements(productname);

	System.out.println("*******Product Name Are********");

	for(WebElement i:AllProducts)
	{
		System.out.println(i.getText());
	}
}
	public void addProductToCart(String pname)
	{
		List<WebElement> AllProducts=d.findElements(productname);
		for(WebElement i:AllProducts)
		{
			if(i.getText().contains("pname"))
			{
				i.click();
				break;
			}
		}
		d.findElement(AddtoCartbutton).click();
		System.out.println("Selected Product Added To Cart!");
		
	}




}
