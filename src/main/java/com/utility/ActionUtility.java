package com.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.base.BaseClass;

public class ActionUtility extends BaseClass  {

	public void typeIn(WebElement element,String text)
	{
		element.sendKeys(text);
	}
	
	public void click(WebElement element)
	{
		element.click();
	}
	
	public void dropAndDown(WebElement source,WebElement target)
	{
		Actions act=new Actions(driver);
		act.dragAndDrop(source, target).perform();
	}
	
	public void moveAndClickElement(WebElement element)
	{
		Actions act=new Actions(driver);
		act.moveToElement(element).click().build().perform();
	}
	
	public WebElement getElement(String loctype,String locvalue )
	{
		if(loctype.equals("xpath"))
			return driver.findElement(By.xpath(locvalue));
		if(loctype.equals("id"))
			return driver.findElement(By.xpath(locvalue));
		if(loctype.equals("cssSelector"))
			return driver.findElement(By.xpath(locvalue));
		if(loctype.equals("linkText"))
			return driver.findElement(By.xpath(locvalue));
		if(loctype.equals("name"))
			return driver.findElement(By.xpath(locvalue));
		if(loctype.equals("tagName"))
			return driver.findElement(By.xpath(locvalue));
		return null;
	}
	
	public void switchToWindow(String id)
	{
		driver.switchTo().window(id);
	}
}

